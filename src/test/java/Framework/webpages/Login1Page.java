package Framework.webpages;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;

public class Login1Page extends ElementUtil {

    private By nameField = By.id("u_0_f");
    private By lastnameField = By.id("u_0_h");
    private By signUpButton = By.id("u_0_w");

    public void enterName(String name) throws InterruptedException {
        setValue(nameField, name);
        Thread.sleep(2000);
    }

    public void enterLastname(String lastname) throws InterruptedException {
        setValue(lastnameField, lastname);
        Thread.sleep(2000);
    }

    public void pressSignupBtn() throws InterruptedException {
        clickOn(signUpButton);
        Thread.sleep(2000);
    }
}
