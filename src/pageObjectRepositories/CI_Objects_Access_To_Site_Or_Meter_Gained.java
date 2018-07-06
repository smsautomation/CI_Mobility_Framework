package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 06/07/2018
* Function: CI_Objects_Access_To_Site_Or_Meter_Gained
* Purpose: This class contains all of the elements in the C&I Access to Site or Meter Gained section
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

public class CI_Objects_Access_To_Site_Or_Meter_Gained {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Access_To_Site_Or_Meter_Gained";

      
    public static WebElement btn_on_site(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_on_site not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
 
  			
//END OF METHODS	    
}
