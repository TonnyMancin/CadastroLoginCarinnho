import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class CadastroCentauro {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    @After //finalizar
    public void tearDown() {

        driver.quit();
    }

    @Test
    public void cadastrocentauro() {
        driver.get("https://www.centauro.com.br/slogin");

        assertThat(driver.findElement(By.cssSelector(".\\_12mr5yh7")).getText(), is("CRIAR UMA CONTA"));
        driver.findElement(By.cssSelector(".\\_12mr5yh7")).click();
        driver.findElement(By.name("Nome")).click();
        driver.findElement(By.name("Nome")).sendKeys("Tonny");
        driver.findElement(By.name("Sobrenome")).click();
        driver.findElement(By.name("Sobrenome")).sendKeys("Said");
        driver.findElement(By.name("CPF")).click();
        driver.findElement(By.name("CPF")).sendKeys("537.273.510-47");
        driver.findElement(By.name("DataDeNascimento")).click();
        driver.findElement(By.name("DataDeNascimento")).sendKeys("07/02/1998");

        {
            WebElement dropdown = driver.findElement(By.name("Sexo"));
            dropdown.findElement(By.xpath("//option[. = 'Masculino']")).click();
        }
        driver.findElement(By.name("TelefoneAdicional")).click();
        driver.findElement(By.name("TelefoneAdicional")).sendKeys("(44) 99889-6337");
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).sendKeys("iriana3230@uorak.com");
        driver.findElement(By.name("Senha")).sendKeys("bolo123");
        driver.findElement(By.name("ConfirmacaoSenha")).sendKeys("bolo123");
        driver.findElement(By.name("CEP")).click();
        driver.findElement(By.name("CEP")).sendKeys("04347-130");
        driver.findElement(By.cssSelector("#newsletter > .\\_15def4c")).click();
        driver.findElement(By.name("Numero")).click();
        driver.findElement(By.name("Numero")).sendKeys("111");
        driver.findElement(By.cssSelector("#terms-accept > .\\_15def4c")).click();
        //driver.findElement(By.cssSelector(".\\_159r3op8")).click();
    }
}

