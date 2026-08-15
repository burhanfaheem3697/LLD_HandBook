package com.example.GeoLocation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeoLocationTest{
    private GeoLocation geoLocation;

    @BeforeEach
    void setup(){
        geoLocation = new GeoLocation(80.0,175.0);
    }

    @Test
    void testEqualGeolocation(){
        GeoLocation geoLocation2 = new GeoLocation(80.0,175.0);
        assertEquals(geoLocation, geoLocation2);
    }

    @Test
    void testInvalidLatitudeThrowsException(){
        assertThrows(IllegalArgumentException.class,() -> new GeoLocation(95.0,100.0));
    }

    @Test
    void testForLatitude(){
        assertEquals(80.0,geoLocation.latitude(),0.001);
    }
}