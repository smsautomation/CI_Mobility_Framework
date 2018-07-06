package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 06/07/2018
* Function: CI_Objects_AA_OK_Pop_Up
* Purpose: Just to save it somewhere so that when I need it, it can be added in where necessary
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

public class CI_Objects_AA_OK_Pop_Up {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Arrive";

      
    public static WebElement btn_OK(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.className("confirm"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_OK not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
   
       
			
//END OF METHODS	    
}
