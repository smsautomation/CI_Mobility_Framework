package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 06/07/2018
* Function: CI_Objects_Arrive
* Purpose: This class contains all of the elements in the C&I Arrival on Site and Arrive sections
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

public class CI_Objects_Arrive {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Arrive";

      
    public static WebElement btn_arrive(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btnArrive"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_arrive not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_capture_any_risks(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("selectInput"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_capture_any_risks not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_access_gained_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radio1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_access_gained_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_access_gained_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radio2"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_access_gained_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_cust_on_site_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radio3"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_cust_on_site_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_cust_on_site_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radio4"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_cust_on_site_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
   
       
			
//END OF METHODS	    
}
