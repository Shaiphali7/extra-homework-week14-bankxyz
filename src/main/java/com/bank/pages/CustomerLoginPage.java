package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By yourName=By.xpath("//select[@id='userSelect']");
    By login=By.xpath("//button[contains(text(),'Login')]");

    public void selectYourName(String option)
    {
        selectByVisibleTextFromDropDown(yourName,option);
    }
    public void clickOnLogin()
    {
        clickOnElement(login);
    }


}
