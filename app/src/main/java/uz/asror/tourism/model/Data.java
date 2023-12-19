package uz.asror.tourism.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Data  implements Serializable {

    private String name;
    private int picture;
    private String description;
    private String weatherConditions;
    private String accommodationNearby;
    private String shopNearby;

    public Data(String name, int picture, String description, String weatherConditions, String accommodationNearby, String shopNearby) {
        this.name = name;
        this.picture = picture;
        this.description = description;
        this.weatherConditions = weatherConditions;
        this.accommodationNearby = accommodationNearby;
        this.shopNearby = shopNearby;
    }

    protected Data(Parcel in) {
        name = in.readString();
        picture = in.readInt();
        description = in.readString();
        weatherConditions = in.readString();
        accommodationNearby = in.readString();
        shopNearby = in.readString();
    }

    // Custom serialization method
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeObject(name);
        out.writeInt(picture);
        out.writeObject(description);
        out.writeObject(weatherConditions);
        out.writeObject(accommodationNearby);
        out.writeObject(shopNearby);
    }

    // Custom deserialization method
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        picture = in.readInt();
        description = (String) in.readObject();
        weatherConditions = (String) in.readObject();
        accommodationNearby = (String) in.readObject();
        shopNearby = (String) in.readObject();
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
    public String getShopNearby() {
        return shopNearby;
    }

    public void setShopNearby(String shopNearby) {
        this.shopNearby = shopNearby;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", picture=" + picture +
                ", description='" + description + '\'' +
                ", weatherConditions='" + weatherConditions + '\'' +
                ", accommodationNearby='" + accommodationNearby + '\'' +
                ", shopNearby='" + shopNearby + '\'' +
                '}';
    }



}
