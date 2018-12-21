package com.crm.pages;

import com.crm.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class HomePage extends Base {

    @FindBy(xpath="//td[contains(text(),'User: rab tab')]")
    @CacheLookup //use only when page is not refreshed and dont use it for all elements
    WebElement userNameLabel;

    @FindBy(xpath="a[contains(text(),'Contacts')]")
    WebElement contactslink;

    @FindBy(xpath="a[contains(text(),'Deals')]")
    WebElement dealslink;

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    public String verifyHomePageTitle()
    {
        return driver.getTitle();
    }

    public ContactsPage clickContactsLink()
    {
        contactslink.click();
        return new ContactsPage();
    }

    public DealsPage clickDealsLink()
    {
        dealslink.click();
        return new DealsPage();
    }
}

