package junit;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junit {
	
static  WebDriver driver;

@BeforeClass
public static void beforeclass() {

	System.setProperty("webdriver.chrome.driver", "C:\\selenium works\\frames\\BaseClass\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
}
@AfterClass

public static void afterclass() {
   driver.quit();

}

@Before

public void before() {
	
}
@After
public void after() {
	
}

@Test
public void test() {
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Mathan");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
driver.findElement(By.xpath("//input[@id='login']")).click();



}



}
