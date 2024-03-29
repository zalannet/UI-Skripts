import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

public class YandexMarket {
    WebDriver wd;

    @BeforeClass
    public void init() {
        wd = new ChromeDriver();
        wd.get("https://market.yandex.ru");
    }

    @Test
    public void choseProducts() {
        wd.findElement(new By.ByCssSelector("[name = text]")).sendKeys("Iphone 7");
        wd.findElement(new By.ByCssSelector("[type = submit]")).click();
        wd.findElement(new By.ByCssSelector("#glpricefrom")).sendKeys("25000");
        wd.findElement(new By.ByCssSelector("#glpriceto")).sendKeys("32000");
        ArrayList<WebElement> links = new ArrayList<>();
        //спросить, как добавить ВСЕ модели для сравнения
       links.add(wd.findElement(new By.ByCssSelector(".image_name_compare")));


       // links.add( wd.findElement(new By.ByCssSelector("*.image_name_compare")));
        for (WebElement link : links) {
            link.click();
        }
        System.out.println(links.size());
        wd.findElement(new By.ByCssSelector("[data-title=\"Сравнение\"]")).click();


    }
}
