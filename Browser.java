package org.testleaf.week3.day2;

public class Browser {
     String browserName;
     String browserVersion;
     Browser(String browserName, String browserVersion){
         this.browserName = browserName;
         this.browserVersion = browserVersion;
     
}
public void openURL() {
    System.out.println(browserName + "is opening the URL");

}
public void closeBrowser() {
    System.out.println(browserName + "browser is closed");
}
public void navigateBack() {
    System.out.println(browserName + "navigated back");
}
}