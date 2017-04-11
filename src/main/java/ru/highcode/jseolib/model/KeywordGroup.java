package ru.highcode.jseolib.model;

import com.google.gson.annotations.SerializedName;

public class KeywordGroup {
    public String name;
    @SerializedName("project_group_id")
    public long projectGroupId;
    public int sort;

    @Override
    public String toString() {
        return "KeywordGroup [name=" + name + ", projectGroupId=" + projectGroupId + ", sort=" + sort + "]";
    }

}
