package seleniumexamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeAutocontrol {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.close();
	}

}
