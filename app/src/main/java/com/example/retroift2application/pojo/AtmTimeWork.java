package com.example.retroift2application.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

public class AtmTimeWork implements Serializable {

    @SerializedName("mon")
    @Expose
    public String mon;
    @SerializedName("tue")
    @Expose
    public String tue;
    @SerializedName("wed")
    @Expose
    public String wed;
    @SerializedName("thu")
    @Expose
    public String thu;
    @SerializedName("fri")
    @Expose
    public String fri;
    @SerializedName("sat")
    @Expose
    public String sat;
    @SerializedName("sun")
    @Expose
    public String sun;
    @SerializedName("hol")
    @Expose
    public String hol;
    private final static long serialVersionUID = -5682477465344989791L;

    @NotNull
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Понедельник:   ").append(mon).append("\n");
        sb.append("Вторник:             ").append(tue).append("\n");
        sb.append("Среда:                 ").append(wed).append("\n");
        sb.append("Четверг:             ").append(thu).append("\n");
        sb.append("Пятница:            ").append(fri).append("\n");
        sb.append("Субота:               ").append(sat).append("\n");
        sb.append("Воскресенье:    ").append(sun).append("\n");
        sb.append("Праздники:        ").append(hol).append("\n");

        return sb.toString();
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public AtmTimeWork withMon(String mon) {
        this.mon = mon;
        return this;
    }

    public String getTue() {
        return tue;
    }

    public void setTue(String tue) {
        this.tue = tue;
    }

    public AtmTimeWork withTue(String tue) {
        this.tue = tue;
        return this;
    }

    public String getWed() {
        return wed;
    }

    public void setWed(String wed) {
        this.wed = wed;
    }

    public AtmTimeWork withWed(String wed) {
        this.wed = wed;
        return this;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public AtmTimeWork withThu(String thu) {
        this.thu = thu;
        return this;
    }

    public String getFri() {
        return fri;
    }

    public void setFri(String fri) {
        this.fri = fri;
    }

    public AtmTimeWork withFri(String fri) {
        this.fri = fri;
        return this;
    }

    public String getSat() {
        return sat;
    }

    public void setSat(String sat) {
        this.sat = sat;
    }

    public AtmTimeWork withSat(String sat) {
        this.sat = sat;
        return this;
    }

    public String getSun() {
        return sun;
    }

    public void setSun(String sun) {
        this.sun = sun;
    }

    public AtmTimeWork withSun(String sun) {
        this.sun = sun;
        return this;
    }

    public String getHol() {
        return hol;
    }

    public void setHol(String hol) {
        this.hol = hol;
    }

    public AtmTimeWork withHol(String hol) {
        this.hol = hol;
        return this;
    }
}