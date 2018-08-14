package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Polarity_Check_At_Meter
* Purpose: This class contains all of the elements in the C&I Check for Smell of Gas section
* Arguments: 
* 			
* Returns: 
**********************************************************************
* Change Log:
* 
* Date:
* Author: 
* Details:
*
*********************************************************************/

public class CI_Objects_Initial_Polarity_Check_At_Meter {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Polarity_Check_At_Meter";

      
    public static WebElement btn_polarity_check_at_cut_out_pass(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("pol3"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_polarity_check_at_cut_out_pass not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_polarity_check_at_cut_out_fail(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("pol4"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_polarity_check_at_cut_out_fail not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_polarity_check_at_meter_pass(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_polarity_check_at_meter_pass not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_polarity_check_at_meter_fail(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("pol1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_polarity_check_at_meter_fail not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
	public static WebElement txt_polarity_check_at_meter(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("pol2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_polarity_check_at_meter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}  
	
			
//END OF METHODS	    
}
