package org.testleaf.week3.day2;

public class Chrome  extends Browser {
    public Chrome(String browserName, String browserVersion) {
        super(browserName, browserVersion);
    }
    public void openIncognito() {
        System.out.println("Chrome opened in incognito mode");
    }
    public void clearCache() {
        System.out.println("Chrome cache cleared");
    }
    

}
