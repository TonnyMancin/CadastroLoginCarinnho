package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Cadastro {

    private WebDriver driver;

    @Given("que acesso a Centauro")
    public void queAcessoACentauro() {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        driver.get("https://www.centauro.com.br/slogin");
    }

    @And("clico no CRIAR UM CONTA")
    public void clicoNoCRIARUMCONTA() {
        assertThat(driver.findElement(By.cssSelector(".\\_12mr5yh7")).getText(), is("CRIAR UMA CONTA"));
        driver.findElement(By.cssSelector(".\\_12mr5yh7")).click();
    }

    @When("preencho os campos do castro")
    public void preenchoOsCamposDoCastro() throws InterruptedException {
        driver.findElement(By.name("Nome")).click();
        driver.findElement(By.name("Nome")).sendKeys("Tonny");
        Thread.sleep(1000);
        driver.findElement(By.name("Sobrenome")).click();
        driver.findElement(By.name("Sobrenome")).sendKeys("Said");
        Thread.sleep(1000);
        driver.findElement(By.name("CPF")).click();
        driver.findElement(By.name("CPF")).sendKeys("967.203.270-62");
        Thread.sleep(1000);
        driver.findElement(By.name("DataDeNascimento")).click();
        driver.findElement(By.name("DataDeNascimento")).sendKeys("07/02/1998");
        Thread.sleep(1000);

        {
            WebElement dropdown = driver.findElement(By.name("Sexo"));
            dropdown.findElement(By.xpath("//option[. = 'Masculino']")).click();
            Thread.sleep(1000);
        }
        driver.findElement(By.name("TelefoneAdicional")).click();
        driver.findElement(By.name("TelefoneAdicional")).sendKeys("(65) 95641-0732");
        Thread.sleep(1000);
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).sendKeys("bula7655@uorak.com");
        Thread.sleep(1000);
        driver.findElement(By.name("Senha")).sendKeys("bolo123");
        driver.findElement(By.name("ConfirmacaoSenha")).sendKeys("bolo123");
        Thread.sleep(1000);
        driver.findElement(By.name("CEP")).click();
        driver.findElement(By.name("CEP")).sendKeys("04347-130");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#newsletter > .\\_15def4c")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("Numero")).click();
        driver.findElement(By.name("Numero")).sendKeys("111");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#terms-accept > .\\_15def4c")).click();
        Thread.sleep(1000);

    }

    @Then("valido as informacoes")
    public void validoAsInformacoes() {
        driver.findElement(By.cssSelector(".\\_159r3op8")).click();
        //driver.quit();
    }
}
