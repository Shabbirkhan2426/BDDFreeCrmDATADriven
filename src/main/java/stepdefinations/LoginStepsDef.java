package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginStepsDef {

    WebDriver driver;


    @Given("^User is alreadey on login page$")


    public void user_is_alreadey_on_login_page() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://ui.freecrm.com/");

    }

    @When("^title of login page is Cogmento CRM$")
    public void title_of_login_page_is_Cogmento_CRM() throws InterruptedException {

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Cogmento CRM",title);
        Thread.sleep(3000);
    }

    //Regular expression
    //1. \"([^\"]*)\"
    //2. \"(.*)\"


    @And("^User enter \"(.*)\" address$")
    public void user_enter_Email_address(String Email) throws InterruptedException {

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
        Thread.sleep(3000);

    }

    @And("^User enter \"(.*)\"$")
    public void user_enter_passWord(String passWord) throws InterruptedException {

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passWord);
        Thread.sleep(3000);

    }

    @And("^User clicks on Login  button$")
    public void user_clicks_on_Login_button() {

        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

    }

    @And("^User is on homepage$")
    public void user_is_on_homepage() {

        String title =driver.getTitle();
        System.out.println("Home page title is "+title);
        Assert.assertEquals("Cogmento CRM",title);


    }
    @When("user click on  contact link")
    public void user_click_on_contact_link() {
        driver.switchTo().frame("main-nav");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
        ////*[@id="main-nav"]/a[3]

    }
    @When("^user click on New button$")
    public void user_click_on_New_button() {

        driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a")).click();

    }
    /*@When("^user enters {string} and {string} and {string}$")
    public void user_enters_and_and(String string, String string2, String string3) {

    }*/

    /*@When("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\" and click on Save button$")
    public void user_enters_contacts_details_and_click_on_save_button(String firstName, String lastName, String Position) {

        driver.findElement(By.name("first_name")).sendKeys("Shabbir");
        driver.findElement(By.name("last_name")).sendKeys("Khan");
        driver.findElement(By.name("position")).sendKeys("Developer");
        driver.findElement(By.xpath("//button[@class ='ui linkedin button']")).click();

    }*/
    @When("user enters \"(.*)\" and \"(.*)\" and \"(.*)\" and click on save button")
    public void user_enters_and_and_and_click_on_save_button(String firstName, String lastName, String Position) {

        driver.findElement(By.name("first_name")).sendKeys("Shabbir");
        driver.findElement(By.name("last_name")).sendKeys("Khan");
        driver.findElement(By.name("position")).sendKeys("Developer");
        driver.findElement(By.xpath("//button[@class ='ui linkedin button']")).click();

    }


    @Then("^close the browser$")
    public void close_the_browser(){

        driver.quit();
    }
}
