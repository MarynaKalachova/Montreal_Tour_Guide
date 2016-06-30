package com.example.android.montrealtourguide;

import android.view.View;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MuseumAdapter extends ArrayAdapter<Museum> {

    private static final String LOG_TAG = MuseumAdapter.class.getSimpleName();

    public MuseumAdapter(Activity context, ArrayList<Museum> museums) {

        super(context, 0, museums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Museum currentMuseum = getItem(position);

        ImageView iconImageView = (ImageView) listItemView.findViewById(R.id.image);
        iconImageView.setImageResource(currentMuseum.getImageResourceID());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentMuseum.getName());

        TextView streetTextView = (TextView) listItemView.findViewById(R.id.street);
        streetTextView.setText(currentMuseum.getStreet());

        TextView cityTextView = (TextView) listItemView.findViewById(R.id.city);
        cityTextView.setText(currentMuseum.getCity());

        TextView postalCodeTextView = (TextView) listItemView.findViewById(R.id.postalCode);
        postalCodeTextView.setText(currentMuseum.getPostalCode());

        return listItemView;
    }
}
