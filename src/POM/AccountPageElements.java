package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPageElements {

    public AccountPageElements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()=' Welcome, Oktay Saglam ! ']")
    public WebElement welcomeMessage;

    @FindBy(xpath="//div[text()='Invalid username or password']")
    public WebElement errorMessage;
}
