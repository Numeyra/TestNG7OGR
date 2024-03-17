package Gun02;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
  Senaryo
  1- Siteyi açınız.
  2- Edit Account sayfasına ulaşınız.
  3- Ad ve soyadı değiştirip tekrar kaydedidiniz.
 */
public class _02_EditAccount extends BaseDriver {

    @Test
public void EditAccount(){

        WebElement editLink= driver.findElement(By.linkText("Edit Account"));
        editLink.click();

        WebElement  textFirstName= driver.findElement(By .id("input-firstname"));
        textFirstName.clear();
        textFirstName.sendKeys("Ayse 2");

        WebElement textLastName = driver.findElement(By.id("input-lastname"));
        textLastName.clear();
        textLastName.sendKeys("Yildiz 2");

        WebElement btnSubmit= driver.findElement(By.xpath("//input[@type='submit']"));
        btnSubmit.click();

        Tools.SuccessMessageValidation();









    }









}
