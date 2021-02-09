package tc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class edgehome {
@Test
public void login1()
{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\pc\\Desktop\\drivers\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.amazon.com");
}
	
}
