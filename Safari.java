package org.testleaf.week3.day2;

public class Safari extends Browser {
    public Safari(String browserName, String browserVersion) {
        super(browserName, browserVersion);
    }
    public void readerMode() {
        System.out.println("Safari reader mode enabled");
    }
    public void fullScreenMode() {
        System.out.println("Safarifull screen mode enabled");
    }

}
