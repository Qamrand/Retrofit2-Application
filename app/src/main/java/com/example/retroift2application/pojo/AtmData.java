package com.example.retroift2application.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AtmData implements Serializable {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("cityRU")
    @Expose
    private String cityRU;
    @SerializedName("cityUA")
    @Expose
    private String cityUA;
    @SerializedName("cityEN")
    @Expose
    private String cityEN;
    @SerializedName("fullAddressRu")
    @Expose
    private String fullAddressRu;
    @SerializedName("fullAddressUa")
    @Expose
    private String fullAddressUa;
    @SerializedName("fullAddressEn")
    @Expose
    private String fullAddressEn;
    @SerializedName("placeRu")
    @Expose
    private String placeRu;
    @SerializedName("placeUa")
    @Expose
    private String placeUa;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("tw")
    @Expose
    private String tw;
    private final static long serialVersionUID = 487824075428735316L;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AtmData withType(String type) {
        this.type = type;
        return this;
    }

    public String getCityRU() {
        return cityRU;
    }

    public void setCityRU(String cityRU) {
        this.cityRU = cityRU;
    }

    public AtmData withCityRU(String cityRU) {
        this.cityRU = cityRU;
        return this;
    }

    public String getCityUA() {
        return cityUA;
    }

    public void setCityUA(String cityUA) {
        this.cityUA = cityUA;
    }

    public AtmData withCityUA(String cityUA) {
        this.cityUA = cityUA;
        return this;
    }

    public String getCityEN() {
        return cityEN;
    }

    public void setCityEN(String cityEN) {
        this.cityEN = cityEN;
    }

    public AtmData withCityEN(String cityEN) {
        this.cityEN = cityEN;
        return this;
    }

    public String getFullAddressRu() {
        return fullAddressRu;
    }

    public void setFullAddressRu(String fullAddressRu) {
        this.fullAddressRu = fullAddressRu;
    }

    public AtmData withFullAddressRu(String fullAddressRu) {
        this.fullAddressRu = fullAddressRu;
        return this;
    }

    public String getFullAddressUa() {
        return fullAddressUa;
    }

    public void setFullAddressUa(String fullAddressUa) {
        this.fullAddressUa = fullAddressUa;
    }

    public AtmData withFullAddressUa(String fullAddressUa) {
        this.fullAddressUa = fullAddressUa;
        return this;
    }

    public String getFullAddressEn() {
        return fullAddressEn;
    }

    public void setFullAddressEn(String fullAddressEn) {
        this.fullAddressEn = fullAddressEn;
    }

    public AtmData withFullAddressEn(String fullAddressEn) {
        this.fullAddressEn = fullAddressEn;
        return this;
    }

    public String getPlaceRu() {
        return placeRu;
    }

    public void setPlaceRu(String placeRu) {
        this.placeRu = placeRu;
    }

    public AtmData withPlaceRu(String placeRu) {
        this.placeRu = placeRu;
        return this;
    }

    public String getPlaceUa() {
        return placeUa;
    }

    public void setPlaceUa(String placeUa) {
        this.placeUa = placeUa;
    }

    public AtmData withPlaceUa(String placeUa) {
        this.placeUa = placeUa;
        return this;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public AtmData withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public AtmData withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getTw() {
        return tw;
    }

    public void setTw(String tw) {
        this.tw = tw;
    }

    public AtmData withTw(String tw) {
        this.tw = tw;
        return this;
    }

}