package org.testleaf.Week4.Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://erail.in");
        WebElement fromtable = driver.findElement(By.id("txtStationFrom"));
        fromtable.clear();
        fromtable.sendKeys("MAS", Keys.ENTER);
        WebElement totable = driver.findElement(By.id("txtStationTo"));
        totable.clear();
        totable.sendKeys("MDU", Keys.ENTER);
         WebElement sortonDate = driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
        if (sortonDate.isSelected()) {
            sortonDate.click();
        }
        List<WebElement> trainElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
        List<String> trainNames = new ArrayList<>();
        List<String> duplicateList = new ArrayList<>();
        for (WebElement eachTrain : trainElements) {
            String trainName = eachTrain.getText();
            System.out.println(trainName);
            trainNames.add(trainName);
        }
        for (int i = 0; i < trainNames.size(); i++) {
            for (int j = i + 1; j < trainNames.size(); j++) {
                if (trainNames.get(i).equals(trainNames.get(j))) {
                    System.out.println(trainNames.get(i));
                    if (!duplicateList.contains(trainNames.get(i))) {
                        duplicateList.add(trainNames.get(i));
                    }
                }
            }
        }
        // Optionally print duplicates
        System.out.println("Duplicate trains: " + duplicateList);
        if (duplicateList.isEmpty()) {
            System.out.println("There are no duplicate train names in the list.");
        } else {
            System.out.println("There are duplicate train names in the list.");
        }
        driver.close();
    }
}
