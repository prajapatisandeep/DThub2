package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1
{
public static void main(String[] args) 
{
	System.out.println("I am updating the code");
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\chromedriver.exe");	
ChromeDriver deepak=new ChromeDriver();
deepak.get("https://www.facebook.com");
deepak.manage().window().maximize();

WebElement user =deepak.findElement(By.id("email"));	
user.sendKeys("Deepak");
WebElement password=deepak.findElement(By.cssSelector("input#pass"));
password.sendKeys("chanana");
WebElement login=deepak.findElement(By.id("loginbutton"));
login.click();
}	
	

}
