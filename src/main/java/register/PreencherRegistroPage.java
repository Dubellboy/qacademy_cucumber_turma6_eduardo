package register;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PreencherRegistroPage {

    WebDriver driver;

    //Método construtor
    public PreencherRegistroPage(WebDriver  driverParametro){
        driver = driverParametro;
    }

    private String nomeXpath = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input";
    private String sobrenomeXpath = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input";
    private String enderecoXpath = "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea";
    private String emailXpath = "//*[@id=\"eid\"]/input";
    private String telefoneXpath = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input";
    private String generoXpath = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input";
    private String hobbiesXpath = "//*[@id=\"checkbox2\"]";
    private String countryXpath = "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span";
    private String country2Xpath = "//*[@id=\"select2-country-results\"]/li[6]";
    private String skillSelectXpath = "//*[@id=\"Skills\"]";
    private String mesXpath = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select";


    public void preencherNome(String nome) {
        driver.findElement(By.xpath(nomeXpath)).sendKeys(nome);
    }
    public void preencherSobrenome(String sobrenome){

        driver.findElement(By.xpath(sobrenomeXpath)).sendKeys(sobrenome);
    }
    public void preencherEndereco(String endereco){

        driver.findElement(By.xpath(enderecoXpath)).sendKeys(endereco);
    }
    public void preencherEmail(String email){

        driver.findElement(By.xpath(emailXpath)).sendKeys(email);
    }
    public void preencherTelefone(String celular){

        driver.findElement(By.xpath(telefoneXpath)).sendKeys(celular);
    }

    public void escolherGenero(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");
        driver.findElement(By.xpath(generoXpath)).click();
    }
    public void escolherHobbie(){
        driver.findElement(By.xpath(hobbiesXpath)).click();
    }
    public void escolherSkills(String skill){

        Select skills = new Select(driver.findElement(By.xpath(skillSelectXpath)));
        skills.selectByVisibleText(skill);
    }
    public void escolherCountry(){

        driver.findElement(By.xpath(countryXpath)).click();
        driver.findElement(By.xpath(country2Xpath)).click();
    }
    public void escolherAnonasc(String anoNasc){

        Select year = new Select(driver.findElement(By.id("yearbox")));
        year.selectByVisibleText(anoNasc);
    }
    public void escolherMesNasc(String mes){

        Select month = new Select(driver.findElement(By.xpath(mesXpath)));
        month.selectByVisibleText(mes);
    }
    public void escolherDiaNasc(String dia){

        Select day = new Select(driver.findElement(By.id("daybox")));
        day.selectByVisibleText(dia);
    }
    public void primeiroPassword(String firstPassword){

        driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys(firstPassword);
    }
    public void confirmPassword(String secondPassword){

        driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys(secondPassword);
    }


}
