package test;

import base.TestBase2;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.homePAge;
import pages.loginPage;
import pages.newCustomerEntry;
import utillities.DriverUtil;
import utillities.PropertiesReadingUtil;

public class lab13 extends TestBase2 {
//    POM Example TEST - Share Github Link for this
//    Step 1) Go to Guru99 Demo Site http://demo.guru99.com/V4/
//    Step 2) In Login page check text "Guru99 Bank" is present
//    Step 3) Login into application with given credentials(you need to enter your email in order to get credentials in advance)
//    Step 4) Verify that the Home page contains text as "Manger Id: mngr368294"
//    Step 5) Click on new customer button and verify you are in New Customer Entry Page
//    Step 6) Fill the information for new customer
//    Step 7) Verify new customer added sucessfully
//// Hint-TestNG :

//Pages : In this task you will need to create 3 pages class
//First one for login page where you need to locate : username,password,Login and Guru99 Bank text
//Second page is for home page and you need to locate : text Manger Id
//Third page is for New Customer Entry Page where you need to locate : customer information boxes such as name,adrees,gender,email,password etc.
//Configuration File
//store username,pasword , and url
//Utils
//use our ready utils such as readingproperties,driver, browser utils
//Base
//use our ready testbase classes.
//Testing+
// while testing first you will verify "Guru99 Bank" is present
// then you need to Login into application
// then verify Home page contains text as "Manger Id: mngr368294"
// click on new customer tab then verify title contains New Customer Entry Page
// fill all information to be able create a customer // verify the message customer registered sucessfully.

    WebDriver driver;
    loginPage login = new loginPage();
    newCustomerEntry newCustomerEntry= new newCustomerEntry();
    @Test(priority = 1)
    public void TC1() {

        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("Guru_url"));

        Assert.assertTrue(login.verifyHeader("Guru99 Bank"));
    }


    @Test(priority = 2)
    public void Tc2() {
        login.userIdInput(PropertiesReadingUtil.getProperties("userName"), PropertiesReadingUtil.getProperties("password"));

    }
    @Test(priority = 3)
    public void TC3() {
        homePAge home = new homePAge();

        Assert.assertEquals(home.checkManagerID(), (PropertiesReadingUtil.getProperties("userName")));
        home.clickNewCustomerButton();
    }


    @Test(priority = 4)
    public void TC4() {


        Assert.assertEquals(newCustomerEntry.addCustomerTitle(),"Add New Customer");
        newCustomerEntry.newCustomerName();
        newCustomerEntry.customerGender();
        newCustomerEntry.calenderDrop();


        newCustomerEntry.customerAddress();


    }

    @Test(priority = 5)
    public void TC5(){
        newCustomerEntry.setSubmit();
newCustomerEntry.verify("Customer Registered Successfully!!!");
    }

}
////p[text()='Customer Registered Successfully!!!']
//(//table[@id='regmsg']/tbody/tr/td)/table/tbody/tr
////td[text()='Customer ID']/../td[1]