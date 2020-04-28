package POM;

import commonMethods.CommMeths;
import commonMethods.Logs;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddHeadphoneToCart {
    WebDriver driver;
    CommMeths cm;
    String info = "INFO";
    String pass = "PASS";
    String fail = "FAIL";



    public AddHeadphoneToCart(WebDriver driver) throws InterruptedException {
        Logs.startLog("Add To cart step");
        Logs.addToReport("Control Enters into LoginPOM Constructor", info);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Logs.addToReport("Control Exits LoginPOM Constructor", info);
        cm = new CommMeths();
Thread.sleep(2000);

    }
    @FindBy(xpath = "//*[@id='nav-link-shopall']/span[2]")
    WebElement Selectdepartment;

    @FindBy(xpath = "//div[@class=\"fsdDeptCol\"]/a[contains(text(),\"Headphones\")]")
    WebElement Selectheadphones;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[1]/div/div/span/a/div/img")
    WebElement SelectFirstheadphones;

    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    WebElement AddHeadphonesToCArt;

    @FindBy(xpath = "//*[@id=\"attach-close_sideSheet-link\"]")
    WebElement CloseAddtocartWindow;
    public void Clickdepartment()
    {
        cm.elementvisibilityExplicitWait(driver, Selectdepartment, 10);


        if(Selectdepartment.isDisplayed())
        {
            Logs.addToReport( "Select department option is available ", info);
            Selectdepartment.click();
            Logs.addToReport( "Select department button is clicked ", pass);

        }

        else {
            Logs.addToReport(" Select department button is not available", fail);


        }
        Logs.stopLog();
    }

    public void ClickHeadphones() throws InterruptedException {
        cm.elementvisibilityExplicitWait(driver, Selectheadphones, 10);



        if(Selectheadphones.isDisplayed())
        {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            cm.elementExplicitWait(driver,Selectheadphones,10);
            js.executeScript("window.scrollBy(0,1000)");

            Logs.addToReport( "Select headphones option is available ", info);
            Selectheadphones.click();
            Logs.addToReport( "Select headphones button is clicked ", pass);

        }

        else
            {
            Logs.addToReport(" Select headphones button is not available", fail);

            }
        Logs.stopLog();
    }


    public void SelectFirstheadphones() throws InterruptedException {
        cm.elementvisibilityExplicitWait(driver, SelectFirstheadphones, 10);


        if(SelectFirstheadphones.isDisplayed())
        {
            cm.elementvisibilityExplicitWait(driver, SelectFirstheadphones, 10);

            Logs.addToReport( "Select First headphones option is available ", info);
            SelectFirstheadphones.click();
            Logs.addToReport( "Select First headphones button is clicked ", pass);


        }

        else
        {
            Logs.addToReport("Select First headphones button is not available", fail);

        }
        Logs.stopLog();
    }



    public void AddHeadphonesToCArt() throws InterruptedException {
        cm.elementvisibilityExplicitWait(driver, AddHeadphonesToCArt, 10);

        if(AddHeadphonesToCArt.isDisplayed())
        {
            Logs.addToReport( "Add Headphones To Cart option is available ", info);
            AddHeadphonesToCArt.click();
            Logs.addToReport( "Add Headphones To Cart  button is clicked ", pass);
            cm.elementvisibilityExplicitWait(driver,CloseAddtocartWindow,10);
            CloseAddtocartWindow.click();



        }

        else
        {
            Logs.addToReport("Add Headphones To Cart  button is not available", fail);

        }
        Logs.stopLog();


    }


}