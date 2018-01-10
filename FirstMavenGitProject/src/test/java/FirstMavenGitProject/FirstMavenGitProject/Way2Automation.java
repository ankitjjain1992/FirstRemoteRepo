package FirstMavenGitProject.FirstMavenGitProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Way2Automation extends BaseClass {
	
	@Test
	public void RegisterWay2Automation_Test()
	{
		
	driver.findElement(By.xpath("//a[text()='Registration']")).click();
	//driver.findElement(By.xpath())
	}

}
