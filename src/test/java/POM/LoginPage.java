package POM;

import commonMethods.CommMeths;
import commonMethods.Logs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    CommMeths cm;
    String info = "INFO";
    String pass = "PASS";
    String fail = "FAIL";



    public LoginPage(WebDriver driver) {
        Logs.startLog("Entering the Journey Details");
        Logs.addToReport("Control Enters into LoginPOM Constructor", info);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Logs.addToReport("Control Exits LoginPOM Constructor", info);
        cm = new CommMeths();
    }
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    WebElement AccountlistButton;

    @FindBy(xpath = "//*[@id='createAccountSubmit']")
    WebElement emailboxappearcheck;

    @FindBy(xpath = "//*[@name='email']")
    WebElement emailbox;


    @FindBy(xpath = " //*[@id='ap_password']")
    WebElement passwordinputfield;


    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    WebElement clicksigninButton;



    public void Login()

    {

        cm.elementExplicitWait(driver, AccountlistButton, 100);
        AccountlistButton.click();


        if (emailboxappearcheck.isDisplayed()) {


            Logs.addToReport("loginpage test case", info);
            String Loginwithemail = cm.getInput("Login_username");
            System.out.println("Loginwithemail");
            emailbox.sendKeys(Loginwithemail);
            Logs.addToReport("Email is entered", pass);


            Logs.addToReport("Enter your password", info);
            String passworddata = cm.getInput("Login_password");
            passwordinputfield.sendKeys(passworddata);
            Logs.addToReport("Password your entered", pass);


            clicksigninButton.click();
            Logs.addToReport("Click on sign-in after you have entered your password  ", info);
            Logs.addToReport("Continue button is clicked", pass);
        }

        else {
            Logs.addToReport("Continue button is not clicked", fail);
            Logs.stopLog();
        }
    }
}