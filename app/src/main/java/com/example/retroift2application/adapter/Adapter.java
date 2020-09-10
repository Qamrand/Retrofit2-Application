package com.example.retroift2application.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retroift2application.R;
import com.example.retroift2application.activity.AtmActivity;
import com.example.retroift2application.pojo.AtmDevice;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context mContext;
    private List<AtmDevice> mDeviceList;

    public Adapter(Context context, List<AtmDevice> data) {
        mDeviceList = data;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.item_place, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mPlace.setText(mDeviceList.get(position).getPlaceRu());

        holder.mPlace.setOnClickListener(click -> {
            Intent intent = new Intent(mContext, AtmActivity.class);
            intent.putExtra(AtmActivity.EXTRA_ATM_DATA, mDeviceList.get(position));
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return mDeviceList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.place_item)
        TextView mPlace;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
