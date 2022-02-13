package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@title='Allow All Cookies']")
    private WebElement allowCookies;

    @FindBy(xpath= "//button[@type='submit']")
    private WebElement login;

    @FindBy(xpath= "//div[@class='_9ay7']")
    private WebElement errorMessage;


    public WebElement getEmailField()
    {
        return emailField;
    }

    public WebElement getPasswordField()
    {
        return passwordField;
    }

    public WebElement getLoginButton()
    {
        return login;
    }

    public void acceptCookies() {
        try {
            allowCookies.click();
        }
        catch (Exception e){
            System.out.println("Cookies not popped up");
        }
    }

    public String doLoginWithInvalidCredentials(String userName, String invalidPassword) {

        getEmailField().sendKeys(userName);
        getPasswordField().sendKeys(invalidPassword);
        getLoginButton().click();
        return errorMessage.getText();
    }

}
