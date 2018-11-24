package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;

public class Location {

    private String mLocationName;
    private String mLocationDescription;

    private int mImageResourceID = NO_IMG_PROVIDED;
    private static final int  NO_IMG_PROVIDED = -1;

    //Contructor
    public Location(String locationName, String locationDescription)
    {
        mLocationDescription = locationDescription;
        mLocationName = locationName;
    }

    //Second Constructor with Images Needed
    public Location(String locationName, String locationDescription, int ImgResourceID)
    {
        mLocationDescription = locationDescription;
        mLocationName = locationName;
        mImageResourceID = ImgResourceID;
    }

    //Getter Functions
    public String getLocationName() {return mLocationName;}

    public String getLocationDescription() { return mLocationDescription;}

    public int getImageResourceID() { return mImageResourceID;}

    public boolean hasimage() { return mImageResourceID != NO_IMG_PROVIDED;}

}
