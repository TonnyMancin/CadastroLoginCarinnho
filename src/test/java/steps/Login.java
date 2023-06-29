package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Login {
    private WebDriver driver;
    @Given("que acesso o login da Centauro")
    public void queAcessoOLoginDaCentauro() {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        driver.get("https://www.centauro.com.br/slogin");
    }

    @And("clico no login")
    public void clicoNoLogin() {
        driver.findElement(By.cssSelector(".\\_h3nikb")).click();
    }

    @When("coloco {string} e {string}")
    public void colocoE(String username, String password) {
        driver.findElement(By.id("username")).sendKeys("elizabel5162@uorak.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("bolo123");
    }

    @Then("e acesso a conta")
    public void eAcessoAConta() {
        //driver.findElement(By.cssSelector("div._1xen70n:nth-child(3) div._1lxs653 section._27w2ma:nth-child(1) div._1kdbblz section._87r2to:nth-child(2) div.user-actions form._16um45t > button._ep87247")).click();

        //driver.quit();
    }
}
