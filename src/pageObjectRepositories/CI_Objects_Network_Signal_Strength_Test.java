package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 03/07/2018
* Function: CI_Objects_Network_Signal_Strength_Test
* Purpose: This class contains all of the elements in the C&I Carry Out Network Signal Strength Test section
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

public class CI_Objects_Network_Signal_Strength_Test {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Network_Signal_Strength_Test";

      
    public static WebElement btn_signal_strength_required(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_signal_strength_required not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
  
	public static WebElement txt_sig_strength_vod(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id(INSERTID));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_sig_strength_vod not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}    
  
	public static WebElement txt_sig_strength_o2(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id(INSERTID));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_sig_strength_o2 not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	} 
	
	public static WebElement txt_sig_strength_ee(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id(INSERTID));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_sig_strength_ee not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	} 	
    
    public static WebElement btn_enough_signal_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_enough_signal_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement btn_enough_signal_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_signal_strength_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }    
			
//END OF METHODS	    
}
