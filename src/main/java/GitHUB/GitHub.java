package GitHUB;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class GitHub {
	@Test
	public void logintest() throws IOException
	{
	WebDriver wd = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","D:\\Sumithra Seleniun Eclipse\\PracticeBDD\\Resource\\chromedriver.exe");
		//WebDriver wd=new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://www.google.co.in/");
	File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	//to take scrnsht getscreenshotas fn is used and to cast it takesscreenshot is used

		FileUtils.copyFile(src, new File("E:\\VMETRY PROJECTS\\WebDriver\\screensots\\flip.jpg"));
			
	wd.quit();
}
}