package Proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider {
    private final List<String> blockedSites = Arrays.asList("Facebook", "Twitter", "Youtube");

    @Override
    public String serveSite(String url) {
        internetLog(url);

        if (blockedSites.contains(url)) {
            return "this website is blocked!";
        }
        return new Vodafone().serveSite(url);
    }
    private void internetLog(String url) {
        System.out.printf("[%d] -> %s requested \n", System.currentTimeMillis(), url);
    }
}