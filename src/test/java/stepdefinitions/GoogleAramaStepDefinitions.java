package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class GoogleAramaStepDefinitions {

    GooglePage googlePage = new GooglePage();

    @Given("kullanici google sayfasina gider")
    public void kullanici_google_sayfasina_gider() {
        System.out.println("Kullanici Google'a gitti");

        Driver.getDriver().get("https://google.com");
    }
    @Given("arama kutusuna techproeducation yazar")
    public void arama_kutusuna_techproeducation_yazar() {
        System.out.println("Kullanici techproeducation yazdi");

        googlePage.aramaKutusu.sendKeys("techproeducation" + Keys.ENTER);
    }
    @Then("arama sonuclari sayfasinin basligini kontrol eder")
    public void arama_sonuclari_sayfasinin_basligini_kontrol_eder() {
        System.out.println("Kullanici sayfa basligini test etti");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String baslik = Driver.getDriver().getTitle();
        boolean iceriyorMu = baslik.contains("techproeducation");
        Assert.assertTrue(iceriyorMu);

    }
    @Given("arama kutusuna selenium yazar")
    public void arama_kutusuna_selenium_yazar() {
        System.out.println("kullanici selenium yazar");

        googlePage.aramaKutusu.sendKeys("selenium" + Keys.ENTER);
    }

    @Then("arama sonuclari sayfasinin sonuc sayisini kontrol eder")
    public void arama_sonuclari_sayfasinin_sonuc_sayisini_kontrol_eder() {
        System.out.println("kullanici sonuc sayisini test etti");

        String sonucSayisi = googlePage.sonucSayisi.getText();
        System.out.println(sonucSayisi);
    }
    @Given("kullanici {string} kelimesi arar")
    public void kullanici_kelimesi_arar(String string) {
        googlePage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }
    @Then("kullanici sayfa basliginda {string} kelimesini kontrol eder")
    public void kullanici_sayfa_basliginda_kelimesini_kontrol_eder(String string) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String baslik = Driver.getDriver().getTitle();
        boolean iceriyorMu = baslik.contains(string);
        Assert.assertTrue(iceriyorMu);
    }
    @Given("kullanici {string} arar")
    public void kullanici_arar(String string) {
        googlePage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }
    @Then("kullanici sayfa basliginda {string} kontrol eder")
    public void kullanici_sayfa_basliginda_kontrol_eder(String string) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String baslik = Driver.getDriver().getTitle();
        boolean iceriyorMu = baslik.contains(string);
        Assert.assertTrue(iceriyorMu);
    }



}






