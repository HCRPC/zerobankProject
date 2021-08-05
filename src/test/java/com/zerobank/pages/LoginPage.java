package com.zerobank.pages;


import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }
      @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signInButton;

       @FindBy(xpath = "//input[@id='user_login']")
    public WebElement userLoginBox;

       @FindBy(xpath = "//input[@id='user_password']")
    public  WebElement userPasswordBox;

       @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButton;

        @FindBy(xpath = "//button[@id='details-button']")
        public  WebElement Advanced;

        @FindBy(xpath = "//a[@id='proceed-link']")
        public WebElement link;

       public void login(){

           signInButton.click();
           userLoginBox.sendKeys(ConfigurationReader.get("username"));
           userPasswordBox.sendKeys(ConfigurationReader.get("password"));
           submitButton.click();
           Advanced.click();
           link.click();

       }

}