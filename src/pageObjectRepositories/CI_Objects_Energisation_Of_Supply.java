package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 05/07/2018
* Function: CI_Objects_Energisation_Of_Supply
* Purpose: This class contains all of the elements in the C&I Energisation of Supply section
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

public class CI_Objects_Energisation_Of_Supply {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Energisation_Of_Supply";

      
    public static WebElement btn_supply_live_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_supply_live_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_supply_live_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_supply_live_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_polarity_check_pass(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_polarity_check_pass not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_polarity_check_fail(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_polarity_check_fail not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_phase_rotation_checked(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_rotation_checked not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_cust_install_complete_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_cust_install_complete_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_cust_install_complete_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_cust_install_complete_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_supply_re_energised(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_supply_re_energised not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_supply_energised_comments(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_supply_energised_comments not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    
    public static WebElement cbx_reason_not_energised(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_reason_not_energised not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
	
//END OF METHODS	    
}
