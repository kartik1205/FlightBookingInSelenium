package uipckg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class selectflightpage {
 
WebDriver driver;
 
public selectflightpage(WebDriver driver){
this.driver=driver;
}
@FindBy(how=How.XPATH,using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[3]/td[1]/input")
@CacheLookup
WebElement BlueSkiesAirlines360_D;
 
@FindBy(how=How.XPATH,using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input")
@CacheLookup
WebElement BlueSkiesAirlines361_D;
 
@FindBy(how=How.XPATH,using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")
@CacheLookup
WebElement PangaeaAirlines362_D;
 
@FindBy(how=How.XPATH,using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[9]/td[1]/input")
@CacheLookup
WebElement UnifiedAirlines363_D;
 
@FindBy(how=How.XPATH,using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[3]/td[1]/input")
@CacheLookup
WebElement BlueSkiesAirlines360_T;
 
@FindBy(how=How.XPATH,using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input")
@CacheLookup
WebElement BlueSkiesAirlines361_T;
 
@FindBy(how=How.XPATH,using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input")
@CacheLookup
WebElement PangaeaAirlines362_T;
 
@FindBy(how=How.XPATH,using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[9]/td[1]/input")
@CacheLookup
WebElement UnifiedAirlines363_T;
 
@FindBy(how=How.XPATH,using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input")
@CacheLookup
WebElement con;
 
public void departAirlineWordPress(String departAirline){
try {
if(departAirline.equalsIgnoreCase("Blue Skies Airlines 360")){
BlueSkiesAirlines360_D.click();
Thread.sleep(2000);
}
if(departAirline.equalsIgnoreCase("Blue Skies Airlines 361")){
BlueSkiesAirlines361_D.click();
Thread.sleep(2000);
}
if(departAirline.equalsIgnoreCase("Pangaea Airlines 362")){
PangaeaAirlines362_D.click();
Thread.sleep(2000);
}
if(departAirline.equalsIgnoreCase("Unified Airlines 363")){
UnifiedAirlines363_D.click();
Thread.sleep(2000);
}
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
 
public void returnAirlineWordPress(String returnAirline){
try {
if(returnAirline.equalsIgnoreCase("Blue Skies Airlines 360")){
BlueSkiesAirlines360_T.click();
Thread.sleep(2000);
}
if(returnAirline.equalsIgnoreCase("Blue Skies Airlines 361")){
BlueSkiesAirlines361_T.click();
Thread.sleep(2000);
}
if(returnAirline.equalsIgnoreCase("Pangaea Airlines 362")){
PangaeaAirlines362_T.click();
Thread.sleep(2000);
}
if(returnAirline.equalsIgnoreCase("Unified Airlines 363")){
UnifiedAirlines363_T.click();
Thread.sleep(2000);
}
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
 
}
 
public void continu() {
 
con.click();
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
 
}