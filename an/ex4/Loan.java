package com.capgemini.steps;

import com.capgemini.ourWebdriver.BrowserFactory;
import com.capgemini.ourWebdriver.OurWebDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class Loan {
    private final OurWebDriver browser;

    public Loan() throws MalformedURLException {
        browser = BrowserFactory.getWebDriver();
    }

    @Given("^I have opened the loan request page$")
    public void iHaveOpenedTheLoanRequestPage() throws Throwable {
        browser.get(System.getProperty("user.dir") + "\\src\\main\\resources\\index.html");
        Thread.sleep(1000);
    }


    @And("^I select loan type '((?:Mini|Car|Personal)-loan|Revolving credit|Mortgage)'$")
    public void iSelectLoanTypeCarLoan(String loanType) throws Throwable {
        Thread.sleep(1000);
        browser.waitForVisible(By.cssSelector("input[value='" + loanType + "']")).click();
        Thread.sleep(1000);
    }

    @And("^the amount I want to borrow is '(\\d+)'$")
    public void theAmountIWantToBorrowIs(int amount) throws Throwable {
        browser.findElement(By.cssSelector("input[name='amount']")).sendKeys(String.valueOf(amount));
        Thread.sleep(1000);
    }

    @And("^I continue to explanation$")
    public void iContinueToExplanation() throws Throwable {
        browser.findElement(By.cssSelector("#verderPage1")).click();
        Thread.sleep(1000);
    }

    @And("^I  select that i (have|don't have) knowledge$")
    public void iSelectThatIHaveKnowledge(String inputDoOrDont) throws Throwable {
        String doOrDont;
        switch (inputDoOrDont){
            case "have":
                doOrDont = "ja";
                break;
            case "don't have":
                doOrDont = "nee";
                break;
            default:
                doOrDont = "ja";
                break;

        }
        browser.findElement(By.cssSelector("[name=\"kennis\"][value=\""+ doOrDont + "\"]")).click();
        Thread.sleep(1000);
    }

    @And("^I  select continue to personal data$")
    public void iSelectContinueToPersonalData() throws Throwable {
        browser.findElement(By.cssSelector("#verderPage2")).click();
        Thread.sleep(1000);
    }

    @And("^I fill in name '(\\w+)*'$")
    public void iFillInNameCapgemini(String name) throws Throwable {
        browser.findElement(By.cssSelector("#naam")).sendKeys("Capgemini");
        Thread.sleep(500);
    }

    @And("^I choose gender '(male|female)'$")
    public void iChooseGenderMale(String genderInput) throws Throwable {
        String gender;
        if (genderInput.equals("male")){
            gender = "man";
        } else {
            gender = "vrouw";
        }
        browser.findElement(By.cssSelector("#" + gender)).click();
        Thread.sleep(500);

    }

    @And("^I fill in date of birth '(\\d{2})-(\\w{3})-(\\d{4})'$")
    public void iFillInDateOfBirthJan(String inputDay, String inputMonth, String inputYear) throws Throwable {
        browser.findElement(By.cssSelector("#geboortedatum")).sendKeys(inputDay+inputMonth+ Keys.ARROW_RIGHT+ inputYear);
        Thread.sleep(500);

    }

    @And("^I fill in adress '(.*)'$")
    public void iFillInAdressTeststraat(String address) throws Throwable {
        browser.findElement(By.cssSelector("#adres")).sendKeys(address);
        Thread.sleep(500);


    }

    @And("^I fill in phone number '(\\d+)'$")
    public void iFillInPhoneNumber(int number) throws Throwable {
        browser.findElement(By.cssSelector("#telefoonnummer")).sendKeys(String.valueOf(number));
        Thread.sleep(500);


    }

    @And("^I fill in bank account '(.{5,33})'$")
    public void iFillInBankAccountNLINGB(String accountNumber) throws Throwable {
        browser.findElement(By.cssSelector("#rekeningnummer")).sendKeys(accountNumber);
        Thread.sleep(500);


    }

    @And("^I fill in gross income '(\\d+)'$")
    public void iFillInGrossIncome(int income) throws Throwable {
        browser.findElement(By.cssSelector("#inkomen")).sendKeys(String.valueOf(income));
        Thread.sleep(500);

    }

    @And("^I fill in housing costs '(\\d+)'$")
    public void iFillInHousingCosts(int costs) throws Throwable {
        browser.findElement(By.cssSelector("#woonlasten")).sendKeys(String.valueOf(costs));
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

    @And("^I click I need a lone for Bills$")
    public void iClickINeedALoneForBills() throws Throwable {
        browser.findElement(By.cssSelector("[name=\"rekeningen\"]")).click();

    }

    @And("^I close the modal$")
    public void iCloseTheModal() throws Throwable {
        browser.waitForVisible(By.cssSelector(".close")).click();

    }

    @And("^I fill in name \"([^\"]*)\"$")
    public void iFillInName(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
