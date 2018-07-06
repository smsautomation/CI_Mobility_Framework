package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 05/07/2018
* Function: CI_Objects_Removal_Of_All_Equipment
* Purpose: This class contains all of the elements in the C&I Removal of All Equipment section
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

public class CI_Objects_Removal_Of_All_Equipment {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Removal_Of_All_Equipment";

      
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
    

			
//END OF METHODS	    
}
