package com.example.retroift2application.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retroift2application.MyApplication;
import com.example.retroift2application.R;
import com.example.retroift2application.adapter.Adapter;
import com.example.retroift2application.api.PrivatbankAtmApi;
import com.example.retroift2application.pojo.AtmData;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.HttpUrl;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MAIN_ACTIVITY_TAG";

    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private PrivatbankAtmApi mPrivatbankAtmApi;

    @BindView(R.id.ac_city)
    AutoCompleteTextView mAutoCompleteTextView;

    @BindView(R.id.search_button)
    Button mSearchButton;

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    @Inject
    Retrofit mRetrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //AutoCompleteTextView init
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.cities));
        mAutoCompleteTextView.setAdapter(arrayAdapter);

        //Dagger init
        MyApplication.getAppComponent().inject(this);

        //Retrofit init
        mPrivatbankAtmApi = mRetrofit.create(PrivatbankAtmApi.class);

        //RecyclerView init
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(
                mRecyclerView.getContext(),
                linearLayoutManager.getOrientation());
        mRecyclerView.addItemDecoration(itemDecoration);

    }


    public void onClickSearchButton(View view) {
        String city = mAutoCompleteTextView.getText().toString();
        if(!city.equals("")) {
            fetchData(city);
        }
    }

    private void fetchData(String city) {

            HttpUrl url = HttpUrl
                    .parse("https://api.privatbank.ua/p24api/infrastructure?json&atm&address=&city=" + city);

            compositeDisposable.add(mPrivatbankAtmApi.getAtmDataByCity(url.toString())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(atmData -> {
                        Log.d(TAG,"" + atmData.toString());
                        displayData(atmData);
                    }, throwable -> {
                        Toast.makeText(getApplicationContext(), "ERROR", Toast.LENGTH_SHORT).show();
                        throwable.printStackTrace();
                    }));

    }


    private void displayData(AtmData data) {
        Adapter adapter = new Adapter(this, data.getAtmDevices());
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        compositeDisposable.clear();
    }
}