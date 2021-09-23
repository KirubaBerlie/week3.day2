package week3.day2.assignemnts;

//Launch the browser
//Launch the URL - https://erail.in/
//Uncheck the check box - sort on date
//clear and type in the source station 
//clear and type in the destination station
//Find all the train names using xpath and store it in a list
//Use Java Collections sort to sort it and then print it

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSorting {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://erail.in/");
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MS", Keys.ENTER);

		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("TEN", Keys.ENTER);

		driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(1000);

		List<WebElement> trainNames = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));

		List<String> strList = new ArrayList<String>();

		for (WebElement trname : trainNames) {

			strList.add(trname.getText());
		}
		Collections.sort(strList);

		for (String str : strList) {
			System.out.println(str);

		}
		
	}

}
