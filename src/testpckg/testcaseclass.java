package testpckg;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import frameworkpckg.browsersetting;
import frameworkpckg.screenshot;
import uipckg.bookflightpage;
import uipckg.flightconfirmpage;
import uipckg.flightfinderpage;
import uipckg.loginpage;
import uipckg.selectflightpage;
 
public class testcaseclass extends helperclass {
 
public testcaseclass(){
}
 
@Test
public void returnTicket() {
try {
System.out.println("in returnTicket");
driver.get("http://newtours.demoaut.com/");
loginpage loginPage = PageFactory.initElements(driver, loginpage.class);
loginPage.loginWordPress("mercury", "mercury");
flightfinderpage flightFinderpage = PageFactory.initElements(driver, flightfinderpage.class);
flightFinderpage.continueWordPress("1","Zurich","July","12","Frankfurt","September","15","Business Class","Unified Airlines");
selectflightpage selectFlightPage = PageFactory.initElements(driver, selectflightpage.class);
selectFlightPage.departAirlineWordPress("Pangaea Airlines 362");
selectFlightPage.returnAirlineWordPress("Unified Airlines 363");
selectFlightPage.continu();
bookflightpage bookFlightPage = PageFactory.initElements(driver, bookflightpage.class);
bookFlightPage.purchasePress("Anirudh", "AS", "Vegetarian", "MasterCard", "12345678", "12", "2008", "Anirudh", "A", "S");
flightconfirmpage flightConfirmationPage = PageFactory.initElements(driver, flightconfirmpage.class);
String bookingDetailsFile = System.getProperty("user.dir")+"\\ScreenShotsFlightConfirmationDetails"+screenshot.getDateTimeStamp()+".png";
try {screenshot.getScreenShot(browsersetting.getDriver(), bookingDetailsFile);
} catch (Exception e) {e.printStackTrace();}
 
flightConfirmationPage.logoutPress();
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
 
}
}