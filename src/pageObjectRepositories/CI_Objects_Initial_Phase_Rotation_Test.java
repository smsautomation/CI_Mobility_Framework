package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Initial_Phase_Rotation_Test
* Purpose: This class contains all of the elements in the C&I Initial Phase Rotation Test section
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

public class CI_Objects_Initial_Phase_Rotation_Test {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Initial_Phase_Rotation_Test";

      
    public static WebElement btn_phase_rotation_correct_at_meter_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radioPhaseRotationCorrectTrue"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_rotation_correct_at_meter_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_phase_rotation_correct_at_meter_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radioPhaseRotationCorrectFalse"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_rotation_correct_at_meter_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }    

    public static WebElement btn_are_tails_labelled_ok(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.className("confirm"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_are_tails_labelled_ok not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 
    
    public static WebElement btn_phase_rotation_correct_at_service_cut_out_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.className("confirm"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_rotation_correct_at_meter_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_phase_rotation_correct_at_service_cut_out_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_rotation_correct_at_service_cut_out_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }     
	
			
//END OF METHODS	    
}
