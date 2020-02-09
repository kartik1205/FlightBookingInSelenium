package uipckg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class flightfinderpage {
 
WebDriver driver;
 
public flightfinderpage(WebDriver driver){
this.driver=driver;
}

@FindBy(how=How.XPATH,using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")
@CacheLookup
WebElement roundTrip;
@FindBy(how=How.XPATH,using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")
@CacheLookup
WebElement onewayTrip;
@FindBy(how=How.NAME,using="passCount")
@CacheLookup
WebElement passCount;
@FindBy(how=How.NAME,using="fromPort")
@CacheLookup
WebElement fromPort;
@FindBy(how=How.NAME,using="fromMonth")
@CacheLookup
WebElement fromMonth;
@FindBy(how=How.NAME,using="fromDay")
@CacheLookup
WebElement fromDay;
@FindBy(how=How.NAME,using="toPort")
@CacheLookup
WebElement toPort;
@FindBy(how=How.NAME,using="toMonth")
@CacheLookup
WebElement toMonth;
@FindBy(how=How.NAME,using="toDay")
@CacheLookup
WebElement toDay;
@FindBy(how=How.NAME,using="airline")
@CacheLookup
WebElement airline;
@FindBy(how=How.NAME,using="findFlights")
@CacheLookup
WebElement findFlights;
 
@FindBy(how=How.XPATH,using=".//*[@value='Business']")
@CacheLookup
WebElement serviceClass;
 
public void continueWordPress(String pCount, String fPort, String fMonth, String fDay, String tPort, String tMonth, String tDate,String serClass, String aline) {
try {
	
Thread.sleep(2000);
roundTrip.click();
Thread.sleep(2000);
passCount.sendKeys(pCount);
Thread.sleep(2000);
fromPort.sendKeys(fPort);
Thread.sleep(2000);
fromMonth.sendKeys(fMonth);
Thread.sleep(2000);
fromDay.sendKeys(fDay);
Thread.sleep(2000);
toPort.sendKeys(tPort);
Thread.sleep(2000);
toMonth.sendKeys(tMonth);
Thread.sleep(2000);
toDay.sendKeys(tDate);
Thread.sleep(2000);
serviceClass.sendKeys(serClass);
Thread.sleep(2000);
airline.sendKeys(aline);
Thread.sleep(2000);
findFlights.click();
Thread.sleep(2000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}