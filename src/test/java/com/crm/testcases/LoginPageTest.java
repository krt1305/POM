package com.crm.testcases;

import com.crm.base.Base;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends Base {

    LoginPage loginPage;
    HomePage homePage;
    public LoginPageTest() {

        super();
    }

    @BeforeMethod
    public void setUp()
    {
        openBrowser();
        loginPage=new LoginPage();


    }

    @Test
    public void loginPageTitleTest()
    {
        String actualTitle=loginPage.validateLoginPageTitle();
        Assert.assertEquals(actualTitle,"#1 Free CRM software in the cloud for sales and service");
    }

    @Test
    public void loginTest()
    {
        homePage=loginPage.login(prop.getProperty("username"));
    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
