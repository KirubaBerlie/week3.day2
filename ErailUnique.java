package week3.day2.assignemnts;

//Set the system property and Launch the URL
//Click the 'sort on date' checkbox
//clear and type in the from station text field
//clear and type in the to station text field
//Add a java sleep for 2 seconds
//Store all the train names in a list
//Get the size of it
//Add the list into a new Set
//And print the size of it

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://erail.in/");

		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS", Keys.ENTER);

		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("TEN", Keys.ENTER);

		Thread.sleep(2000);
		List<WebElement> trainWebElements = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));

		List<String> trainNames = new ArrayList<String>();

		for (WebElement eachElement : trainWebElements) {
			trainNames.add(eachElement.getText());
		}

		System.out.println("TrainNames Size in List is " + trainNames.size());
		// Add the List inot a SET

		Set<String> tranNameSet = new HashSet<String>();
		tranNameSet.addAll(trainNames);

		System.out.println("TrainNames Size in Set is " + tranNameSet.size());

	}

};
