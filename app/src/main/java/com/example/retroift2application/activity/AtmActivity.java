package com.example.retroift2application.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.retroift2application.R;
import com.example.retroift2application.pojo.AtmDevice;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AtmActivity extends AppCompatActivity {

    public static final String EXTRA_ATM_DATA = "Atm data";

    @BindView(R.id.text_view_city)
    TextView cityTextView;

    @BindView(R.id.text_view_place)
    TextView placeTextView;

    @BindView(R.id.text_view_address)
    TextView addressTextView;

    @BindView(R.id.text_view_work_time)
    TextView workTimeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm);
        ButterKnife.bind(this);

        //get AtmDevice object from intent
        AtmDevice atmDevice = (AtmDevice) getIntent().getSerializableExtra(EXTRA_ATM_DATA);

        if(atmDevice != null) {
            cityTextView.setText(atmDevice.getCityRU());
            placeTextView.setText(atmDevice.getPlaceRu());
            addressTextView.setText(atmDevice.getFullAddressRu());
            workTimeTextView.setText(atmDevice.getAtmTimeWork().toString());
        }
    }
}