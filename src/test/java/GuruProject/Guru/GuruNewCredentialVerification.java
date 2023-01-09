package GuruProject.Guru;

import GuruProject.Base.TestBase;
import GuruProject.Pages.GuruHomePage;
import GuruProject.Pages.GuruNewUserPage;
import GuruProject.Utilities.DriverUtil;
import GuruProject.Utilities.PropertiesReading;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GuruNewCredentialVerification extends TestBase {
    @Test
    public void TCA() {
        //Step 1) Go to Guru99 Demo Site http://demo.guru99.com/V4/
        //Step 2) In Login page check text "Guru99 Bank" is present

        GuruHomePage guruHomePage = new GuruHomePage();
        DriverUtil.getDriver().get(PropertiesReading.getProperties("Url_Guru"));

        String actualTitle = DriverUtil.getDriver().getTitle();
        String expectedTitle = "Guru99 Bank Home Page";
        Assert.assertEquals(actualTitle, expectedTitle, "Verification has failed");

        guruHomePage.LoginForGuru(PropertiesReading.getProperties("Username"), PropertiesReading.getProperties("Password"));

        WebElement text = DriverUtil.getDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
        String mText = text.getText();
        System.out.println(mText);
    }

    @Test
    public void TCB() {
        //Step 5) Click on new customer button and verify you are in New Customer Entry Page
        DriverUtil.getDriver().findElement(By.linkText("New Customer")).click();
        String actualNewCustomerTitle = DriverUtil.getDriver().getTitle();
        String expectedNewCustomerTitle = "Guru99 Bank New Customer Entry Page";
        Assert.assertEquals(actualNewCustomerTitle,expectedNewCustomerTitle,"Assertion has failed");

        //Step 6) Fill the information for new customer

        GuruNewUserPage newUserPage = new GuruNewUserPage();
        newUserPage.setUserName();
        newUserPage.setAddressBox();
        newUserPage.setAccountInformation();
        // Step 7) Verify new customer added sucessfully
        String text = "Customer Registered Successfully!!!";
        if(DriverUtil.getDriver().getPageSource().contains(text)){
            System.out.println("New Customer Registered Successfully");
        }else {
            System.out.println("Verification has failed");
        }



    }

    }

