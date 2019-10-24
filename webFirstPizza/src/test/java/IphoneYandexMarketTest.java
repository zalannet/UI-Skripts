
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IphoneYandexMarketTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    String memory = "64Gb";
    String color;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @AfterClass(enabled = false)
    public void tearDown() {
        driver.quit();
    }

    public String waitForWindow(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> whNow = driver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
            whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
    }

    @Test
    public void iphoneYandexMarket() {
        driver.get("https://yandex.ru/");
        driver.manage().window().setSize(new Dimension(1050, 708));
        driver.findElement(By.id("text")).sendKeys("iphone 7 "+ memory);
        driver.findElement(By.id("text")).sendKeys(Keys.ENTER);
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(new By.ByXPath("//b[contains(text(),'Apple iPhone 8 64GB')]")).click();
        vars.put("win8512", waitForWindow(2000));
        driver.switchTo().window(vars.get("win8512").toString());
        driver.findElement(new By.ByCssSelector("[data-name='золотой']")).click();
        color = driver.findElement(new By.ByCssSelector(".orEV9DcwNt")).toString();
        System.out.println(color);
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.linkText("В магазин")).click();
        vars.put("win7741", waitForWindow(2000));
        driver.switchTo().window(vars.get("win7741").toString());
        driver.findElement(By.cssSelector(".section > div > .\\_3TfWusA7bt")).click();
        driver.findElement(By.cssSelector(".orEV9DcwNt > span")).click();
        driver.findElement(By.cssSelector(".l3daMzINHn > .THqSbzx07u > .\\_2w0qPDYwej")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".\\_3ioN70chUh > .THqSbzx07u"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".\\_25WJCc1Vil path")).click();
        driver.findElement(By.cssSelector(".\\_1fe1bLZrkY path")).click();
        js.executeScript("window.scrollTo(0,480)");
        driver.findElement(By.cssSelector(".\\_3ioN70chUh .\\_2w0qPDYwej")).click();
        js.executeScript("window.scrollTo(0,192)");
        driver.findElement(By.cssSelector(".s5wsZMKoea:nth-child(1) .\\_3yvXLQs2ww")).click();
        driver.findElement(By.id("textfield8339043699")).click();
        driver.findElement(By.id("textfield8339043699")).sendKeys("Кутузовский проспект");
        driver.findElement(By.id("textfield8339043699")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("textfield878008903")).click();
        driver.findElement(By.id("textfield878008903")).sendKeys("32 к 1");
        driver.findElement(By.id("textfield5205883083")).click();
        driver.findElement(By.id("textfield5205883083")).sendKeys("112");
        driver.findElement(By.id("textfield6462950627")).click();
        driver.findElement(By.id("textfield6462950627")).sendKeys("Анна Залесская");
        driver.findElement(By.id("textfield7799582618")).sendKeys("zal@zal.vom");
        driver.findElement(By.id("textfield4733544050")).click();
        driver.findElement(By.id("textfield4733544050")).sendKeys("+7999999991");
        driver.findElement(By.cssSelector(".\\_2yUW32Cudg > .\\_2w0qPDYwej")).click();
        driver.findElement(By.cssSelector(".\\_1OVnYl7J2m")).click();
    }
}

/* мои жалкие потуги)))
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IphoneYandexMarketTest {
    WebDriver wd;

    @BeforeClass
    public void init() {
        wd = new ChromeDriver();
        wd.get("https://yandex.ru");
    }

    @Test
    public void choseProducts() throws InterruptedException {
        wd.findElement(By.id("text")).sendKeys("Iphone 7 32gb");
        wd.findElement(new By.ByCssSelector("[type = submit]")).click();
        //wd.findElement(new By.ByXPath("//b[contains (text(), 'Яндекс.Маркет')]/../../../..")).click();
        //wd.findElement(new By.ByXPath("//div[@class='organic__url-text']//span[@class='price']")).click();
        wd.switchTo().window("win8512");
       wd.findElement(By.id("glf-14871214-15277521")).click();
        wd.findElement(By.cssSelector(".radiobox__radio_hovered_yes .n-filter-picker-discount__price-from")).click();

    }
}
*/
