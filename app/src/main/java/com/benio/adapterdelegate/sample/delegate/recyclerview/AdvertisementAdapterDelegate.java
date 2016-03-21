package com.benio.adapterdelegate.sample.delegate.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.benio.adapterdelegate.AdapterDelegate;
import com.benio.adapterdelegate.interf.DataProvider;
import com.benio.adapterdelegate.sample.R;
import com.benio.adapterdelegate.sample.model.Advertisement;

/**
 * Created by benio on 2016/3/2.
 */
public class AdvertisementAdapterDelegate extends AdapterDelegate<RecyclerView.ViewHolder> {

    public AdvertisementAdapterDelegate(DataProvider dataProvider, int viewType) {
        super(dataProvider, viewType);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_advertisement, parent, false);
        return new AdvertisementViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(int position, RecyclerView.ViewHolder holder) {

    }

    @Override
    public boolean isForViewType(int position) {
        return getItem(position) instanceof Advertisement;
    }

    /**
     * The ViewHolder
     */
    static class AdvertisementViewHolder extends RecyclerView.ViewHolder{
        public AdvertisementViewHolder(View itemView) {
            super(itemView);
        }
    }
}
