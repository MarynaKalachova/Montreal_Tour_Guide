package com.example.android.montrealtourguide;

import android.view.View;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    private static final String LOG_TAG = AttractionAdapter.class.getSimpleName();

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions) {

        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        ImageView iconImageView = (ImageView) listItemView.findViewById(R.id.image);
        iconImageView.setImageResource(currentAttraction.getImageResourceID());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentAttraction.getName());

        TextView streetTextView = (TextView) listItemView.findViewById(R.id.street);
        streetTextView.setText(currentAttraction.getStreet());

        TextView cityTextView = (TextView) listItemView.findViewById(R.id.city);
        cityTextView.setText(currentAttraction.getCity());

        TextView postalCodeTextView = (TextView) listItemView.findViewById(R.id.postalCode);
        postalCodeTextView.setText(currentAttraction.getPostalCode());

        TextView datesTextView = (TextView) listItemView.findViewById(R.id.dates);
        datesTextView.setText(currentAttraction.getDates());

        return listItemView;
    }
}
