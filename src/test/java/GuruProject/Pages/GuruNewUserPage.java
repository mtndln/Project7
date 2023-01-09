package GuruProject.Pages;

import GuruProject.Utilities.BrowserUtils;
import GuruProject.Utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GuruNewUserPage extends BrowserUtils {

    public GuruNewUserPage() {
        PageFactory.initElements(DriverUtil.getDriver(), this);
    }

    @FindBy(name = "name")
    public WebElement userName;

    @FindBy(xpath = "//input[@value='f']")
    public WebElement radioButtonFemale;

    @FindBy(id = "dob")
    public WebElement dateOfBirth;

    @FindBy(name = "addr")
    public WebElement addressBox;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "pinno")
    public WebElement pinNo;

    @FindBy(name = "telephoneno")
    public WebElement telNumber;

    @FindBy(name = "emailid")
    public WebElement emailAd;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitButton;


    public void setUserName() {
        userName.sendKeys("Melinda");
        radioButtonFemale.click();
        dateOfBirth.sendKeys("001990/12/14");

    }

    public void setAddressBox() {
        addressBox.sendKeys("Woody");
        city.sendKeys("Toronto");
        state.sendKeys("Ontario");

    }

    public void setAccountInformation() {
        pinNo.sendKeys("123456");
        telNumber.sendKeys("4533543672");
        emailAd.sendKeys("melinda@gmail.com");
        password.sendKeys("123456");
        BrowserUtils.wait(2);
        submitButton.click();
    }
}