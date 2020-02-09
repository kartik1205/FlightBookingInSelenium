package testpckg;

import java.io.IOException;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
 
import frameworkpckg.browsersetting;;
//import com.edureka.frameworkPackage;
 
public class helperclass {
 
public static WebDriver driver;
browsersetting obj1;
 
public helperclass(){
}
 
@BeforeSuite
public void beforeSuite(){
 
}
 
@BeforeClass
public void beforeClass(){
System.out.println("in @BeforeClass");
}
 
@BeforeMethod
public void beforeMethodClass(){
System.out.println("in @BeforeMethod");
helperclass.driver = browsersetting.getDriver("chrome");
 
}
 
@AfterMethod
public void close()
{
//this.driver.close();
}
 
@AfterClass
public void afterClass(){
 
}
 
@AfterSuite
public void afterSuite() throws IOException, EmailException{
 
driver.quit();
}
}