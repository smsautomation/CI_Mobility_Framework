package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Non_Serialised_Asset_Info
* Purpose: This class contains all of the elements in the C&I Non-Serialised Asset Information section
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

public class CI_Objects_Non_Serialised_Asset_Info {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Non_Serialised_Asset_Info";

      
    	public static WebElement cbx_non_serialised_assets(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |cbx_non_serialised_assets not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_asset_quantity(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_asset_quantity not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement cbx_aerial_location(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |cbx_aerial_location not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    
    	public static WebElement btn_operation_confirmed(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_operation_confirmed not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement txt_upi_value(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_upi_value not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}

    	public static WebElement txt_elec_install_details(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_elec_install_details not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}

    	public static WebElement btn_add_another_asset(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_add_another_asset not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}

    	public static WebElement btn_next_section(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_next_section not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}

			
//END OF METHODS	    
}
