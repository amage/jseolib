package ru.highcode.jseolib;

import java.util.Collections;
import java.util.Map;

public class SEOLib {
    private final String URL_PREFIX = "https://api.seolib.ru/v1/";
    private final String token;
    private Format format = Format.json;

    public SEOLib(String token) {
        this.token = token;
    }

    // project/list
    public void projectLists() {
        final String url = makeUrl("project/list");
        // TODO get data, return it somehow
    }

    // project/projectinfo
    public void projectProjectInfo() {
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    // TODO: links/data/create
    // TODO: links/data/get
    // TODO: project/creates
    // TODO: project/history/positions/by/date
    // TODO: project/history/positions/by/daterange
    // TODO: project/list/keyword/groups

    private String makeUrl(String api) {
        return makeUrl(api, Collections.emptyMap());
    }

    private String makeUrl(String api, Map<String, String> params) {
        // TODO params
        return URL_PREFIX + api + "." + format.name() + "?access_token=" + token + "&format=" + format.name();
    }

    // TODO: project/regions
    enum Format {
        jsonp, json, xml, rss, html;
    }
}
