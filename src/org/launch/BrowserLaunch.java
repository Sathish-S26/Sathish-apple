package org.launch;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.jar.Attributes.Name;

import javax.net.ssl.SSLContextSpi;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {
	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".//Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		String mani = driver.getTitle();
		System.out.println(mani);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//Thread.sleep(2000);
		
		//Alert al=driver.switchTo().alert();
		//al.dismiss();
		WebElement btnClick = driver.findElement(By.xpath("//*[@id=\"src\"]"));
		btnClick.sendKeys("Vandaloor");
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"dest\"]"));
		pass.sendKeys("goa");
		WebElement date = driver.findElement(By.xpath("//*[@id=\"onward_cal\"]"));
		date.sendKeys("17-Apr-2021");
		WebElement btn = driver.findElement(By.id("search_btn"));
		btn.click();
		btn.click();
		
		
		
		
		
		
		
		
//				Actions s=new Actions(driver);
//s.contextClick(btnClick).perform();
//
//Robot r = new Robot(); 
//for (int i = 0; i < 6; i++) {
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//		}
//r.keyPress(KeyEvent.VK_ENTER);
//r.keyRelease(KeyEvent.VK_ENTER);
		}
	
}