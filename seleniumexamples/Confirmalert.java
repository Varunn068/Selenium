package seleniumexamples;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Confirmalert {

	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
driver.findElement(By.id("confirmBox")).click();
 Alert confirm = driver.switchTo().alert();
 confirm.dismiss();
 System.out.println(driver.findElement(By.id("output")).getText());
 driver.close();


	}

}
