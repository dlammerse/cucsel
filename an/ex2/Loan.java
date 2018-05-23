package com.capgemini.steps;

import com.capgemini.ourWebdriver.BrowserFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    @And("^the amount I want to borrow is '2000'$")
    public void theAmountIWantToBorrowIs() throws Throwable {
        browser.findElement(By.cssSelector("input[name='amount']")).sendKeys("2000");
        Thread.sleep(1000);
    }

    @And("^I continue to explanation$")
    public void iContinueToExplanation() throws Throwable {
        browser.findElement(By.cssSelector("#verderPage1")).click();
        Thread.sleep(1000);
    }

    @And("^I  select that i have knowledge$")
    public void iSelectThatIHaveKnowledge() throws Throwable {
        browser.findElement(By.cssSelector("[name=\"kennis\"][value=\"ja\"]")).click();
        Thread.sleep(1000);
    }

    @And("^I  select continue to personal data$")
    public void iSelectContinueToPersonalData() throws Throwable {
        browser.findElement(By.cssSelector("#verderPage2")).click();
        Thread.sleep(1000);
    }

    @And("^I fill in name Capgemini$")
    public void iFillInNameCapgemini() throws Throwable {
        browser.findElement(By.cssSelector("#naam")).sendKeys("Capgemini");
        Thread.sleep(500);
    }

    @And("^I choose gender male$")
    public void iChooseGenderMale() throws Throwable {
        browser.findElement(By.cssSelector("#man")).click();
        Thread.sleep(500);

    }

    @And("^I fill in date of birth 01-Jan-1970$")
    public void iFillInDateOfBirthJan() throws Throwable {
        browser.findElement(By.cssSelector("#geboortedatum")).sendKeys("01Jan"+ Keys.ARROW_RIGHT+"1970");
        Thread.sleep(500);

    }

    @And("^I fill in adress Teststraat 1$")
    public void iFillInAdressTeststraat() throws Throwable {
        browser.findElement(By.cssSelector("#adres")).sendKeys("Teststraat 1");
        Thread.sleep(500);


    }

    @And("^I fill in phone number 0612345678$")
    public void iFillInPhoneNumber() throws Throwable {
        browser.findElement(By.cssSelector("#telefoonnummer")).sendKeys("0612345678");
        Thread.sleep(500);


    }

    @And("^I fill in bank account NL01INGB0123456789$")
    public void iFillInBankAccountNLINGB() throws Throwable {
        browser.findElement(By.cssSelector("#rekeningnummer")).sendKeys("NL01INGB0123456789");
        Thread.sleep(500);


    }

    @And("^I fill in gross income 35000$")
    public void iFillInGrossIncome() throws Throwable {
        browser.findElement(By.cssSelector("#inkomen")).sendKeys("35000");
        Thread.sleep(500);

    }

    @And("^I fill in housing costs 1000$")
    public void iFillInHousingCosts() throws Throwable {
        browser.findElement(By.cssSelector("#woonlasten")).sendKeys("1000");
        Thread.sleep(500);

    }

    @And("^I choose living situation rental$")
    public void iChooseLivingSituationRental() throws Throwable {
        browser.findElement(By.cssSelector("#woonsituatie [value=\"rental\"]")).click();
        Thread.sleep(500);

    }

    @And("^I choose maritial status single$")
    public void iChooseMaritialStatusSingle() throws Throwable {
        browser.findElement(By.cssSelector("#staat [value=\"single\"]")).click();
        Thread.sleep(500);

    }

    @And("^I choose income type permanent contract$")
    public void iChooseIncomeTypePermanentContract() throws Throwable {
        browser.findElement(By.cssSelector("#typeinkomen [value=\"permanent contract\"]")).click();
        Thread.sleep(500);

    }

    @And("^I upload payment slip$")
    public void iUploadPaymentSlip() throws Throwable {
        browser.findElement(By.cssSelector("#loonstrookje")).sendKeys(System.getProperty("user.dir") + "\\Assignments.md");
        Thread.sleep(500);

    }

    @And("^I upload indentification$")
    public void iUploadIndentification() throws Throwable {
        browser.findElement(By.cssSelector("#id")).sendKeys(System.getProperty("user.dir") + "\\AssignmentsNS.md");
        Thread.sleep(500);

    }
}
