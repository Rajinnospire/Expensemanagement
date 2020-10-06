package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Testbase {
	public static WebDriver driver;
	
	public static void initialization() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}
	
	public void loadURL( String s) {
		driver.get(s);
	}
	
	public void fill(WebElement e,String s) {
		e.sendKeys(s);
		}
	
	public void click(WebElement e) {
		e.click();
		}
	
	public void validate(WebElement v) {
		v.isDisplayed();
	}
	
	public void scrollDown(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",e);

		}
	public void refresh() {

		driver.navigate().refresh();
	}
	
	public void clear(WebElement c) {
		
		c.clear();
	}
	
			
		
	public void backward() {
		
		driver.navigate().back();
	}
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
}