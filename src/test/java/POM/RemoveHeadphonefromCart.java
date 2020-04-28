package POM;

import commonMethods.CommMeths;
import commonMethods.Logs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveHeadphonefromCart {
    WebDriver driver;
    CommMeths cm;
    String info = "INFO";
    String pass = "PASS";
    String fail = "FAIL";


    public RemoveHeadphonefromCart(WebDriver driver) {
        Logs.startLog("Remove cart from page");
        Logs.addToReport("Control Enters into LoginPOM Constructor", info);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Logs.addToReport("Control Exits LoginPOM Constructor", info);
        cm = new CommMeths();
    }

    @FindBy(xpath = "//*[@id=\"nav-cart\"]")
    WebElement navigateToCart;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[2]/div/div/div/div[2]/div[1]/div/div/span/a/div/img")
    WebElement deleteItemFromCart;

    @FindBy(xpath = "//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
    WebElement ProceedToCheckOut;


    public void navigateToCart() {

        cm.elementExplicitWait(driver, navigateToCart, 100);
        if (navigateToCart.isDisplayed()) {
            Logs.addToReport("Click on your cart ", info);
            navigateToCart.click();
        }
    }

    public void DeleteItemFromCart() {
        cm.elementExplicitWait(driver, deleteItemFromCart, 100);
        if (deleteItemFromCart.isDisplayed()) {
            Logs.addToReport("Check functionality of delete item from your Cart ", info);
            deleteItemFromCart.click();
            driver.navigate().refresh();

        }


    }
    public void proceedToCheckOut() {
        cm.elementExplicitWait(driver, ProceedToCheckOut, 100);
        if (ProceedToCheckOut.isDisplayed()) {
            Logs.addToReport("Click on Checkout ", info);
            ProceedToCheckOut.click();
        }


    }
}