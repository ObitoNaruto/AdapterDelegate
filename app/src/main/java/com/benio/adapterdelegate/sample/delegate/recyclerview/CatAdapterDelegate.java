package com.benio.adapterdelegate.sample.delegate.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.benio.adapterdelegate.AdapterDelegate;
import com.benio.adapterdelegate.interf.DataProvider;
import com.benio.adapterdelegate.sample.R;
import com.benio.adapterdelegate.sample.model.Cat;

/**
 * Created by benio on 2016/3/2.
 */
public class CatAdapterDelegate extends AdapterDelegate<RecyclerView.ViewHolder> {

    public CatAdapterDelegate(DataProvider dataProvider, int viewType) {
        super(dataProvider, viewType);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cat, parent, false);
        return new CatViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(int position, RecyclerView.ViewHolder holder) {
        TextView textView = ((CatViewHolder) holder).name;
        Cat cat = (Cat) getItem(position);
        textView.setText(cat.getName());
    }

    @Override
    public boolean isForViewType(int position) {
        return getItem(position) instanceof Cat;
    }

    static class CatViewHolder extends RecyclerView.ViewHolder {

        public TextView name;

        public CatViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
