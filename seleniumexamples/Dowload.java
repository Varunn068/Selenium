package seleniumexamples;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dowload {

	
	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		HashMap<Object,Object> prefs = new HashMap();
		prefs.put("plugins.always_open_pdf_externally",true);
		prefs.put("download.default_directory","C:\\Users\\LENOVO\\Desktop\\Projects\\selenium\\Documents");
		opt.setExperimentalOption("prefs", prefs);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.rrce.org/placement/");
		driver.findElement(By.xpath("//a[@rel=\"noopener\"][1]")).click();
		driver.close();
		
		

	}

}
