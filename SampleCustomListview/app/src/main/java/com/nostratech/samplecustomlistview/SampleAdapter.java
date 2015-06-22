package com.nostratech.samplecustomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nostra on 6/22/15.
 */
public class SampleAdapter extends ArrayAdapter {
    private Context mContext;
    private List<Profile> profileList;
    private LayoutInflater inflater;
    private ViewHolder viewHolder;

    public SampleAdapter(Context mContext, List<Profile> profileList) {
        super(mContext, R.layout.list_item_adapter, profileList);
        this.mContext = mContext;
        this.profileList = profileList;
    }
    //menggunakan viewholder pattern
    class ViewHolder {
        TextView name;
        TextView address;
        TextView email;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final Profile profile = profileList.get(position);
        if (inflater == null)
            inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            //get layout list_item & component
            convertView = inflater.inflate(R.layout.list_item_adapter, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.address = (TextView) convertView.findViewById(R.id.address);
            viewHolder.email = (TextView) convertView.findViewById(R.id.email);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //set value
        viewHolder.name.setText(profile.name);
        viewHolder.email.setText(profile.email);
        viewHolder.address.setText(profile.address);
        return convertView;
    }
}
