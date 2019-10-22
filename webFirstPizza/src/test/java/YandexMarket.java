import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class YandexMarket {
    WebDriver wd;

  @BeforeClass
    public void init(){
        wd = new ChromeDriver();
        wd.get("https://market.yandex.ru");
    }

    @Test
    public void choseProducts(){
      wd.findElement(new By.ByCssSelector("[name = text]")).sendKeys("Iphone 7");
      wd.findElement(new By.ByCssSelector("[type = submit]")).click();
      wd.findElement(new By.ByCssSelector("#glpricefrom")).sendKeys("25000");
      wd.findElement(new By.ByCssSelector("#glpriceto")).sendKeys("32000");
      List <WebElement> list = new List<WebElement>() {
          @Override
          public int size() {
              return 0;
          }

          @Override
          public boolean isEmpty() {
              return false;
          }

          @Override
          public boolean contains(Object o) {
              return false;
          }

          @Override
          public Iterator<WebElement> iterator() {
              return null;
          }

          @Override
          public Object[] toArray() {
              return new Object[0];
          }

          @Override
          public <T> T[] toArray(T[] a) {
              return null;
          }

          @Override
          public boolean add(WebElement webElement) {
              return false;
          }

          @Override
          public boolean remove(Object o) {
              return false;
          }

          @Override
          public boolean containsAll(Collection<?> c) {
              return false;
          }

          @Override
          public boolean addAll(Collection<? extends WebElement> c) {
              return false;
          }

          @Override
          public boolean addAll(int index, Collection<? extends WebElement> c) {
              return false;
          }

          @Override
          public boolean removeAll(Collection<?> c) {
              return false;
          }

          @Override
          public boolean retainAll(Collection<?> c) {
              return false;
          }

          @Override
          public void clear() {

          }

          @Override
          public WebElement get(int index) {
              return null;
          }

          @Override
          public WebElement set(int index, WebElement element) {
              return null;
          }

          @Override
          public void add(int index, WebElement element) {

          }

          @Override
          public WebElement remove(int index) {
              return null;
          }

          @Override
          public int indexOf(Object o) {
              return 0;
          }

          @Override
          public int lastIndexOf(Object o) {
              return 0;
          }

          @Override
          public ListIterator<WebElement> listIterator() {
              return null;
          }

          @Override
          public ListIterator<WebElement> listIterator(int index) {
              return null;
          }

          @Override
          public List<WebElement> subList(int fromIndex, int toIndex) {
              return null;
          }
      };

    }
}
