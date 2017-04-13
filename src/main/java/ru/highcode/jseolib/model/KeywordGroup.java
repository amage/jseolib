package ru.highcode.jseolib.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class KeywordGroup {
    public String name;
    @SerializedName("project_group_id")
    public long projectGroupId;
    public int sort;
    public List<Keyword> keywords;

    @Override
    public String toString() {
        return "KeywordGroup [name=" + name + ", projectGroupId=" + projectGroupId + ", sort=" + sort + ", keywords="
                + keywords + "]";
    }
}
