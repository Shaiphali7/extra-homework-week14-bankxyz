package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By firstName=By.xpath("//input[@placeholder='First Name']");
    By lastName=By.xpath("//input[@placeholder='Last Name']");
    By postCode=By.xpath("//input[@placeholder='Post Code']");
    By addCustomerButton=By.xpath("//button[@type='submit']");

    public void setFirstName(String option)
    {
       sendTextToElement(firstName,option);
    }

    public void setLastName(String option)
    {
        sendTextToElement(lastName,option);
    }
    public void setPostCode(String option)
    {
        sendTextToElement(postCode,option);
    }
    public void clickOnAddCustomerButton()
    {
        clickOnElement(addCustomerButton);
    }

}
