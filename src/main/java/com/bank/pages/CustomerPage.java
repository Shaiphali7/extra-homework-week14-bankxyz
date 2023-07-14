package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {
    By logOut=By.xpath("//button[contains(text(),'Logout')]");
    By logOutDropDown=By.xpath("//option[contains(text(),'---Your Name---')]");
    public String getTextFromLogoutButton()
    {
        return gettextFromElement(logOut);
    }
    public void clickOnLogout()
    {
        clickOnElement(logOut);
    }
    public String getTextFromLogOutDropDown()
    {
        return gettextFromElement(logOutDropDown);
    }


}
