package example.mindorks.https.demo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SampleResponse {

    @SerializedName("args")
    @Expose
    private Args args;
    @SerializedName("headers")
    @Expose
    private Headers headers;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("url")
    @Expose
    private String url;

    public Args getArgs() {
        return args;
    }

    public void setArgs(Args args) {
        this.args = args;
    }

    public Headers getHeaders() {
        return headers;
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "SampleResponse{" +
                "args=" + args +
                ", headers=" + headers +
                ", origin='" + origin + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public static class Args {


        @Override
        public String toString() {
            return "Args{}";
        }
    }

    public static class Headers {

        @SerializedName("Accept")
        @Expose
        private String accept;
        @SerializedName("Accept-Encoding")
        @Expose
        private String acceptEncoding;
        @SerializedName("Accept-Language")
        @Expose
        private String acceptLanguage;
        @SerializedName("Connection")
        @Expose
        private String connection;
        @SerializedName("Cookie")
        @Expose
        private String cookie;
        @SerializedName("Host")
        @Expose
        private String host;
        @SerializedName("Referer")
        @Expose
        private String referer;
        @SerializedName("Upgrade-Insecure-Requests")
        @Expose
        private String upgradeInsecureRequests;
        @SerializedName("User-Agent")
        @Expose
        private String userAgent;

        public String getAccept() {
            return accept;
        }

        public void setAccept(String accept) {
            this.accept = accept;
        }

        public String getAcceptEncoding() {
            return acceptEncoding;
        }

        public void setAcceptEncoding(String acceptEncoding) {
            this.acceptEncoding = acceptEncoding;
        }

        public String getAcceptLanguage() {
            return acceptLanguage;
        }

        public void setAcceptLanguage(String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
        }

        public String getConnection() {
            return connection;
        }

        public void setConnection(String connection) {
            this.connection = connection;
        }

        public String getCookie() {
            return cookie;
        }

        public void setCookie(String cookie) {
            this.cookie = cookie;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getReferer() {
            return referer;
        }

        public void setReferer(String referer) {
            this.referer = referer;
        }

        public String getUpgradeInsecureRequests() {
            return upgradeInsecureRequests;
        }

        public void setUpgradeInsecureRequests(String upgradeInsecureRequests) {
            this.upgradeInsecureRequests = upgradeInsecureRequests;
        }

        public String getUserAgent() {
            return userAgent;
        }

        public void setUserAgent(String userAgent) {
            this.userAgent = userAgent;
        }

        @Override
        public String toString() {
            return "Headers{" +
                    "accept='" + accept + '\'' +
                    ", acceptEncoding='" + acceptEncoding + '\'' +
                    ", acceptLanguage='" + acceptLanguage + '\'' +
                    ", connection='" + connection + '\'' +
                    ", cookie='" + cookie + '\'' +
                    ", host='" + host + '\'' +
                    ", referer='" + referer + '\'' +
                    ", upgradeInsecureRequests='" + upgradeInsecureRequests + '\'' +
                    ", userAgent='" + userAgent + '\'' +
                    '}';
        }
    }
}