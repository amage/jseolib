package ru.highcode.jseolib;

import java.util.List;

public class ProjectList {
    public int statusCodes;
    public List<ProjectData> data;

    @Override
    public String toString() {
        return "ProjectList [statusCodes=" + statusCodes + ", data=" + data + "]";
    }

}
