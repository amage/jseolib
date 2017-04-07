package ru.highcode.jseolib.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class PositionRefresh {
    public Date date;
    @SerializedName("timezone_type")
    public int timezoneType;
    @SerializedName("timezone")
    public String timezone;

    @Override
    public String toString() {
        return "PositionRefresh [date=" + date + ", timezoneType=" + timezoneType + ", timezone=" + timezone + "]";
    }
}
