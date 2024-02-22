package selenuim.selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {
	public  void handle() {
		ChromeDriver refe=new ChromeDriver();
		refe.get("https://www.mycarhelpline.com");
		Options op=refe.manage();
		Window w=op.window();
		w.maximize();
		WebElement username=refe.findElement(By.xpath("//div[@id='bluemenu']"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   xpath1 s=new xpath1();
   s.handle();
	}

}
