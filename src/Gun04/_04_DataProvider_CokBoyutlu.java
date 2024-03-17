package Gun04;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _04_DataProvider_CokBoyutlu {

    @Test(dataProvider = "datalarim")
    public void searchText(String username,String sifre) {

        System.out.println(username+" "+sifre);
    }


    @DataProvider
    Object[][] datalarim() {
        Object[][] kullaniciVeSifre =

                {{"ali", "17889"},
                        {"asun", "jhf77"},
                        {"serkan", "76645"},
                        {"ahmet", "08747"},
                        {"aycin", "44356"}
                };
        return kullaniciVeSifre ;

    }
}





















