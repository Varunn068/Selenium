package seleniumexamples;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrapdropdown {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		// Single selection bootstrap dropdown
				driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1");
				
				driver.findElement(By.id("btnDropdownDemo")).click();
				List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]/a"));
				
			for (WebElement option : options) {
					String optionText = option.getText();
					if(optionText.equals("CSS")) {
						option.click();
						break;
					}
					System.out.println(optionText);
				}
				driver.quit();
		
	}

}
