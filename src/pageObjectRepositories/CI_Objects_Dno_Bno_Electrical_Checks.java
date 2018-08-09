package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 05/07/2018
* Function: CI_Objects_DNO_BNO_Electrical_Checks
* Purpose: This class contains all of the elements in the C&I DNO/BNO Electrical Checks section
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

public class CI_Objects_Dno_Bno_Electrical_Checks {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_DNO_BNO_Electrical_Checks";

      
    public static WebElement btn_able_to_polarity_checks_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_polarity_checks_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_able_to_polarity_checks_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_polarity_checks_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_polarity_checked_at_cut_out(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_polarity_checked_at_cut_out not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_polarity_checked_at_test_block(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_polarity_checked_at_test_block not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_polarity_checked_at_cust_main_switch(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_polarity_checked_at_cust_main_switch not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_polarity_checked_at_cust_isolation(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_polarity_checked_at_cust_isolation not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_able_to_phase_rotation_tests(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_phase_rotation_tests not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_phase_rotation_at_cut_out(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_rotation_at_cut_out not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_phase_rotation_at_test_block(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_rotation_at_test_block not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_phase_rotation_at_cust_main_switch(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_rotation_at_cust_main_switch not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_reason_no_polarity_phase_rotation(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_reason_no_polarity_phase_rotation not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    
    
	
			
//END OF METHODS	    
}
