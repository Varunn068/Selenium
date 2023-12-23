package seleniumexamples;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SimpleAlertbox {

	public static void main(String[] args) throws InterruptedException {

   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
   driver.findElement(By.xpath("//button[@id='alertBox']")).click();
  
  System.out.println(driver.switchTo().alert().getText());
  driver.switchTo().alert().accept();
  System.out.println(driver.findElement(By.id("output")).getText());
  driver.close();

	}

}
