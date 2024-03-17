package Gun04;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class _02_Soru extends BaseDriver {

    @Test
    public void Test1(){
        WebElement homePage = driver.findElement(By.linkText("Your Store"));
        homePage.click();

        List<WebElement> products=driver.findElements(By.cssSelector("p[class='price']"));

        int indirimliUrunMiktari=0;
        int indirimsizUrunMikltari=0;
        for (int i = 0; i < products.size(); i++) {

            List<WebElement> newPrice= products.get(i).findElements(By.cssSelector("span[class='price-new']")); //

            if (newPrice.size()>0) // indirim var demektir
            {
                WebElement nPrice=products.get(i).findElement(By.cssSelector("span[class='price-new']"));
                WebElement oPrice=products.get(i).findElement(By.cssSelector("span[class='price-old']"));

                double yeniFiyat=Double.parseDouble (nPrice.getText().replaceAll("[^0-9,.]", ""));
                double eskiFiyat=Double.parseDouble (oPrice.getText().replaceAll("[^0-9,.]", ""));
                System.out.println("eskiFiyat = " + eskiFiyat+" - yenifiyat="+yeniFiyat);

                Assert.assertTrue( yeniFiyat < eskiFiyat, "Yeni fiyat küçük değil");

                indirimliUrunMiktari++;
            }
            else // indirim yok demektir
            {
                System.out.println("products.get(i).getText() = " + products.get(i).getText());

                indirimsizUrunMikltari++;
            }
        }

        System.out.println("indirimsizUrunMikltari = " + indirimsizUrunMikltari);
        System.out.println("indirimliUrunMiktari = " + indirimliUrunMiktari);

    }

}










