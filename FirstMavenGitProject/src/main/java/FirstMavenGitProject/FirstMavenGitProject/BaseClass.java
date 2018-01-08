package FirstMavenGitProject.FirstMavenGitProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	WebDriver driver;
	@Parameters({ "Url" })
	@BeforeClass
	public void Precondition(String Url)
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		Reporter.log("Opening :"+Url,true);
		driver.get(Url);
	}
	
	@AfterClass
	public void Postcondition()
	{
		driver.quit();
	}
	

}
