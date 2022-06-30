package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utillities.DriverUtil;
import utillities.browserUtil;

import java.util.concurrent.TimeUnit;

public class TestBase2 {
    //abstraction example

    @BeforeClass
    public void setUp(){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @AfterClass
    public void closing(){
        browserUtil.wait(5);
        //  DriverUtil.closeDriver();
    }
}
