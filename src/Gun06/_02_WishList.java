package Gun06;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _02_WishList extends BaseDriver {

    @Test
    public void addToWishList(){
        WebElement searchBox=driver.findElement(By.name("search"));
        searchBox.sendKeys("ipod"+ Keys.ENTER);

        // ürünlerin wish butonları
        List<WebElement> wishButtons=driver.findElements(By.cssSelector("[data-original-title='Add to Wish List']"));

        // ürünlerin başlıkları
        List<WebElement> productNameList=driver.findElements(By.xpath("//div[@class='caption']/h4"));

        int randomSecim= Tools.randomGenerator(wishButtons.size()); // element sayısına RND sayı alındı
        String wishItemText= productNameList.get(randomSecim).getText();// random daki ürünün adı alındı
        System.out.println("wishItemText = " + wishItemText); //kontrol için yazıldı

        wishButtons.get(randomSecim).click(); // ilgili Random ürünün wish butonuna tıklandı

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("wish list")));
        WebElement wishListLink= driver.findElement(By.linkText("wish list"));
        wishListLink.click();  //  Wish List e gidildi

        //Wish Listesindeki isimler alındı
        List<WebElement> wishNameList=driver.findElements(By.cssSelector("[class='text-left'] a"));

        //aradığımız ürün listede var mı yok mu?
        boolean bulundu=false;
        for (WebElement e: wishNameList)
        {
            if (e.getText().toLowerCase().equals(wishItemText.toLowerCase()))
                bulundu=true;
        }

        Assert.assertTrue(bulundu,"WishListe eklenen ürün listede bulunamadı");
    }


}










