package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Phase_Rotation_Test
* Purpose: This class contains all of the elements in the C&I Phase Rotation Test section
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

public class CI_Objects_Phase_Rotation_Test {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Phase_Rotation_Test";

      
    public static WebElement btn_phase_rotation_correct_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiophaseRotationCorrectTruePR"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_rotation_correct_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_phase_rotation_correct_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiophaseRotationCorrectFalsePR"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_rotation_correct_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    // *!*!*!*!*!*!* the 2 fields below are not described in the workflow doc *!*!*!*!*!*!*
    
    public static WebElement btn_corrected_phase_rotation_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiocorrectedPhaseRotationTruePR"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_corrected_phase_rotation_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_corrected_phase_rotation_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiocorrectedPhaseRotationFalsePR"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_corrected_phase_rotation_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    // ****************************************************************
    
    public static WebElement btn_abort(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btn2JCIT"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_abort not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    

	
			
//END OF METHODS	    
}
