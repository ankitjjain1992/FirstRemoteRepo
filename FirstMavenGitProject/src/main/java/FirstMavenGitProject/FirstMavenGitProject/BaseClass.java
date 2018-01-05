package FirstMavenGitProject.FirstMavenGitProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	WebDriver driver;
	@BeforeClass
	public void Precondition()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com");
		
	}
	
	@AfterClass
	public void Postcondition()
	{
		driver.quit();
	}

}
