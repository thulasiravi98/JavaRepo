package org.testleaf.week2.day1;

public class BrowserName {
    public String launchBrowser(String browserName){
        System.out.println(browserName + " launched successfully");
        return browserName;
    }
    public void loadUrl(){
        System.out.println("Application url loaded successfully");
    }
    public static void main(String[] args) {
        BrowserName obj = new BrowserName();
        String name = obj.launchBrowser("chrome");
        System.out.println("Launched Browser: " + name);
        obj.loadUrl();
    }
}

