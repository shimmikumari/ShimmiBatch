package selenuim.selenuim;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class search {
	public void driver() {
		ChromeDriver refe=new ChromeDriver();
		refe.get("https://reddif.com");
		Options op=refe.manage();
		Window w=op.window();
		w.maximize();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  search s=new search();
  s.driver();
	}

}
