package stringmethods.urlmanager;

public class UrlManager {

    private String protocol;
    private String host;
    private Integer port;
    private String path;
    private String query;

    public UrlManager(String url) {
        setUrl(url);
    }

    public String getUrl() {
        StringBuilder sb = new StringBuilder(protocol + "://" + host);
        if (port >= 0) sb.append(':').append(port);
        if (!path.isEmpty()) sb.append('/').append(path);
        if (!query.isEmpty()) sb.append('?').append(query);
        return sb.toString();
    }

    public void setUrl(String url) throws IllegalStateException {
        protocol = extractProtocolFromUrl(url);
        if (protocol.isEmpty()) throw new IllegalStateException("URL illegal protocol");
        host = extractHostFromUrl(url);
        if (host.isEmpty()) throw new IllegalStateException("URL illegal host");
        port = extractPortFromUrl(url);
        path = extractPathFromUrl(url);
        query = extractQueryFromUrl(url);
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public Integer getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public boolean hasProperty(String key) {
        if (query.isEmpty()) return false;
        return query.contains(key);
    }

    public String getProperty(String key) {
        if (query.isEmpty()) return "";

        int startIndex = query.indexOf(key + '=');
        if (startIndex < 0) return "";
        startIndex += key.length() + 1;
        if (startIndex >= query.length()) return "";

        int endIndex = query.indexOf('&');
        if (endIndex > startIndex) return query.substring(startIndex, endIndex);

        return query.substring(startIndex);
    }

    private String extractProtocolFromUrl(String url) {
        int endIndex = url.indexOf("://");
        if (endIndex < 1) return "";

        return url.substring(0, endIndex).trim();
    }

    private String extractHostFromUrl(String url) {
        int startIndex = url.indexOf("://") + 3;
        if (startIndex < 3) return "";

        int endIndex = url.indexOf(':', startIndex);
        if (endIndex > startIndex) return url.substring(startIndex, endIndex);

        endIndex = url.indexOf('/', startIndex);
        if (endIndex > startIndex) return url.substring(startIndex, endIndex);

        endIndex = url.indexOf('?', startIndex);
        if (endIndex > startIndex) return url.substring(startIndex, endIndex);

        return url.substring(startIndex).trim();
    }

    private int extractPortFromUrl(String url) {
        int startIndex = url.indexOf("://") + 3;
        if (startIndex < 3) return -1;
        startIndex = url.indexOf(":", startIndex) + 1;
        if (startIndex < 1) return -1;

        int endIndex = -1;
        for (int i = startIndex; i < url.length(); i++) {
            if (!Character.isDigit(url.charAt(i))) {
                endIndex = i;
                break;
            }
        }
        if (endIndex <= startIndex) return -1;

        return Integer.parseInt(url.substring(startIndex, endIndex));
    }

    private String extractPathFromUrl(String url) {
        int startIndex = url.indexOf("://") + 3;
        if (startIndex < 3) return "";
        startIndex = url.indexOf("/", startIndex) + 1;
        if (startIndex < 1) return "";

        int endIndex = url.indexOf('?', startIndex);
        if (endIndex > startIndex) return url.substring(startIndex, endIndex);

        return url.substring(startIndex).trim();
    }

    private String extractQueryFromUrl(String url) {
        int startIndex = url.indexOf("?") + 1;
        if (startIndex < 1) return "";

        return url.substring(startIndex).trim();
    }
}
