package com.example.GeoLocation;

public record GeoLocation(double latitude, double longitude){
    public GeoLocation{
        if(latitude < -90.0 || latitude > 90.0){
            throw new IllegalArgumentException("Latitude must be between -90 and 90");
        }

        if(longitude < -180.0 || longitude > 180.0){
            throw new IllegalArgumentException("Longitude must be between -180 and 180");
        }


    }

    public double distanceTo(GeoLocation other){
        double latDiff = Math.toRadians(other.latitude - this.latitude);
        double longDiff = Math.toRadians(other.longitude - this.longitude);

        return Math.sqrt(latDiff * latDiff + longDiff * longDiff) * 6537.0;
    }
}