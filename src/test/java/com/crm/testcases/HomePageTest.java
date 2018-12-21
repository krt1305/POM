package com.crm.testcases;

import com.crm.base.Base;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends Base {

    LoginPage loginPage;
    HomePage homePage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp()
    {
        openBrowser();
        loginPage=new LoginPage();
        homePage= loginPage.login(prop.getProperty("username"));


    }

    @Test
    public void verifyHomePageTitle()
    {

        String homePageTitle=homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle,"CRMPRO");

    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
