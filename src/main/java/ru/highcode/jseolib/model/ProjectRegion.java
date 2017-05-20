package ru.highcode.jseolib.model;

public class ProjectRegion {
    private String id;
    private String code;
    private String countryCode;
    private String name;
    private Domain domain;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "ProjectRegion [code=" + getCode() + ", countryCode=" + getCountryCode() + ", name=" + getName()
                + ", id=" + getId() + ", domain=" + getDomain() + "]";
    }

}
