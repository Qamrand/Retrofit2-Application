package com.example.retroift2application.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

public class AtmDevice implements Serializable
{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("tw")
    @Expose
    private AtmTimeWork mAtmTimeWork;
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
    @SerializedName("cityRU")
    @Expose
    private String cityRU;
    @SerializedName("cityUA")
    @Expose
    private String cityUA;
    @SerializedName("cityEN")
    @Expose
    private String cityEN;
    private final static long serialVersionUID = 5243860607802477464L;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AtmDevice withType(String type) {
        this.type = type;
        return this;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public AtmDevice withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public AtmDevice withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public AtmTimeWork getAtmTimeWork() {
        return mAtmTimeWork;
    }

    public void setAtmTimeWork(AtmTimeWork atmTimeWork) {
        this.mAtmTimeWork = atmTimeWork;
    }

    public AtmDevice withTw(AtmTimeWork atmTimeWork) {
        this.mAtmTimeWork = atmTimeWork;
        return this;
    }

    public String getFullAddressRu() {
        return fullAddressRu;
    }

    public void setFullAddressRu(String fullAddressRu) {
        this.fullAddressRu = fullAddressRu;
    }

    public AtmDevice withFullAddressRu(String fullAddressRu) {
        this.fullAddressRu = fullAddressRu;
        return this;
    }

    public String getFullAddressUa() {
        return fullAddressUa;
    }

    public void setFullAddressUa(String fullAddressUa) {
        this.fullAddressUa = fullAddressUa;
    }

    public AtmDevice withFullAddressUa(String fullAddressUa) {
        this.fullAddressUa = fullAddressUa;
        return this;
    }

    public String getFullAddressEn() {
        return fullAddressEn;
    }

    public void setFullAddressEn(String fullAddressEn) {
        this.fullAddressEn = fullAddressEn;
    }

    public AtmDevice withFullAddressEn(String fullAddressEn) {
        this.fullAddressEn = fullAddressEn;
        return this;
    }

    public String getPlaceRu() {
        return placeRu;
    }

    public void setPlaceRu(String placeRu) {
        this.placeRu = placeRu;
    }

    public AtmDevice withPlaceRu(String placeRu) {
        this.placeRu = placeRu;
        return this;
    }

    public String getPlaceUa() {
        return placeUa;
    }

    public void setPlaceUa(String placeUa) {
        this.placeUa = placeUa;
    }

    public AtmDevice withPlaceUa(String placeUa) {
        this.placeUa = placeUa;
        return this;
    }

    public String getCityRU() {
        return cityRU;
    }

    public void setCityRU(String cityRU) {
        this.cityRU = cityRU;
    }

    public AtmDevice withCityRU(String cityRU) {
        this.cityRU = cityRU;
        return this;
    }

    public String getCityUA() {
        return cityUA;
    }

    public void setCityUA(String cityUA) {
        this.cityUA = cityUA;
    }

    public AtmDevice withCityUA(String cityUA) {
        this.cityUA = cityUA;
        return this;
    }

    public String getCityEN() {
        return cityEN;
    }

    public void setCityEN(String cityEN) {
        this.cityEN = cityEN;
    }

    public AtmDevice withCityEN(String cityEN) {
        this.cityEN = cityEN;
        return this;
    }

    @NotNull
    @Override
    public String toString() {
        return "Device{" +
                "type='" + type + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", tw=" + mAtmTimeWork +
                ", fullAddressRu='" + fullAddressRu + '\'' +
                ", fullAddressUa='" + fullAddressUa + '\'' +
                ", fullAddressEn='" + fullAddressEn + '\'' +
                ", placeRu='" + placeRu + '\'' +
                ", placeUa='" + placeUa + '\'' +
                ", cityRU='" + cityRU + '\'' +
                ", cityUA='" + cityUA + '\'' +
                ", cityEN='" + cityEN + '\'' +
                '}';
    }
}