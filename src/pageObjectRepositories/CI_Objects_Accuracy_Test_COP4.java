package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 05/07/2018
* Function: CI_Objects_Accuracy_Test_COP4
* Purpose: This class contains all of the elements in the C&I Accuracy Test (COP4) section
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

public class CI_Objects_Accuracy_Test_COP4 {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Accuracy_Test_COP4";

      
    public static WebElement btn_test_on_cust_load_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_test_on_cust_load_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_test_on_cust_load_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_test_on_cust_load_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    // need to confirm the format of the Type of Test question
    
    public static WebElement btn_test_type_b(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_test_type_b not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_test_type_c(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_test_type_c not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    // General Information sub-section
    
    public static WebElement cbx_serial_no(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_serial_no not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_start_time(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_start_time not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_error_calibration(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_error_calibration not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_test_type_undertaken(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_test_type_undertaken not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    // Test
    
    public static WebElement cbx_test_point(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_test_point not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_test_error(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_test_error not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_test_set_error(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_test_set_error not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_ct_error(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_ct_error not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_vt_error(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_vt_error not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_ok_fail(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_ok_fail not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_add_another_test(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_add_another_test not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_instrument_serial_no(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_instrument_serial_no not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_test_outcome_pass(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_test_outcome_pass not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_test_outcome_fail(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_test_outcome_fail not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_last_calibration_date(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_last_calibration_date not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_date_of_test(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_date_of_test not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    public static WebElement txt_finish_time(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_finish_time not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_signature(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_signature not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_comments(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_comments not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_save(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_save not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_test_another_meter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_test_another_meter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_completed(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_completed not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    
    
    
    
    
    
    
    
    
    
    
//END OF METHODS	    
}
