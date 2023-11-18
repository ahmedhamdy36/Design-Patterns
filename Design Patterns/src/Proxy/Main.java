package Proxy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sites = Arrays.asList("Tesla", "Facebook", "Twitter", "Youtube", "Google");

        InternetServiceProvider isp = new InternetProxy();

        for (String site : sites){
            System.out.println(isp.serveSite(site));
        }
    }
}
