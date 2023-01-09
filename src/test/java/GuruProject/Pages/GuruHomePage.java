package GuruProject.Pages;

import GuruProject.Utilities.BrowserUtils;
import GuruProject.Utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruHomePage extends BrowserUtils {
    public GuruHomePage(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }

    //Step 3) Login into application with given credentials(you need to enter your email in order to get credentials
    @FindBy(xpath = "//input[@type='text']")
    public WebElement setUserCredential;

    @FindBy(name = "password")
    public WebElement setPasswordCredential;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement LoginButton;


    public void LoginForGuru(String username, String password){
        setUserCredential.sendKeys(username);
        setPasswordCredential.sendKeys(password);
        LoginButton.click();
        BrowserUtils.wait(3);


    }



}
