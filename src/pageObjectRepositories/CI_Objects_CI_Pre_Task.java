package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_CI_Pre_Task
* Purpose: This class contains all of the elements in the C&I CI Pre-Task section, but in the format Ben has developed the screen
*          Ben has used a dropdown list from which the meter supply type is selected, rather than tickboxes
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

public class CI_Objects_CI_Pre_Task {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_CI_Pre_Task";

      
    	public static WebElement cbx_sub100_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |cbx_sub100_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	 	
     	public static WebElement cbx_COP_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |cbx_cop10_wc_1ph_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}  
    
    	public static WebElement cbx_SUB_MET_meter_supply(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |cbx_sub_met_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}

    	public static WebElement cbx_DNO_BNO_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |cbx_dno_bno_WC_1PH_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_photos_allowed_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_photos_allowed_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_photos_allowed_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_dno_bno_hv_ct_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
  
    
//END OF METHODS	    
}
