package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 05/07/2018
* Function: CI_Objects_Meter_Upgrade_Downgrade
* Purpose: This class contains all of the elements in the C&I Meter Upgrade or Downgrade section
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

public class CI_Objects_Meter_Upgrade_Downgrade {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Meter_Upgrade_Downgrade";

      
    	public static WebElement btn_work_required_reprogramme(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |cbx_work_required_reprogramme not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_work_required_exchange(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |cbx_work_required_exchange not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
     	
//END OF METHODS	    
}
