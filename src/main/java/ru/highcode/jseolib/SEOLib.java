package ru.highcode.jseolib;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SEOLib {
    private final String URL_PREFIX = "https://api.seolib.ru/v1/";
    private final String token;
    private Format format = Format.json;
    private final int timeout = 5 * 1000;


    public SEOLib(String token) {
        this.token = token;
    }

    public ProjectList projectLists() throws IOException {
        final String url = makeUrl("project/list");
        final URLConnection connection = new URL(url).openConnection();
        setupSSL((HttpsURLConnection) connection);
        connection.setConnectTimeout(timeout);
        final ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(connection.getInputStream(), ProjectList.class);
    }

    public void projectProjectInfo(long projectId) throws IOException {
        final Map<String, String> params = new HashMap<>();
        params.put("project_id", String.valueOf(projectId));
        final String url = makeUrl("project/projectinfo", params);
        final URLConnection connection = new URL(url).openConnection();
        setupSSL((HttpsURLConnection) connection);
        connection.setConnectTimeout(timeout);
        try (Scanner s = new Scanner(connection.getInputStream())) {
            s.forEachRemaining(e -> {
                System.out.println(e);
            });
        }
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
        return makeUrl(api, new HashMap<>());
    }

    private String makeUrl(String api, Map<String, String> params) {
        final StringBuilder sb = new StringBuilder();
        sb.append(URL_PREFIX).append(api).append(".").append(format.name()).append("?");
        params.put("access_token", token);
        params.put("format", format.name());
        final String paramString = params.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue())
                .reduce((a, b) -> String.join("&", a, b))
                .orElse("");
        sb.append(paramString);

        return sb.toString();
    }

    // TODO: project/regions
    enum Format {
        jsonp, json, xml, rss, html;
    }

    private static final TrustManager[] TRUST_ALL_CERTS = new TrustManager[] { new X509TrustManager() {
        @Override
        public void checkClientTrusted(final X509Certificate[] chain, final String authType) {
            // no-op
        }

        @Override
        public void checkServerTrusted(final X509Certificate[] chain, final String authType) {
            // no-op
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    } };

    private void setupSSL(HttpsURLConnection connection) throws IOException {
        try {
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, TRUST_ALL_CERTS, new java.security.SecureRandom());
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
            connection.setSSLSocketFactory(sslSocketFactory);
        } catch (final Exception e) {
            throw new IOException(e);
        }

    }
}
