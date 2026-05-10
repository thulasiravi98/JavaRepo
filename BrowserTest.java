package org.testleaf.week3.day2;

public class BrowserTest {
    public static void main(String[] args) {
        Chrome chrome = new Chrome("Google Chrome", "v114");
        chrome.openURL();
        chrome.openIncognito();
        chrome.clearCache();
        chrome.navigateBack();
        chrome.closeBrowser();
        System.out.println();
        Edge edge = new Edge("Microsoft Edge", "v114");
        edge.openURL();
        edge.takeSnap();
        edge.clearCookies();
        edge.navigateBack();
        edge.closeBrowser();
        System.out.println();
        Safari safari = new Safari("Apple Safari", "v15");
        safari.openURL();
        safari.readerMode();
        safari.fullScreenMode();
        safari.navigateBack();
        safari.closeBrowser();
    }
}
