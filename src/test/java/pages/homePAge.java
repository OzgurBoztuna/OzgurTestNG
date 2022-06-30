package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utillities.DriverUtil;

public class homePAge extends basePage{
    //Second page is for home page and you need to locate : text Manger Id


    @FindBy(xpath = "//tr[@class='heading3']/td")
    WebElement managerID;
    @FindBy(linkText = "New Customer")
    WebElement newCustomerButton;



    public String checkManagerID(){

        String managerIDText = managerID.getText();
        String id = managerIDText.split(":")[1].trim();
        return id;}

    public void clickNewCustomerButton(){

        newCustomerButton.click();}


}
