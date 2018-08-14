package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 03/07/2018
* Function: CI_Objects_Check_For_Smell_Of_Gas
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

public class CI_Objects_Init_Risk_Assess {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Check_For_Smell_Of_Gas";

      
    public static WebElement btn_smell_gas_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radioai1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_smell_gas_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_smell_gas_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radioai2"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_smell_gas_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_turned_off_gas(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiorai3"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_turned_off_gas_ not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_called_egp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiorai5"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_called_egp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_egp_ref_no(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("input1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_egp_ref_no not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_reported_to_airline_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiorai7"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_reported_to_airline_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_reported_to_airline_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiorai8"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_reported_to_airline_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_airline_ref(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("input2"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_airline_ref not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_ok_to_proceed_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiorai9"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_ok_to_proceed_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_ok_to_proceed_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiorai10"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_ok_to_proceed_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_abort(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btn2"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_abort not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
 
			
//END OF METHODS	    
}
