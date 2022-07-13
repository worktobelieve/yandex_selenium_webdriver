package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestwithIDE {
	private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @BeforeTest
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }  
	    
	  
	
		  
		  @Test
		  public static void yandexfile() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		    driver.get("https://yandex.ru/");
		    driver.findElement(By.cssSelector(".desk-notif-card__login-new-item_enter > .desk-notif-card__login-new-item-title")).click();
		    driver.findElement(By.id("passp:sign-in")).click();
		    driver.findElement(By.id("passp-field-login")).sendKeys("dedushkinbatya");
		    driver.findElement(By.id("passp:sign-in")).click();
		    driver.findElement(By.xpath("//button[@id='passp:sign-in']")).click();
		    driver.findElement(By.id("passp-field-passwd")).sendKeys("Java-Qa-Auto");
		    driver.findElement(By.id("passp:sign-in")).click();
		   {
		      WebElement element = driver.findElement(By.linkText("Диск"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		   driver.findElement(By.linkText("Диск")).click();
		   {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		   }
		    driver.findElement(By.cssSelector("#item-16576613805973247-0 .ufo-icon__icon")).click();
		    
		    driver.findElement(By.cssSelector(".confirmation-dialog__button")).click();
		  
		    driver.findElement(By.cssSelector(".Textinput-Control:nth-child(1)")).sendKeys("test");
		    
		    {
		      WebElement element = driver.findElement(By.cssSelector(".listing-item_selected .listing-item__fields"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).clickAndHold().perform();
		    }
		    {
		      WebElement element = driver.findElement(By.cssSelector(".listing-item_selected .listing-item__fields"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		   
		    {
		      WebElement element = driver.findElement(By.cssSelector(".listing-item_selected .listing-item__fields"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).release().perform();
		    }
		   
		    driver.findElement(By.cssSelector(".listing__items")).click();
		     
		    driver.findElement(By.cssSelector(".listing-item_selected .listing-item__fields")).click();
		   
		    driver.findElement(By.cssSelector(".listing-item_selected .listing-item__fields")).click();
		    | 
		    {
		      WebElement element = driver.findElement(By.cssSelector(".listing-item_selected .listing-item__fields"));
		      Actions builder = new Actions(driver);
		      builder.doubleClick(element).perform();
		    }
		    
		    driver.findElement(By.cssSelector(".listing-item__fields")).click();
		    
		    driver.findElement(By.cssSelector(".resources-action-bar__close")).click();
		    driver.findElement(By.cssSelector(".user-account_has-ticker_yes .user-pic__image")).click();
		    driver.findElement(By.linkText("Выйти")).click();
		    driver.close();
			driver.quit();
		  
		  }
		
		
	

}
