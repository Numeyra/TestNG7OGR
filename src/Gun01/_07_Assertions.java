package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _07_Assertions {

 @Test
 public void equalsOrnek() {
  String s1 = "Merhaba";
  String s2 = "Merhaba";

  //Actual(olusan), Excpected(Beklenen), Mesaji (Optional);//aem

  Assert.assertEquals(s1, s2, "olusan la beklenen aynni degil");

 }

 @Test
 public void NotEqualsOrnek() {
  String s1 = "Merhaba";
  String s2 = "Merhaba";

  Assert.assertEquals(s1, s2, "olusan la beklenen farkli degil");

 }

 @Test
 public void TrueOrnek() {
  String s1 = "Merhaba";
  String s2 = "Merhaba";

  //Actual(olusan), Excpected(Beklenen), Mesaji (Optional);//aem

  Assert.assertTrue(s1.equals(s2), "olusan la beklenen aynni degil");

 }


 @Test
 public void TrueOrnek2() {
  int s1 = 5;
  int s2 = 5;

  //Actual(olusan), Excpected(Beklenen), Mesaji (Optional);//aem

  Assert.assertTrue(s1 == s2, "olusan la beklenen aynni degil");

 }


 @Test
 public void NullOrnek() {

  String s = null;

  //Actual(olusan), Excpected(Beklenen), Mesaji (Optional);//aem

  Assert.assertNull(s, " Deger null degil");

 }


 @Test
 public void direktFail() {

  int a = 55;

  if (a != 55)
   Assert.fail();
 }

 @Test
 public void FalseOrnek() {
  int s1 = 5;
  int s2 = 7;

  //Actual(olusan), Excpected(Beklenen), Mesaji (Optional);//aem

  Assert.assertFalse(s1 == s2, "olusan la beklenen aynni degil");


 }



}

























































