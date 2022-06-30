package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utillities.DriverUtil;

public class loginPage extends basePage {
    //First one for login page where you need to locate : username,password,Login and Guru99 Bank text

    @FindBy(xpath = "//h2[@class='barone']")
    public WebElement header;

    @FindBy(xpath ="//input[@name='uid']")
     public WebElement userName;

    @FindBy(xpath ="//input[@name='password']" )
    public WebElement passWord;

    @FindBy(xpath ="//input[@name='btnLogin']" )
    public WebElement loginBtn;


    public boolean verifyHeader(String expectedHeader) {
        if (header.getText().equalsIgnoreCase(expectedHeader)) {
            return true;
        } else {
            return false;
        }
    }
    public void userIdInput(String userId, String getPassword) {
        userName.sendKeys(userId);
        passWord.sendKeys(getPassword);
        loginBtn.click();
    }



}
