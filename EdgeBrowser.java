package org.testleaf.week2.day1;

public class EdgeBrowser {

    public static void main(String[] args) {

        // Creating object of Browser class
        Browser browser = new Browser();

        browser.launchBrowser("edge");
        browser.loadUrl();
    }

    private static class Browser {
        void launchBrowser(String browserName) {
            System.out.println("Launching " + browserName);
        }

        void loadUrl() {
            System.out.println("Loading URL");
        }
    }
}


