package ru.highcode.jseolib.model;

import com.google.gson.annotations.SerializedName;

public class ProjectInfo {
    public long id;
    public String domain;
    public String name;
    @SerializedName("last_position_refresh")
    public PositionRefresh lastPositionRefresh;
    @SerializedName("first_position_refresh")
    public PositionRefresh firstPositionRefresh;

    @Override
    public String toString() {
        return "ProjectInfo [id=" + id + ", domain=" + domain + ", name=" + name + ", lastPositionRefresh="
                + lastPositionRefresh + ", firstPositionRefresh=" + firstPositionRefresh + "]";
    }

}
