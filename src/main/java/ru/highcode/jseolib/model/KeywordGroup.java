package ru.highcode.jseolib.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class KeywordGroup {
    private String name;
    @SerializedName("project_group_id")
    private long projectGroupId;
    private int sort;
    private List<Keyword> keywords;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public List<Keyword> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

    public long getProjectGroupId() {
        return projectGroupId;
    }

    public void setProjectGroupId(long projectGroupId) {
        this.projectGroupId = projectGroupId;
    }

    @Override
    public String toString() {
        return "KeywordGroup [name=" + getName() + ", projectGroupId=" + getProjectGroupId() + ", sort=" + getSort()
                + ", keywords=" + getKeywords() + "]";
    }
}
