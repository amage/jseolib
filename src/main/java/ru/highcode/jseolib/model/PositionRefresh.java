package ru.highcode.jseolib.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class PositionRefresh {
    private Date date;
    @SerializedName("timezone_type")
    private int timezoneType;
    @SerializedName("timezone")
    private String timezone;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTimezoneType() {
        return timezoneType;
    }

    public void setTimezoneType(int timezoneType) {
        this.timezoneType = timezoneType;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return "PositionRefresh [date=" + getDate() + ", timezoneType=" + getTimezoneType() + ", timezone="
                + getTimezone() + "]";
    }
}
