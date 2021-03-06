package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Terminal_Test_Block_Tests
* Purpose: This class contains all of the elements in the C&I Carry Out Terminal Test Block Tests section
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

public class CI_Objects_Test_Block_Tests {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Terminal_Test_Block_Tests";

      
    public static WebElement txt_terminal_test_block(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("text4TBT"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_terminal_test_block not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_fuses_available_y(WebDriver driver) {	// sub-metering only, hence no id yet
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_fuses_available_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement btn_fuses_available_n(WebDriver driver) {	// sub-metering only, hence no id yet
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_fuses_available_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement btn_phase_corrected_at_meter_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radioPhaseRotationCorrectedAtMeterTrueTBT"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_corrected_at_meter_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_phase_corrected_at_meter_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radioPhaseRotationCorrectedAtMeterFalseTBT"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_corrected_at_meter_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_phase_corrected_at_test_block_y(WebDriver driver) {	// dno/bno only - therefore no ids yet
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_corrected_at_test_block_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_phase_corrected_at_test_block_n(WebDriver driver) {	// dno/bno only - therefore no ids yet
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_corrected_at_test_block_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_phase_rotation_corrected(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(text4TBT));	//this has been left without quotes, as this is a duplicate id
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_phase_rotation_corrected not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_next_section(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btnTestBlocksPassTBT"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_next_section not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_abort(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btnTestBlocksAbortTBT"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_abort not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
			
//END OF METHODS	    
}
