package com.benio.adapterdelegate.sample.delegate.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.benio.adapterdelegate.AdapterDelegate;
import com.benio.adapterdelegate.interf.DataProvider;
import com.benio.adapterdelegate.sample.R;
import com.benio.adapterdelegate.sample.model.Gecko;
import com.benio.adapterdelegate.sample.model.ListViewHolder;

/**
 * Created by benio on 2016/3/2.
 */
public class GeckoListAdapterDelegate extends AdapterDelegate<ListViewHolder> {

    public GeckoListAdapterDelegate(DataProvider dataProvider, int viewType) {
        super(dataProvider, viewType);
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gecko, parent, false);
        return new ListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(int position, ListViewHolder holder) {
        Gecko gecko = (Gecko) getItem(position);
        TextView nameView = holder.getView(R.id.name);
        TextView raceView = holder.getView(R.id.race);
        nameView.setText(gecko.getName());
        raceView.setText(gecko.getRace());
    }

    @Override
    public boolean isForViewType(int position) {
        return getItem(position) instanceof Gecko;
    }
}
