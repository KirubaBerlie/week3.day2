package week3.day2.assignemnts;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.ajio.com/");

		driver.findElement(By.name("searchVal")).sendKeys("Bags", Keys.ENTER);
		Thread.sleep(2000);

		// driver.findElement(By.id("Men")).click(); // Why we are unable to interact???
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();

		String itemsCount = driver.findElement(By.className("length")).getText();

		System.out.println("Total Number of Items: " + itemsCount);

		System.out.println("Brand Names for Men Fashion Bags");
		System.out.println("*********************************");

		List<WebElement> brandnames = driver.findElements(By.className("brand"));

		for (WebElement eachBrand : brandnames) {
			System.out.println(eachBrand.getText());

		}

		System.out.println("Fashion Men Bags NAME:");
		System.out.println("**********************");
		List<WebElement> bagNames = driver.findElements(By.className("name"));
		for (WebElement eachBagnm : bagNames) {
			System.out.println(eachBagnm.getText());
		}
		
		//Tried to bring the list in set
		Set<String> dupSet = new HashSet<String>();

		for (WebElement webElement : brandnames) {
			dupSet.add(webElement.getText());
		}

		for (String string : dupSet) {
			System.out.println(string);

		}
	}

}
