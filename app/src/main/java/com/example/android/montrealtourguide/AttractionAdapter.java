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
        if(currentAttraction.hasImage()) iconImageView.setImageResource(currentAttraction.getImageResourceID());
        else iconImageView.setVisibility(View.GONE);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentAttraction.getName());

        TextView streetTextView = (TextView) listItemView.findViewById(R.id.street);
        if (currentAttraction.hasStreet()) streetTextView.setText(currentAttraction.getStreet());
        else streetTextView.setVisibility(View.GONE);

        TextView cityTextView = (TextView) listItemView.findViewById(R.id.city);
        if (currentAttraction.hasCity()) cityTextView.setText(currentAttraction.getCity());
        else cityTextView.setVisibility(View.GONE);

        TextView postalCodeTextView = (TextView) listItemView.findViewById(R.id.postalCode);
        if (currentAttraction.hasPostalCode()) postalCodeTextView.setText(currentAttraction.getPostalCode());
        else postalCodeTextView.setVisibility(View.GONE);

        TextView datesTextView = (TextView) listItemView.findViewById(R.id.dates);
        if (currentAttraction.hasDates()) datesTextView.setText(currentAttraction.getDates());
        else datesTextView.setVisibility(View.GONE);

        return listItemView;
    }
}
