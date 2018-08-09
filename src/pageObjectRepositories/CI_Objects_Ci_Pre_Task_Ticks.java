package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 03/07/2018
* Function: CI_Objects_CI_Pre_Task_Ticks
* Purpose: This class contains all of the elements in the C&I CI Pre-Task section - this is in the format as specified in the workflow doc
* 		   Either this or the CI_Pre_Task_Ben will be deleted, once it is determined which will be how the workflow looks
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

public class CI_Objects_Ci_Pre_Task_Ticks {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_CI_Pre_Task_Ticks";

    public static class SUB100_SERVICE_LINES_JOBS{
    
    	public static WebElement btn_sub100_wc_1ph_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_sub100_wc_1ph_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_sub100_wc_3ph_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_sub100_wc_3ph_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_sub100_lv_ct_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_sub100_lv_ct_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
   
    	public static WebElement btn_sub100_hv_ct_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_sub100_hv_ct_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    }
    
// END 	OF SUB100_SERVICE_LINE_JOBS
	
    public static class COPS_SERVICE_LINES_JOBS{
    	
     	public static WebElement btn_cop10_wc_1ph_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_cop10_wc_1ph_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}  
    
    	public static WebElement btn_cop10_wc_3ph_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_cop10_wc_3ph_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}      

    	public static WebElement btn_cop10_lv_ct_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_cop10_lv_ct_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}      
   
    
    	public static WebElement btn_cop5_wc_1ph_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_cop5_wc_1ph_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}   

    	public static WebElement btn_cop5_lv_meter_supply(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_cop5_lv_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	} 
    	
    	public static WebElement btn_cop5_hv_meter_supply(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_cop5_hv_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_cop3_lv_meter_supply(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_cop3_lv_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_cop3_hv_meter_supply(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_cop3_hv_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}    	
    	
    	public static WebElement btn_cop2_meter_supply(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_cop2_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}    	
    	
    }
    
// END OF COPS_SERVICE_LINE_JOBS
    
    
    public static class SUB_METERING_SERVICE_LINES_JOBS{
    
    	public static WebElement btn_sub_met_wc_1ph_meter_supply(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_sub_met_wc_1ph_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_sub_met_wc_3ph_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_sub_met_wc_3ph_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_sub_met_lv_ct_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_sub_met_lv_ct_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
   
    	public static WebElement btn_sub_met_panel_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_sub_met_panel_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    }
    
// END 	OF SUB_METERING_SERVICE_LINE_JOBS
    	
    
    public static class DNO_BNO_SERVICE_LINES_JOBS{
        
    	public static WebElement btn_dno_bno_wc_1ph_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_dno_bno_wc_1ph_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_dno_bno_wc_3ph_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_dno_bno_wc_3ph_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_dno_bno_lv_ct_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_dno_bno_lv_ct_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
   
    	public static WebElement btn_dno_bno_hv_ct_meter_supply(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_dno_bno_hv_ct_meter_supply not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    }
    
// END 	OF DNO/BNO_SERVICE_LINE_JOBS    	
    
    
    public static class ALL_SERVICE_LINES{
    	
    	public static WebElement btn_photos_allowed_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_photos_allowed_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_photos_allowed_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_photos_allowed_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    }
    
// END OF ALL_SERVICE_LINES    
    
//END OF METHODS	    
}
