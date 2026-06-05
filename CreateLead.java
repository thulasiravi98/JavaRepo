package TestNG;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BasicLead{

    @Test(dataProvider = "fetchData")
    public void runCL(String cName, String fName, String lName) {
        //ChromeDriver driver = new ChromeDriver();
        
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
        driver.findElement(By.name("submitButton")).click();
    }

    @DataProvider(name = "fetchData")
    public String[][] getData() throws IOException {
        String[][] data = CreateExcel.readData();
        return data;
    }
}








