package baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.print.DocFlavor.STRING;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseclassSyntex {
	
	
	WebDriver driver;
	
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	
	public void launchurl1(String url) {
		driver.get(url);
		}
	
	public void entertext1(WebElement ref,String name) {
		ref.sendKeys(name);
		}

	
	
public void launchurl(String data) {
	driver.get(data);
	}
public void entertext(WebElement ref,String name) {
	ref.sendKeys(name);
	}
public void btnclick(WebElement ref) {
	
ref.click();
}
public void gettext(WebElement ref) {
	ref.getText();
	}
public void getattribute(WebElement ref,String value) {
 	ref.getAttribute(value);

 
}
public void mouseoveraction(WebElement ref) {
	
	Actions ac =new Actions(driver);
	ac.moveToElement(ref);
	
	}
public void draganddrop(WebElement ref1,WebElement ref2) {
	Actions ac=new Actions(driver);
	ac.dragAndDrop(ref1,ref2);
}

public void doubleclick(WebElement ref) {
	Actions ac=new Actions(driver);
	ac.doubleClick(ref);
	}
public void rightclick(WebElement ref) {
	Actions ac=new Actions(driver);
	ac.contextClick(ref);
}

public void simplealert() {
	Alert al=driver.switchTo().alert();
	al.accept();al.dismiss();
   }
public void robot(int ref ) throws AWTException {
	Robot rc=new Robot();
	rc.keyPress(ref);
	rc.keyRelease(ref);
	}
public void JAVASCRIPT(String date,WebElement ref) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttributr('value','"+date+"')",ref);
}
public void select(WebElement ref,int i) {
	Select a=new Select(ref);
	a.selectByIndex(i);
	}
 public void selectvt(WebElement ref,String a) {
	 Select a1=new Select(ref);
	 a1.selectByVisibleText(a);
}
 public void selectvalue(WebElement ref,String a) {
	 Select a2=new Select(ref);
	 a2.selectByValue(a);
	}

public void alloptions(WebElement ref) {
	 Select a2=new Select(ref);
List<WebElement> options = a2.getOptions();
}
public void allselectedoptions(WebElement ref) {
	Select a=new Select(ref);
	a.getAllSelectedOptions();
}
public void Firstselectedoptions(WebElement ref) {
	Select a=new Select(ref);
a.getFirstSelectedOption();
}
public void ismultiple(WebElement ref) {
	Select a=new Select(ref);
	a.isMultiple();
	}
public void deselectbyindes(WebElement ref,int i) {
	Select a=new Select(ref);
a.deselectByIndex(i);
}
public void deselectbyvalue(WebElement ref,String i) {
	Select a=new Select(ref);
a.deselectByValue(i);
}
public void deselectbyvt(WebElement ref,String i) {
	Select a=new Select(ref);
a.deselectByVisibleText(i);
}

public void deselectall(WebElement ref) {
	Select a=new Select(ref);
a.deselectAll();

}
public void framesstring(WebElement rf) {
	driver.switchTo().frame(rf);

}
public void framesid(int id) {
	driver.switchTo().frame(id);

}

public void framesid(String name) {
	driver.switchTo().frame(name);
}

public void framecount() {
	 driver.findElement(By.tagName("img")).getSize();

}



} 
