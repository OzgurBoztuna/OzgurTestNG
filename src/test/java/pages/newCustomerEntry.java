package pages;

import base.TestBase2;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utillities.DriverUtil;
import utillities.PropertiesReadingUtil;

public class newCustomerEntry extends basePage {
//Third page is for New Customer Entry Page where you need to locate : customer information boxes such as name,adrees,gender,email,password etc.



    @FindBy(xpath = "//p[@class='heading3']")
   public WebElement addNewCustomerButton2;

    @FindBy(xpath ="//input[@name='name']")
   public WebElement customerName;

    @FindBy(xpath ="(//input[@name='rad1'])[1]")
    public  WebElement gender;

    @FindBy(xpath = "//input[@name='dob']")
            public WebElement calender;
@FindBy(xpath = "//textarea[@name='addr']")
 public WebElement address;

      @FindBy(xpath = "//input[@name='city']")
   public WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='pinno']")
    public WebElement pin;

    @FindBy(xpath = "//input[@name='telephoneno']")
    public WebElement telepone;

    @FindBy(xpath = "//input[@name='emailid']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submit;

    @FindBy(xpath = "//p[text()='Customer Registered Successfully!!!']")
    public WebElement header;

    public String addCustomerTitle(){

        String addCustomerText = addNewCustomerButton2.getText();
        return  addCustomerText;
    }


    public void newCustomerName(){
        customerName.sendKeys(PropertiesReadingUtil.getProperties("newCustomerName"));}


     public void customerGender(){
        gender.click();
     }

          public void  calenderDrop(){

        calender.sendKeys(PropertiesReadingUtil.getProperties("dob"), Keys.ARROW_RIGHT);

          }

          public void customerAddress(){

         address.sendKeys(PropertiesReadingUtil.getProperties("add"));
         city.sendKeys(PropertiesReadingUtil.getProperties("cityName"));
         state.sendKeys(PropertiesReadingUtil.getProperties("cusStateName"));
         pin.sendKeys(PropertiesReadingUtil.getProperties("cusPin"));
         telepone.sendKeys(PropertiesReadingUtil.getProperties("cusTel"));
         email.sendKeys(PropertiesReadingUtil.getProperties("cusEmail"));
         password.sendKeys(PropertiesReadingUtil.getProperties("newPass"));
          }


    public void setSubmit(){
        submit.click();
          }

          public boolean verify(String expectedHeader){

        if ( header.getText().equalsIgnoreCase(expectedHeader)){
            return true;

        }else
        {return false;

          }

}}