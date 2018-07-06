package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Detailed_Meter_Readings
* Purpose: This class contains all of the elements in the C&I Detailed Meter Readings section
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

public class CI_Objects_Detailed_Meter_Readings {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Detailed_Meter_Readings";

      
    public static WebElement cbx_serial_no_to_enter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_serial_no_to_enter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_unable_to_read_meter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_unable_to_read_meter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement txt_no_current_meter_read(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_no_current_meter_read not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement cbx_dial_end(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_dial_end not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_units(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_units not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kwh_imp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kwh_imp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kwh_exp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kwh_exp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_1_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_1_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_2_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_2_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_3_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_3_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
	
    public static WebElement txt_quad_4_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_4_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvarh_imp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvarh_imp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvarh_exp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvarh_exp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvah(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvah not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_2 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_3(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_3 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_4(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_4 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_5(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_5 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_6(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_6 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_kw_max_demand(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_kw_max_demand not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_kva_max_demand(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_kva_max_demand not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_other_reg_read(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_other_reg_read not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_other_reg_name(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_other_reg_name not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_next_section(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_next_section not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    
	
			
//END OF METHODS	    
}
