package com.benio.adapterdelegate.sample.delegate.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.benio.adapterdelegate.RecyclerAdapterDelegate;
import com.benio.adapterdelegate.interf.DataProvider;
import com.benio.adapterdelegate.sample.R;
import com.benio.adapterdelegate.sample.model.RecyclerViewHolder;

/**
 * @author Hannes Dorfmann
 */
public class ReptilesFallbackDelegate extends RecyclerAdapterDelegate<RecyclerViewHolder> {

    public ReptilesFallbackDelegate(DataProvider dataProvider, int viewType) {
        super(dataProvider, viewType);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_unknown_reptile, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(int position, RecyclerViewHolder holder) {

    }

    /**
     * As a fallback delegate, return value will be ignored
     */
    @Override
    public boolean isForViewType(int position) {
        return false;
    }
}