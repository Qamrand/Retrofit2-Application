package com.example.retroift2application.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class AtmData implements Serializable {

    @SerializedName("devices")
    @Expose
    private List<AtmDevice> mAtmDevices = null;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("city")
    @Expose
    private String city;
    private final static long serialVersionUID = -1751131371325279670L;

    public List<AtmDevice> getAtmDevices() {
        return mAtmDevices;
    }

    public void setAtmDevices(List<AtmDevice> atmDevices) {
        this.mAtmDevices = atmDevices;
    }

    public AtmData withDevices(List<AtmDevice> atmDevices) {
        this.mAtmDevices = atmDevices;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AtmData withAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public AtmData withCity(String city) {
        this.city = city;
        return this;
    }

}