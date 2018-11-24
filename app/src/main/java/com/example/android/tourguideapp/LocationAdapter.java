package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    private int mLocationImageID;

    public LocationAdapter(Context context, ArrayList<Location> locations, int locationImageID)
    {
        super(context, 0, locations);
        mLocationImageID = locationImageID;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
        Location currentLocationDescription = getItem(position);

        TextView greeceNameTextView = listItemView.findViewById(R.id.greece_text_view);
        greeceNameTextView.setText(currentLocationDescription.getLocationName());
//        greeceTextView.setText(currentLocationDescription);

        TextView greeceDescriptionView = listItemView.findViewById(R.id.greece_description);
        greeceDescriptionView.setText((currentLocationDescription.getLocationDescription()));


        // Find the ImageView in the xml layout with the ID image.
        ImageView greeceImageView = listItemView.findViewById(R.id.default_image_view);
        if(currentLocationDescription.hasimage())
        {
            //If image is available, display image based on resource id
            greeceImageView.setImageResource(currentLocationDescription.getImageResourceID());
            //Make sure the view is visible
            greeceImageView.setVisibility(View.VISIBLE);
        }else{
            greeceImageView.setVisibility(View.GONE);
        }


        View textContainer = listItemView.findViewById(R.id.greece_container);
        int color = ContextCompat.getColor(getContext(), mLocationImageID);
        textContainer.setBackgroundColor(color);

        return listItemView;

    }

}
