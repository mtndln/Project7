package GuruProject.Base;

import GuruProject.Utilities.BrowserUtils;
import GuruProject.Utilities.DriverUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    @BeforeMethod
    public void setup(){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        BrowserUtils.wait(2);
    }
}
