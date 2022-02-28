package com.ozdilek;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class BasePage extends BaseTest{
    protected static final Logger logger = LogManager.getLogger(BaseTest.class);
    @Step("<wait> saniye kadar bekle")
    public void waitForSeconds(int wait) throws InterruptedException {
        Thread.sleep(wait * 1000);
    }

    @Step("Alışveriş <id> butonuna tıkla")
    public void clickById(String id) {
        appiumDriver.findElement(By.id(id)).click();
    }
    @Step("Alışveriş <id> butonunu kontrol et")
    public void checkText(String id) {
        String ctrlText = appiumDriver.findElement(By.id(id)).getText();
        Assert.assertEquals("ALIŞVERİŞE BAŞLA", ctrlText);
    }
    @Step("Kategoriler sayfası <id> açılır")
    public void clickByCategori(String id) {
      appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/nav_categories")).click();
    }
    @Step("Kategoriler <id> butonunu kontrol et")
    public void cText(String id) {
        String cText = appiumDriver.findElement(By.id(id)).getText();
        Assert.assertEquals("",cText);
    }
    @Step("Kategori kadın <woman> tıkla")
    public  void selectW(String woman){
        String text=appiumDriver.findElement(By.xpath(woman)).getText();
        appiumDriver.findElement(By.xpath(woman)).click();

    }
    @Step("Kadın <pants> tıkla")
    public  void selectP(String pants){
        String text=appiumDriver.findElement(By.xpath(pants)).getText();
        appiumDriver.findElement(By.xpath(pants)).click();
    }
    @Step("Sayfayı <scroll> et")
    public void scroll(String scroll) {
        TouchAction ts = new TouchAction(appiumDriver);
        ts.press(PointOption.point(530,1530)).moveTo(PointOption.point(530,420)).release().perform();
        logger.info("Scroll edildi.");
    }
    @Step("Rastgele bir <product> seç")
    public void selectRandomProduct(String product){
        Random rdn = new Random();
        List<MobileElement> productList = appiumDriver.findElementsByXPath(product);
        int size = productList.size();
        Random rnd = new Random();
        int randNum = rnd.nextInt(size);
        productList.get(randNum).click();
    }
    @Step("Product detail kontrol edilir.")
    public void checkProductDetail() throws InterruptedException {
        Thread.sleep(1000);
        String checkProductText = appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/tvSizeDesc")).getText();
        Assert.assertEquals("Beden:", checkProductText);
        System.out.println("Ürün detayına girildi.");
        logger.info("Ürün detayına girildi.");
    }
    @Step("Ürün <id> favorilere eklenir.")
    public void addToFav(String id) throws InterruptedException {
        appiumDriver.findElement(By.id(id)).click();
        System.out.println("Favorilere ekle butonuna basildi.");
        logger.info("Favorilere ekle butonuna basildi.");
    }

}
