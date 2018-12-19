package com.crm.pages;

import com.crm.base.Base;
import com.crm.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {


    @FindBy(name="username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//input[@value='Login']")
    WebElement loginBtn;

    @FindBy(xpath="//button[contains(text(),'Sign Up')")
    WebElement signUpBtn;

    public LoginPage() {

        PageFactory.initElements(driver,this);
    }

    public String validateLoginPageTitle()
    {
        return driver.getTitle();

    }

    public HomePage login(String un)
    {
        username.sendKeys(un);
        password.sendKeys(TestUtil.decodePassword(prop.getProperty("password")));
        loginBtn.click();
        return new HomePage();


    }
}
