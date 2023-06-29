import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class LoginCentauro {
    private WebDriver driver;


    @Before //iniciar
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    @After //finalizar
    public void tearDown() {

        //driver.quit();
    }

    @Test
    public void loginCentauro() {
        driver.get("https://www.centauro.com.br/slogin");
        driver.findElement(By.cssSelector(".\\_h3nikb")).click();
        driver.findElement(By.id("username")).sendKeys("ramil1678@uorak.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("bolo123");
        assertThat(driver.findElement(By.cssSelector(".\\_ep87247")).getText(), is("ENTRAR"));
        driver.findElement(By.cssSelector(".\\_ep87247")).click();
    }
}
