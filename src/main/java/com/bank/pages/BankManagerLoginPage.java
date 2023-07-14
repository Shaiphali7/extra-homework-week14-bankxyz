package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By addCustomer=By.xpath("//button[@ng-click='addCust()']");
    By openAccount=By.xpath("//button[@ng-click='openAccount()']");

    By customers=By.xpath("//button[@ng-click='showCust()']");

    public void clickOnAddCustomer()
    {
        clickOnElement(addCustomer);
    }
    public void clickOnOpenAccount()
    {
        clickOnElement(openAccount);
    }
    public void clickOnCustomers()
    {
        clickOnElement(customers);
    }

}
