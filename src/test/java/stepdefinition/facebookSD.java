package stepdefinition;

import Framework.webpages.Login1Page;
import Framework.webpages.Login2Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class facebookSD {

    private Login1Page login1Page = new Login1Page();
    private Login2Page login2Page = new Login2Page();

    @Given("^I am on home page$")
    public void setFacebookPage() {
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://www.facebook.com/");
    }

    @When("^I enter ilhan into firstname text fields on home screen$")
    public void enterName() throws InterruptedException {
        login1Page.enterName("Ilhan");
    }

    @And("^I enter Turkmen into lastname text fields on home screen$")
    public void enterLastname() throws InterruptedException {
        login1Page.enterLastname("Turkmen");
    }

    @Then("^I verify that signup button is disable at homepage$")
    public void signupButton() throws InterruptedException {
        login1Page.pressSignupBtn();
        System.out.println("The signup button is enabled");
    }
    @When("^I enter Yasemin into firstname text fields on home screen$")
    public void enterName2() throws InterruptedException {
        login2Page.enterName("Yasemin");
    }

    @And("^I enter Arslan into lastname text fields on home screen$")
    public void enterLastname2() throws InterruptedException {
        login2Page.enterLastname("Arslan");

    }

    @And("^I enter (.+) into mobile number text fields on home screen$")
    public void enterEmail(String anyText) throws InterruptedException {
        login2Page.enterEmail(anyText);
    }

    @And("^I enter (.+) into newpassword fields on home screen$")
    public void enterNewPassword(String textField) throws InterruptedException {
        login2Page.enterPassword(textField);
    }

    @And("^I click on gender radio button$")
    public void iClickOnGenderButton(){
        login2Page.clickOnGenderRadioButton();
    }

    @And("^I click on signup button on home screen$")
    public void clickOnButton() throws InterruptedException {

        login2Page .clickOnSignUpButton();
    }


    @Then("^I verify error message for invalid email on home screen$")
    public void verifyErrorMessage() {

        String text1 = login2Page.verifyErrorMessage();
        Assert.assertEquals(text1, "Please enter a valid mobile number or email address.");
    }
}