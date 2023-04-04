package seleniumSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumSetUp {
	
	public static void main(String[] arg) {
		System.setProperty("webdriver.chrome.driver", "/Users/sherensikandar/PrimeTech/tools");
		
		String str=new String();
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
	}

}
