package ru.highcode.jseolib.model;

public class ProjectRegion {
    public String code;
    public String countryCode;
    public String name;
    public String id;
    public Domain domain;

    @Override
    public String toString() {
        return "ProjectRegion [code=" + code + ", countryCode=" + countryCode + ", name=" + name + ", id=" + id
                + ", domain=" + domain + "]";
    }

}
