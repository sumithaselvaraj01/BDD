package PraciceTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCaseTest {
	WebDriver wd;

	@Test(priority = 1,groups="mousehover")
	public void corparateprofile() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Sumithra Seleniun Eclipse\\PracticeBDD\\Resource\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://www.doosan.com/en/");
		Actions a = new Actions(wd);
		WebElement Profile = wd.findElement(By.xpath("html/body/header/div[3]/div/nav/ul/li[3]/a/span[1]"));
		a.moveToElement(Profile).build().perform();
		Reporter.log("ausgij");
		Thread.sleep(2000);

	}

	@Test(priority = 2,groups="mousehover")
	public void leadership() {
 		WebElement corparate = wd.findElement(By.xpath("html/body/header/div[3]/div/nav/ul/li[3]/ul/li[1]/a"));
		Actions a = new Actions(wd);
		a.moveToElement(corparate).build().perform();
	}

	@Test(priority = 3, description = "sample", dependsOnMethods = "leadership")
	public void board() {
		WebElement board = wd.findElement(By.xpath("html/body/header/div[3]/div/nav/ul/li[3]/ul/li[1]/ul/li[3]/a"));
		Actions a = new Actions(wd);
		a.click(board).build().perform();
	}
}
