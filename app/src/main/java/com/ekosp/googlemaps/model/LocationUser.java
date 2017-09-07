package com.ekosp.googlemaps.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Eko Setyo Purnomo on 06-Sep-17.
 * Find me on https://ekosp.com
 * Or email me directly to ekosetyopurnomo@gmail.com
 */

@IgnoreExtraProperties
public class LocationUser {

    public String longitude;
    public String latitude;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public LocationUser() {
    }

    public LocationUser(String longi ,String lati) {
        this.longitude = longi;
        this.latitude = lati;
    }
}