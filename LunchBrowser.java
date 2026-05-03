package org.testleaf.week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowser {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
    }

}
