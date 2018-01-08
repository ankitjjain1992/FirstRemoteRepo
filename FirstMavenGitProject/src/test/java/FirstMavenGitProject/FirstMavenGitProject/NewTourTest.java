package FirstMavenGitProject.FirstMavenGitProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTourTest extends BaseClass
{
@Parameters({"UserName","Password"})
@Test
public void MercuryLogin(@Optional("mercury") String username,String password)
{
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@name='login']")).click();
	Reporter.log("NewTour is Login Successfull",true);
}
	
}
