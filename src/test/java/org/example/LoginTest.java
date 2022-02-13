package org.example;


import org.example.pages.LoginPage;
import org.example.utilities.BaseInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseInit {


    public LoginTest() throws IOException {
        super();
    }

    @Test(priority = 1)
    public void verifyPageTitle() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        Assert.assertTrue(loginPage.getPageTitle().contains(loginPageTitle));
    }

    @Test(priority = 2)
    public void verifyInvalidLogin() {

        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage.acceptCookies();
        String errorMessage = loginPage.doLoginWithInvalidCredentials(userName, invalidPassword);
        Assert.assertTrue(errorMessage.contains(expectedMessage));
    }
}