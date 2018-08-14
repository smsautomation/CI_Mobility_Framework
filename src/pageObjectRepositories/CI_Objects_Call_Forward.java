package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 06/07/2018
* Function: CI_Objects_Call_Forward
* Purpose: This class contains all of the elements in the C&I Call Forward and Display Call Forward sections
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

public class CI_Objects_Call_Forward {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Call_Forward";

    public static WebElement btn_call_forward(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btnCall1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_call_forward not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
          
    public static WebElement btn_contact_made_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radio1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_contact_made_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_contact_made_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radio2"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_contact_made_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    

    
    // Conditional Fields sub-section
    
    public static WebElement btn_appt_confirm_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radio3"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_appt_confirm_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_appt_confirm_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radio4"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_appt_confirm_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_addnl_access_details(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("notes"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_addnl_access_details not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_depart(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btnCall1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_depart not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_abort(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_abort not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_suspend(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_suspend not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    // Depart for Appointment Pop Up Dialog
    
    public static WebElement btn_ok(WebDriver driver) {
    	
    	try {
    		//element = driver.findElement(By.className("confirm"));
    		element = driver.findElement(By.id("btnCall2"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_ok not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_cancel(WebDriver driver) {
    	
    	try {
    		//element = driver.findElement(By.className(INSERTID));
    		element = driver.findElement(By.id("btnCall3"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_cancel not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    
			
//END OF METHODS	    
}
