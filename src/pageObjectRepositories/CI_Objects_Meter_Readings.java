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

public class CI_Objects_Meter_Readings {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Detailed_Meter_Readings";

      
    public static WebElement cbx_serial_num_to_enter(WebDriver driver) {	// would need to run workflow through with 2+ installed meters
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_serial_num_to_enter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
public static class First_Installed_Meter {    
    
    public static WebElement btn_able_to_read_meter_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-radioUnableToReadFalseMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_read_meter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_able_to_read_meter_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-radioUnableToReadTrueMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_read_meter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement txt_no_current_meter_read(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-ranotesMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_no_current_meter_read not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement cbx_dial_end(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-dialEndSelectMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_dial_end not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_units(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-unitsSelectMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_units not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kwh_imp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-totalkwhImpMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kwh_imp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kwh_exp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-totalkwhExpMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kwh_exp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_1_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-quad1KvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_1_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_2_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-quad2KvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_2_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_3_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-quad3KvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_3_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
	
    public static WebElement txt_quad_4_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-quad4KvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_4_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvarh_imp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-TotalKvArhImpMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvarh_imp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvarh_exp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-totalKvArhExpMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvarh_exp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvah(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-totalKvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvah not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-registerMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-registerMRD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_2 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_3(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-registerMRD-2"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_3 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_4(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-registerMRD-3"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_4 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_5(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-registerMRD-4"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_5 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_6(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-registerMRD-5"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_6 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_kw_max_demand(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-kwMaxMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_kw_max_demand not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_kva_max_demand(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-kvaMaxMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_kva_max_demand not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_add_other_reg(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-btnAddNewOtherRegisterMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_add_other_reg not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_other_reg_read(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-otherRegReadMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_other_reg_read not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_other_reg_name(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterreadings40-otherRegNameMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_other_reg_name not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
// END OF FIRST INSTALLED METER CLASS
}
    
    public static WebElement btn_next_section(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btnNextCommMR1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_next_section not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    
	
			
//END OF METHODS	    
}
