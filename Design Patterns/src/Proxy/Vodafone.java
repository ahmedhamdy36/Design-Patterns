package Proxy;

public class Vodafone implements InternetServiceProvider {
    private final int browsingSpeed = 30;

    @Override
    public String serveSite(String url) {
        return String.format("https://%s.com", url);
    }

    public int getBrowsingSpeed() {
        return browsingSpeed;
    }
}