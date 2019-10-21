import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Pizza {
    WebDriver wd;

    @Test
    public void pizzaOrder() throws InterruptedException {
        wd = new ChromeDriver();
  //      wd.get("https://dodopizza.ru/moscow");
        wd.get("https://pizzasushiwok.ru/");
        Thread.sleep(3000);
        //перейти в раздел "Пиццы"
        wd.findElement(new By.ByXPath("//div[@class='main-header']//li[1]//a[1]//span[1]")).click();
        wd.findElement(new By.ByXPath("//div[@id='item844']//div[@class='item-content']//div//div//a[@class='btn noselect choose_gift'][contains(text(),'+')]")).click();
        Thread.sleep(3000);
        wd.findElement(new By.ByXPath("//div[@id='item17']//div[@class='item-content']//div//div//a[@class='btn noselect choose_gift'][contains(text(),'+')]")).click();
        Thread.sleep(3000);
        //перейти в корзину
        wd.findElement(new By.ByXPath("//a[@class='cart to_cart']")).click();
        wd.findElement(new By.ByXPath("//a[@class='btn']")).click();
        wd.findElement(new By.ByXPath("//input[@id='order_name']")).sendKeys("Анна");
        wd.findElement(new By.ByXPath("//input[@id='order_phone']")).sendKeys("+79852150227");






     /*
     dodo
       перейти в раздел "Пиццы"
       wd.findElement(new By.ByXPath("//li[1]//a[1]")).click();

        wd.findElement(new By.ByXPath("//div[@class = 'product__to-cart']")).click();
        wd.findElement(new By.ByXPath("//button[@class='product__to-cart-button button button_primary']")).click();


       перейти в корзину
        wd.findElement(new By.ByXPath("//button[@class='Button-sc-91ilwk-0 styled__CartButton-sc-1bwqahw-2 jnbBck']")).click();
        wd.findElement(new By.ByXPath("//button[@class = 'cart__button cart__button_next button button_primary button_large']")).click();
*/


    }
}


