package Test;

import POM.AccountPageElements;
import POM.LogInPageElements;
import Utils.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogInTest extends BaseDriver {

    LogInPageElements logInPageElements;
    AccountPageElements accountPageElements;

    @Test(priority = 1,dataProvider = "LogInData")
    public void loginPositiveTest(String userName, String password){
        logInPageElements= new LogInPageElements(driver);
        accountPageElements= new AccountPageElements(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logInPageElements.acceptCookies.click();
        logInPageElements.userName.sendKeys(userName);
        logInPageElements.password.sendKeys(password);
        logInPageElements.logIn.click();

        String actualMessage= accountPageElements.welcomeMessage.getText();
        String expectedMessage="Welcome, Oktay Saglam !";

        Assert.assertEquals(actualMessage,expectedMessage);

    }
    @Test(priority = 2,dataProvider = "LogInData2")
    public void loginNegativeTest2(String userName, String password) {
        logInPageElements= new LogInPageElements(driver);
        accountPageElements= new AccountPageElements(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logInPageElements.acceptCookies.click();
        logInPageElements.userName.sendKeys(userName);
        logInPageElements.password.sendKeys(password);
        logInPageElements.logIn.click();

        String actualError=accountPageElements.errorMessage.getText();
        String expectedError="Invalid username or password";

        Assert.assertEquals(actualError,expectedError);

    }
    @Test(priority = 3,dataProvider = "LogInData3")
    public void loginNegativeTest3(String userName, String password) {
        logInPageElements= new LogInPageElements(driver);
        accountPageElements= new AccountPageElements(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logInPageElements.acceptCookies.click();
        logInPageElements.userName.sendKeys(userName);
        logInPageElements.password.sendKeys(password);
        logInPageElements.logIn.click();

        String actualError=accountPageElements.errorMessage.getText();
        String expectedError="Invalid username or password";

        Assert.assertEquals(actualError,expectedError);

    }
    @Test(priority = 4,dataProvider = "LogInData4")
    public void loginNegativeTest4(String userName, String password) {
        logInPageElements= new LogInPageElements(driver);
        accountPageElements= new AccountPageElements(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logInPageElements.acceptCookies.click();
        logInPageElements.userName.sendKeys(userName);
        logInPageElements.password.sendKeys(password);
        logInPageElements.logIn.click();

        String actualError=accountPageElements.errorMessage.getText();
        String expectedError="Invalid username or password";

        Assert.assertEquals(actualError,expectedError);

    }

    @DataProvider(name = "LogInData") // Enter your correct email and correct password
    public Object [][] testDataProvider() {
        return new Object[][] { {"oktaysaglam55@gmail.com","#Samsunspor55"}};
    }
    @DataProvider(name = "LogInData2") // Enter your incorrect email and correct password
    public Object [][] testDataProvider2() {
        return new Object[][] { {"cimbom@gmail.com","#Samsunspor55"} };
    }
    @DataProvider(name = "LogInData3") // Enter your correct email and incorrect password
    public Object [][] testDataProvider3() {
        return new Object[][] { {"oktaysaglam55@gmail.com","asdahiu2"} };
    }
    @DataProvider(name = "LogInData4") // Enter your incorrect email and incorrect password
    public Object [][] testDataProvider4() {
        return new Object[][]{{"oktaysaglam55@gmail.com", "asdsad"}};
    }

}
