package page;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Program {
	
	WebDriver driver;
		By r=By.xpath("//span[normalize-space()='Resources']");
		By tech=By.xpath("//div[@class='v-list-item__title subtitle-2'][normalize-space()='Technologies']");
		By shop=By.xpath("//a[@href='/technologies/ecommerce/shopify/']//div[@class='v-card v-card--flat v-sheet theme--light transparent']//div[@class='v-card__text d-flex align-center pa-0']");
		By button=By.xpath("//span[normalize-space()='Create a lead list']");
		By techno=By.xpath("//span[normalize-space()='Technologies']");
		public Program(WebDriver driver) {
			this.driver=driver;
		}
		public  void value()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(r).click();
			Actions actions = new Actions(driver);
			WebElement element = driver.findElement(tech);
	        actions.moveToElement(element).perform();
	        element.click();
		    driver.findElement(shop).click();
		    driver.findElement(button).click();
		    driver.findElement(techno).click();
		    
		}
	}
