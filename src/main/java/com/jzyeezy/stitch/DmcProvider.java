package com.jzyeezy.stitch;
import org.jsoup.*;

public class DmcProvider {
    private static final String url = "http://www.camelia.sk/";

    public void scrapeDmcData() {

    }

    private String getPageRoute(int page) {
        return String.format("dmc_%s.htm", Integer.toString(page));
    }
}
