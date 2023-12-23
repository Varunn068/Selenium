package seleniumexamples;

import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Permissions {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		HashMap<String,Integer> con = new HashMap();
		HashMap<Object,Object> prof= new  HashMap();
		HashMap<Object,Object> prefs = new HashMap();
	   con.put("media_stream", 1);
	   prof.put("managed_contained_settings",con);
	   prefs.put("profile", prof);
	   opt.setExperimentalOption("prefs", prefs);
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver(opt);
	   driver.get("https://mictests.com/");
	   Thread.sleep(3500);
	   driver.findElement(By.id("mic-laucher")).click();
	   
	   

	}

}
