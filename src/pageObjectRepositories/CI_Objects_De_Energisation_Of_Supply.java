package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 05/07/2018
* Function: CI_Objects_De_Energisation_Of_Supply
* Purpose: This class contains all of the elements in the C&I De-energisation of Supply section
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

public class CI_Objects_De_Energisation_Of_Supply {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_De_Energisation_Of_Supply";

      
    public static WebElement btn_supply_de_energised_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_supply_de_energised_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_supply_de_energised_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_supply_de_energised_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_cancel_abort_reason(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_cancel_abort_reason not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_supply_de_energised(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_supply_de_energised not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_safety_label_fitted(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_safety_label_fitted not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_all_seals_intact(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_all_seals_intact not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_visual_inspection_completed(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_visual_inspection_completed not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
  
			
//END OF METHODS	    
}
