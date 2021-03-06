package com.capgemini.steps;

import com.capgemini.ourWebdriver.BrowserFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class Loan {
    private final WebDriver browser;

    public Loan() throws MalformedURLException {
        browser = BrowserFactory.getWebDriver();
    }

    @Given("^I have opened the loan request page$")
    public void iHaveOpenedTheLoanRequestPage() throws Throwable {
        browser.get(System.getProperty("user.dir") + "\\src\\main\\resources\\index.html");
        Thread.sleep(1000);
    }


    @And("^I select loan type 'Car-loan'$")
    public void iSelectLoanTypeCarLoan() throws Throwable {
        browser.findElement(By.cssSelector("input[value='Car-loan']")).click();
        Thread.sleep(1000);
    }

    @And("^the amount I want to borrow is '1000'$")
    public void theAmountIWantToBorrowIs() throws Throwable {
        browser.findElement(By.cssSelector("input[name='amount']")).sendKeys("1000");
        Thread.sleep(5000);
    }
}
