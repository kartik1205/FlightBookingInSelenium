package uipckg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class bookflightpage {
 
WebDriver driver;
 
public bookflightpage(WebDriver driver){
this.driver=driver;
}

@FindBy(how=How.NAME,using="passFirst0")
@CacheLookup
WebElement firstName;
@FindBy(how=How.NAME,using="passLast0")
@CacheLookup
WebElement lastName;
@FindBy(how=How.NAME,using="pass.0.meal")
@CacheLookup
WebElement meal;
@FindBy(how=How.NAME,using="creditCard")
@CacheLookup
WebElement cardType;
@FindBy(how=How.NAME,using="creditnumber")
@CacheLookup
WebElement cardNumber;
@FindBy(how=How.NAME,using="cc_exp_dt_mn")
@CacheLookup
WebElement expMonth;
@FindBy(how=How.NAME,using="cc_exp_dt_yr")
@CacheLookup
WebElement expYears;
@FindBy(how=How.NAME,using="cc_frst_name")
@CacheLookup
WebElement cardFirstNames;
@FindBy(how=How.NAME,using="cc_mid_name")
@CacheLookup
WebElement cardMidName;
@FindBy(how=How.NAME,using="cc_last_name")
@CacheLookup
WebElement cardLastName;
@FindBy(how=How.XPATH,using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[23]/td/input")
@CacheLookup
WebElement purchase;
 
public void purchasePress(String fname,String lname,String meal2,String cType,String cNumber,String eMonth,String eYear,String cFirstName,String cMiddleName,String cLastName){
try {
	
Thread.sleep(2000);
firstName.sendKeys(fname);
Thread.sleep(2000);
lastName.sendKeys(lname);
Thread.sleep(2000);
meal.sendKeys(meal2);
Thread.sleep(2000);
cardType.sendKeys(cType);
Thread.sleep(2000);
cardNumber.sendKeys(cNumber);
Thread.sleep(2000);
expMonth.sendKeys(eMonth);
Thread.sleep(2000);
expYears.sendKeys(eYear);
Thread.sleep(2000);
cardFirstNames.sendKeys(cFirstName);
Thread.sleep(2000);
cardMidName.sendKeys(cMiddleName);
Thread.sleep(2000);
cardLastName.sendKeys(cLastName);
Thread.sleep(2000);
purchase.click();
Thread.sleep(2000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}