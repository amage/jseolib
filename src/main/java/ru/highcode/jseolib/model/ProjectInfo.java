package ru.highcode.jseolib.model;

import com.google.gson.annotations.SerializedName;

public class ProjectInfo {
    private long id;
    private String domain;
    private String name;
    @SerializedName("last_position_refresh")
    private PositionRefresh lastPositionRefresh;
    @SerializedName("first_position_refresh")
    private PositionRefresh firstPositionRefresh;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PositionRefresh getLastPositionRefresh() {
        return lastPositionRefresh;
    }

    public void setLastPositionRefresh(PositionRefresh lastPositionRefresh) {
        this.lastPositionRefresh = lastPositionRefresh;
    }

    public PositionRefresh getFirstPositionRefresh() {
        return firstPositionRefresh;
    }

    public void setFirstPositionRefresh(PositionRefresh firstPositionRefresh) {
        this.firstPositionRefresh = firstPositionRefresh;
    }

    @Override
    public String toString() {
        return "ProjectInfo [id=" + getId() + ", domain=" + getDomain() + ", name=" + getName()
                + ", lastPositionRefresh=" + getLastPositionRefresh() + ", firstPositionRefresh="
                + getFirstPositionRefresh() + "]";
    }
}
