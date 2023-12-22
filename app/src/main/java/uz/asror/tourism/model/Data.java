package uz.asror.tourism.model;

import android.os.Parcel;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Data implements Serializable {

    private String name;
    private int picture;
    private String description;
    private String weatherConditions;
    private String accommodationNearby;
    private String accommodationNearby1;
    private String shopNearby;
    private String shopNearby1;

    public Data(String name, int picture, String description, String weatherConditions, String accommodationNearby, String accommodationNearby1, String shopNearby, String shopNearby1) {
        this.name = name;
        this.picture = picture;
        this.description = description;
        this.weatherConditions = weatherConditions;
        this.accommodationNearby = accommodationNearby;
        this.accommodationNearby1 = accommodationNearby1;
        this.shopNearby = shopNearby;
        this.shopNearby1 = shopNearby1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeatherConditions() {
        return weatherConditions;
    }

    public void setWeatherConditions(String weatherConditions) {
        this.weatherConditions = weatherConditions;
    }

    public String getAccommodationNearby() {
        return accommodationNearby;
    }

    public void setAccommodationNearby(String accommodationNearby) {
        this.accommodationNearby = accommodationNearby;
    }

    public String getAccommodationNearby1() {
        return accommodationNearby1;
    }

    public void setAccommodationNearby1(String accommodationNearby1) {
        this.accommodationNearby1 = accommodationNearby1;
    }

    public String getShopNearby() {
        return shopNearby;
    }

    public void setShopNearby(String shopNearby) {
        this.shopNearby = shopNearby;
    }

    public String getShopNearby1() {
        return shopNearby1;
    }

    public void setShopNearby1(String shopNearby1) {
        this.shopNearby1 = shopNearby1;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", picture=" + picture +
                ", description='" + description + '\'' +
                ", weatherConditions='" + weatherConditions + '\'' +
                ", accommodationNearby='" + accommodationNearby + '\'' +
                ", accommodationNearby1='" + accommodationNearby1 + '\'' +
                ", shopNearby='" + shopNearby + '\'' +
                ", shopNearby1='" + shopNearby1 + '\'' +
                '}';
    }
}
