package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Vt_Ct_Info_Dno_Bno
* Purpose: This class contains all of the elements in the C&I VT/CT Information for DNO/BNO and Additional Equipment section
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

public class CI_Objects_Vt_Ct_Info_Dno_Bno {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Vt_Ct_Info_Dno_Bno";

      
    public static WebElement cbx_serial_no_to_enter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_serial_no_to_enter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_ct_info_available(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_ct_info_available not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_vt_info_available(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_vt_info_available not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    






	
			
//END OF METHODS	    
}
