package selenuim.selenuim;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class student1 {
	selenuim.selenuim.ChromeDriver refe;
	@Before
	public void inti() {
		selenuim.selenuim.ChromeDriver refe=new selenuim.selenuim.ChromeDriver();
		refe.get("https://www.facebook.com");
		Options op=refe.manage();
		Window w=op.window();
		w.maximize();	
	}
	@After
	public void closure() {
	refe.close();
	}
	@Test
	public void browserhandle() {
		ChromeDriver refe=new ChromeDriver();
		refe.get("https://www.facebook.com");
		Options op=refe.manage();
		Window w=op.window();
		w.maximize();
		WebElement username=refe.findElement(By.cssSelector("input#email"));
		username.sendKeys("Deepak");
//		WebElement createAccount=refe.findElement(By.linkText("create new Account"));
//		createAccount.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   without call using j unit
	}

}
