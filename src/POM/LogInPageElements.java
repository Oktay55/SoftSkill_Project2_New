package POM;

import Utils.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageElements {

    public LogInPageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath="//button[text()='Accept all cookies']")
    public WebElement acceptCookies;

    @FindBy(xpath="//input[@placeholder='Username']")
    public WebElement userName;

    @FindBy(xpath="//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath="//button[@aria-label='LOGIN']")
    public WebElement logIn;
}
