package com.example.android.quakereport;

/**
 * Created by Corentin on 07/04/2018.
 */

public class Earthquake {

    private double mag;
    private String place;
    private long time;
    private String url;

    public Earthquake() {
    }

    public Earthquake(double mag, String place, long time, String url) {
        this.mag = mag;
        this.place = place;
        this.time = time;
        this.url = url;
    }

    public double getMag() {
        return mag;
    }

    public void setMag(double mag) {
        this.mag = mag;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
