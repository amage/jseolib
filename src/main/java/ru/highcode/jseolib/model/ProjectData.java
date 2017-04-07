package ru.highcode.jseolib.model;

public class ProjectData {
    public boolean active;
    public GroupData group;
    public long id;
    public String name;
    public String domain;
    public long count_keywords;

    @Override
    public String toString() {
        return "ProjectData [active=" + active + ", group=" + group + ", id=" + id + ", name=" + name + ", domain="
                + domain + ", count_keywords=" + count_keywords + "]";
    }

}
