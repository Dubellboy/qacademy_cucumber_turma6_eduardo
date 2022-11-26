package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import register.PreencherRegistroPage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.Duration;

public class RegisterSteps {
            PreencherRegistroPage preencherRegistroPage;

    WebDriver driver;
    @Before("@Register")
    public void abrirBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    }
    @After("@Register")
    public void fecharBrowser() {
        driver.quit();
    }
    @AfterStep("@Register")
    public void print(){
        TakesScreenshot screenshot = ((TakesScreenshot) driver); // Convertendo o driver em TakesScreenshot
        byte[] printBytes = screenshot.getScreenshotAs(OutputType.BYTES);
        InputStream printStream = new ByteArrayInputStream(printBytes);
        Allure.addAttachment("Register",printStream);
    }

    @Dado("que eu acesso o site Register")
    public void queEuAcessoOSiteRegister() {
        driver.get("https://demo.automationtesting.in/Register.html");

    }

    @Quando("preencho o campo nome com o valor {string}")
    public void preenchoOCampoNomeComOValor(String nome) {
        preencherRegistroPage = new PreencherRegistroPage(driver);
        preencherRegistroPage.preencherNome(nome);
    }

    @E("preencho o campo sobrenome com o valor {string}")
    public void preenchoOCampoSobrenomeComOValor(String sobrenome) {

        preencherRegistroPage.preencherSobrenome(sobrenome);
    }

    @E("preencho o campo endereco com o valor {string}")
    public void preenchoOCampoEnderecoComOValor(String endereco) {

        preencherRegistroPage.preencherEndereco(endereco);
    }

    @E("preencho o campo email com o valor {string}")
    public void preenchoOCampoEmailComOValor(String email) {

        preencherRegistroPage.preencherEmail(email);
    }

    @E("preencho o campo telefone com o valor {string}")
    public void preenchoOCampoTelefoneComOValor(String tel) {
        preencherRegistroPage.preencherTelefone(tel);
    }

    @E("clico no genero masculino")
    public void clicoNoGeneroMasculino() {
        preencherRegistroPage.escolherGenero();
    }

    @E("escolho o Hobbie Movies")
    public void escolhoOHobbieMovies() {
        preencherRegistroPage.escolherHobbie();
    }

    @E("seleciono a Skill {string}")
    public void selecionoASkill(String skill) {
        preencherRegistroPage.escolherSkills(skill);
    }

    @E("escolho o country")
    public void escolhoOCountry() {
        preencherRegistroPage.escolherCountry();
    }

    @E("seleciono o ano de {string}, o mes {string}, e o dia {string}")
    public void selecionoOAnoDeOMesEODia(String ano, String mes, String dia) {
        preencherRegistroPage.escolherAnonasc(ano);
        preencherRegistroPage.escolherMesNasc(mes);
        preencherRegistroPage.escolherDiaNasc(dia);

    }

    @E("preencho a senha {string}")
    public void preenchoASenha(String senha1) {
        preencherRegistroPage.primeiroPassword(senha1);
    }

    @E("confirmo a senha {string}")
    public void confirmoASenha(String senha2) {
        preencherRegistroPage.confirmPassword(senha2);
    }
}

