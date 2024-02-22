package selenuim.selenuim;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	@Test
	public void browsehandle() {
		ChromeDriver refe= new ChromeDriver();
		refe.get("https:www.facebook.com");
		Options op=refe.manage();
		Window w=op.window();
		w.maximize();
	}
// no need to call and no need to main method using j unit
}
