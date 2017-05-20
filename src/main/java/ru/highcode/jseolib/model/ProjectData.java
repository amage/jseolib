package ru.highcode.jseolib.model;

import com.google.gson.annotations.SerializedName;

public class ProjectData {
    private boolean active;
    private GroupData group;
    private long id;
    private String name;
    private String domain;
    @SerializedName("count_keywords")
    private long countKeywords;

    @Override
    public String toString() {
        return "ProjectData [active=" + isActive() + ", group=" + getGroup() + ", id=" + getId() + ", name=" + getName() + ", domain="
                + getDomain() + ", count_keywords=" + getCountKeywords() + "]";
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public GroupData getGroup() {
        return group;
    }

    public void setGroup(GroupData group) {
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public long getCountKeywords() {
        return countKeywords;
    }

    public void setCountKeywords(long countKeywords) {
        this.countKeywords = countKeywords;
    }

}
