package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By depositButton=By.xpath("//button[@ng-click='deposit()']");

    By withdrawlButton=By.xpath("//button[@ng-click='withdrawl()']");
    By amountToBeDeposit=By.xpath("//input[@placeholder='amount']");
    By depositButtonAfterDeposit=By.xpath("//button[text()='Deposit']");
    By withdrawalButtonAfterWithdrawal=By.xpath("//button[text()='Withdraw']");
    By successMessageAfterDeposit=By.xpath("//span[contains(text(),'Deposit Successful')]");

    By successMessageAfterWithdrawal=By.xpath("//span[contains(text(),'Transaction successful')]");


    public void clickOnDepositButton()
    {
        clickOnElement(depositButton);
    }
    public void clickOnWithdrawalButton()
    {
        clickOnElement(withdrawlButton);
    }
    public void clickOnDepositButtonAfterDeposit()
    {
        clickOnElement(depositButtonAfterDeposit);
    }
    public void sendAmountToDeposit(String amount)
    {
        sendTextToElement(amountToBeDeposit,amount);
    }
    public String getSuccessMessageAfterDeposit()
    {
        return gettextFromElement(successMessageAfterDeposit);
    }
    public void clickOnWithdrawalButtonAfterWithdrawal()
    {
        clickOnElement(withdrawalButtonAfterWithdrawal);
    }
    public String getSuccessMessageAfterWithdrawal()
    {
        return gettextFromElement(successMessageAfterWithdrawal);
    }

}
