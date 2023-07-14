package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OpenAccountPage extends Utility {

    By customerName=By.xpath("//select[@id='userSelect']");
    By customerName1=By.xpath("//option[@ng-repeat='cust in Customers']");
    By customerNameClick=By.xpath("//select[@id='userSelect']");
    By currency=By.xpath("//select[@id='currency']");

    By processButton=By.xpath("//button[contains(text(),'Process')]");
    public void selectFromCustomerDropDwn(String option) {
        clickOnElement(customerNameClick);
        try {
            List<WebElement> userManagementList = driver.findElements(customerName1);
            for (WebElement element :userManagementList ) {
                if (element.getText().equals(option)) {
                    element.click();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectCustomerName(String option)
    {
        selectByVisibleTextFromDropDown(customerName,option);
    }

    public void selectCurrency(String option)
    {
        selectByVisibleTextFromDropDown(currency,option);
    }
    public void clickOnProcessButton()
    {
        clickOnElement(processButton);
    }

}
