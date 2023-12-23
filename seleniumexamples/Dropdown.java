package seleniumexamples;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
    WebElement web = driver.findElement(By.id("course"));
     Select opt = new Select(web);
     opt.selectByVisibleText("Java");
     opt.selectByVisibleText("Eclipse");
     driver.close();
     
		
	}

}
