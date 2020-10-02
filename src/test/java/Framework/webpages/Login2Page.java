package Framework.webpages;

import org.openqa.selenium.By;

public class Login2Page  extends ElementUtil {


    private By nameField = By.id("u_0_f");
    private By lastnameField = By.id("u_0_h");
    private By emailbox = By.id("u_0_k");
    private By passwordbox = By.xpath("//input[@id='u_0_p']");
    private By genderButton=By.cssSelector("input._8esa");
    private By signUpButton = By.name("websubmit");
    private By errortext = By.cssSelector("div._5633._5634._53ij");

    public void enterName(String name) {
        setValue(nameField, name);

    }

    public void enterLastname(String lastname) {
        setValue(lastnameField, lastname);

    }

    public void enterEmail(String email) {
        setValue(emailbox, email);

    }
    public void enterPassword(String enterPassword) {
        setValue(passwordbox, enterPassword);
    }

    public void clickOnGenderRadioButton() {
        clickOn(genderButton);
    }


    public void clickOnSignUpButton() throws InterruptedException {
        clickOn(signUpButton);
        Thread.sleep(2000);
    }

    public String verifyErrorMessage() {

        return getTextFromElement(errortext);
    }
}