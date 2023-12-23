package seleniumexamples;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabhandles {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--Incognito");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent  = driver.getWindowHandle();
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> child = driver.getWindowHandles();
		for(String handles :child)
		{
			if(!handles.equals(parent))
			{
				driver.switchTo().window(handles);
				driver.findElement(By.id("confirmBox")).click();
				driver.switchTo().alert().dismiss();
				System.out.println(driver.findElement(By.id("output")).getText());
				driver.close();
			}
	}
		driver.switchTo().window(parent);
		driver.findElement(By.id("name")).sendKeys("Vihaan");
		driver.close();
	}

}
