package GitHUB;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GitHub {
	WebDriver wd = new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("https://en.wikipedia.org/wiki/Main_Page");
	File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	//to take scrnsht getscreenshotas fn is used and to cast it takesscreenshot is used
	FileUtils.copyFile(src, new File("E:\\VMETRY PROJECTS\\WebDriver\\screensots\\flip.jpg"));
}
