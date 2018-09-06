package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Vt_Ct_Info_Dno_Bno
* Purpose: This class contains all of the elements in the C&I VT/CT Information for DNO/BNO and Additional Equipment section
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

public class CI_Objects_Vt_Ct_Info_Dno_Bno {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Vt_Ct_Info_Dno_Bno";


    // this element is only present if more than one relevant meter has been installed, otherwise it will just default to the relevant asset
    public static WebElement cbx_serial_num_to_enter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));	// need to go through a job with multiple installed meters (LV CT/HV CT)
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_serial_num_to_enter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_ct_info_available(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));	// no id in workflow yet
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_ct_info_available not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_ct_ratio(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("textCtRatioVIFD1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_ct_ratio not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_ct_serial_num_1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("textCtSerial1VIFD1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_ct_serial_num_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_ct_serial_num_2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("textCtSerial2VTFC1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_ct_serial_num_2 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_ct_serial_num_3(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("textCtSerial3VIFD2"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_ct_serial_num_3 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_ct_class(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));	// no id in workflow yet
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_ct_class not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_ct_burden_in_va(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));	// no id in workflow yet
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_ct_burden_in_va not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_vt_info_available(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));	// no id in workflow yet
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_vt_info_available not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_vt_ratio(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));	// no id in workflow yet
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_vt_ratio not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement txt_vt_serial_num_1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("textVtSerial1VIFD"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_vt_serial_num_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement txt_vt_serial_num_2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("textVtSerial2VIFD"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_vt_serial_num_2 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_vt_serial_num_3(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("textVtSerial3VIFD"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_vt_serial_num_3 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_vt_class(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));	// no id in workflow yet
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_vt_class not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_vt_burden_in_va(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));	// no id in workflow yet
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_vt_burden_in_va not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_next_section(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btnNextCommVIFD"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_next_section not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    

	
			
//END OF METHODS	    
}
