package maven.demoprj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
       /* driver.get("https://opensource-demo.orangehrmlive.com/");
       // driver.findElement(By.id("txtUsername")).sendKeys("Admin");
       // driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        
        String str=driver.findElement(By.id("txtUsername")).getAttribute("Admin");
        System.out.println(str);
        System.out.println(driver.findElement(By.id("txtPassword")).getAttribute("admin123"));
        
        driver.findElement(By.xpath("//*[id=\"btnLogin\"]")).getAttribute("Admin");
	*/
       
        //Double Click
        
        driver.get("https://demoqa.com/buttons");
        
       /* WebElement element=driver.findElement(By.id("doubleClickBtn"));
        Actions act=new Actions(driver);
        act.doubleClick(element).build().perform();
        
        //Click
        
        String str=driver.findElement(By.xpath("//button[txt='Click Me']")).getAttribute("id");
        System.out.println(str);*/
        
        //RightClick
        
      /* String str1=driver.findElement(By.xpath("//*[txt='rightClickMessage']")).getAttribute("id");
        System.out.println(str1);*/
        
        WebElement element=driver.findElement(By.id("rightClickBtn"));
        Actions act=new Actions(driver);
        act.contextClick(element).build().perform();
        
        
        
        
	}
	

}
