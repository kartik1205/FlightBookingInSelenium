package frameworkpckg;


import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
 
public class browsersetting {
 
public static WebDriver driver;
 
public browsersetting(){
 
}
 
public static WebDriver getDriver(){
if(driver==null){
ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
options.setPageLoadStrategy(PageLoadStrategy.NONE);
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
}
return driver;
}
 
public static WebDriver getDriver(String browserName){
if(driver==null){
if(browserName.equalsIgnoreCase("firefox")){
System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
}else if(browserName.equalsIgnoreCase("chrome")){
System.out.println("in chrome");
System.setProperty("webdriver.chrome.driver", "D:chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
}else if(browserName.equalsIgnoreCase("IE")){
System.setProperty("webdriver.ie.driver", "\"C:\\\\Users\\\\admin\\\\Downloads\\\\geckodriver-v0.26.0-win64\\\\geckodriver.exe\"");
driver=new InternetExplorerDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
}
}
return driver;
}
}