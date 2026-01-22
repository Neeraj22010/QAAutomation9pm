package Git;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class JenkCl {
	
	@Test
	
	public void testcase1()
	{

			EdgeOptions options = new EdgeOptions();
			options.addArguments("--headless");
			WebDriver driver = new EdgeDriver(options);
			
			driver.get("https://www.facebook.com/");
		
		
		
	}

}
