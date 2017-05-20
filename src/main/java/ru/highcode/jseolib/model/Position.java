package ru.highcode.jseolib.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Position {
    @SerializedName("project_id")
    private String projectId;
    private Date date;
    private String frequency;
    private String keyword;
    private String engine;
    private String region;
    private String position;

    /* Not JSON fields */
    private String source;
    private String regionId;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public String toString() {
        return "Position [projectId=" + projectId + ", date=" + date + ", frequency=" + frequency + ", keyword="
                + keyword + ", engine=" + engine + ", region=" + region + ", position=" + position + ", source="
                + source + ", regionId=" + regionId + "]";
    }

}
