package micro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bio {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	@Test
	public void execute()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in");
		System.out.println("Hello");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
