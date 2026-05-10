package org.testleaf.week3.day2;

public class Edge extends Browser {
public Edge(String browserName, String browserVersion) {
    super(browserName, browserVersion);
}
public void takeSnap() {
    System.out.println("Edge took a snap");

}
public void clearCookies() {
    System.out.println("Edge cookies cleared");
}

}

