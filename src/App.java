import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) throws Exception {
        
		System.setProperty("webdriver.chrome.driver","E:\\MyTest\\WeatherTest\\src\\drivers\\chromedriver.exe");
		ChromeOptions  options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--enable-automation");
		options.addArguments("test-type=browsers");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver();

		//Test 01:Get into Website
		driver.get("https://subramanyaks.github.io/Weather-app/"); 
		Thread.sleep(10000);
		System.out.println("Successfully getting the Home Page");
		Thread.sleep(10000);
		String Title = driver.getTitle();
		System.out.println(Title);

		String PageSource = driver.getPageSource();
		int pageSourceLength = PageSource.length(); 
		System.out.println(pageSourceLength);
		
		String CurrentUrl = driver.getCurrentUrl(); 
		System.out.println(CurrentUrl);


		//Test 02:Chrome Maximization
		driver.manage().window().maximize();
		System.out.println("The chrome window is maximized");
		Thread.sleep(3000);
		WebElement p=driver.findElement(By.className("searchBar"));
		p.sendKeys("london");
		p.submit();
		
		Thread.sleep(20000);

		driver.quit();
    }
}
