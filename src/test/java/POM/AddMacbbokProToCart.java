package POM;

import commonMethods.CommMeths;
import commonMethods.Logs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddMacbbokProToCart {

    WebDriver driver;
    CommMeths cm;
    String info = "INFO";
    String pass = "PASS";
    String fail = "FAIL";


    public AddMacbbokProToCart(WebDriver driver) throws InterruptedException {
        Logs.startLog("Add mac book to cart");
        Logs.addToReport("Control Enters into LoginPOM Constructor", info);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Logs.addToReport("Control Exits LoginPOM Constructor", info);
        cm = new CommMeths();

    }

    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement Searchinputdata;

    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    WebElement SearchButton;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div/div[4]/div/div/div/div[2]/div[1]/div/div/span/a/div/img")
    WebElement Select2ndLaptopFromTheList;

    @FindBy(xpath = "//*[@id=\"a-autoid-0\"]/span/i")
    WebElement SelectQuantity;

    @FindBy(xpath = "//*[@id=\"quantity\"]")
    WebElement SelectQuantity1;

    @FindBy(xpath = "//*[@id=\"quantity_1\"]")
    WebElement SelectTWOQuantity;

    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    WebElement AddTwoLaptoptocart;


    public void SearchBoxClick() throws InterruptedException {
        cm.elementExplicitWait(driver, Searchinputdata, 100);
        System.out.println("qwertyuio");
        if (Searchinputdata.isDisplayed())
        {
            Logs.addToReport("Enter your query-Apple MacBook Pro (13\" Retina, 2.3GHz Dual-Core Intel Core i5, 8GB RAM, 128GB SSD) - Space Gray (Latest Model)", info);
            String SearchMacBookPro = cm.getInput("Search_laptop");
            Searchinputdata.sendKeys(SearchMacBookPro);

            Logs.addToReport("Data(Mac book pro) to search is ready in the box ", pass);

        }


    }

    public void HitSearchButton() throws InterruptedException {
        if (Searchinputdata.isDisplayed())
        {
            Logs.addToReport("Find search button", pass);

            SearchButton.click();
            Logs.addToReport("Search button is clicked", pass);


        }
    }

    public void Selectlaptop()
    {
        if (Select2ndLaptopFromTheList.isDisplayed())
        {
            Logs.addToReport("Select Laptop", pass);

            Select2ndLaptopFromTheList.click();
            Logs.addToReport("Select Laptop is working", pass);


        }
    }

    public void AddtwolaptopToCart() throws InterruptedException {
         try{
            if (SelectQuantity.isDisplayed())
            {
                Logs.addToReport("Check for Quantity", pass);
                Select dropdown = new Select(driver.findElement((By) SelectQuantity));
                dropdown.selectByValue("2");
                SelectQuantity.click();
                Logs.addToReport("Check if two Quantity is added", pass);


            }
            else if (SelectQuantity1.isDisplayed())
             {
                 Logs.addToReport("Check for Quantity", pass);
                 Select dropdown = new Select(driver.findElement((By) SelectQuantity1));
                 dropdown.selectByValue("2");
                 SelectQuantity1.click();
                 Logs.addToReport("Check if two Quantity is added", pass);

             }
         } catch (Exception e) {
             e.printStackTrace();
         }

            if(AddTwoLaptoptocart.isDisplayed())
            {
                Logs.addToReport("Add laptops to cart", pass);

                AddTwoLaptoptocart.click();

            }



        }
    }



