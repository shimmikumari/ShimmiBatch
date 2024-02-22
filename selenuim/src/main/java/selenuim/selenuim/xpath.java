package selenuim.selenuim;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	
	public void documentation() {
		ChromeDriver refe=new ChromeDriver();
		refe.get("https://www.facebook.com");
	Options op=refe.manage();
		Window w=op.window();
		w.maximize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
xpath s=new xpath();
s.documentation();
	}

}
