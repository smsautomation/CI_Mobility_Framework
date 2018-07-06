package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Modem_Comms_Details
* Purpose: This class contains all of the elements in the C&I Modem/Comms Details section
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

public class CI_Objects_Modem_Comms_Details {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Modem_Comms_Details";


// Removed Modem/Comms Details section   
    
    	public static WebElement btn_old_modem_removed_y(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_old_modem_removed_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_old_modem_removed_n(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_old_modem_removed_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement txt_removed_modem_serial_no(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_removed_modem_serial_no not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
// Installed Modem/Comms Details section    

    	public static WebElement cbx_type_of_modem(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |cbx_type_of_modem not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
// Conditional Fields/Sections
    
    public static class GSM_GPRS{
    
    	public static WebElement txt_modem_serial_no(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_modem_serial_no not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement txt_sim_serial_no(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_sim_serial_no not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement txt_comms_no(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_comms_no not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement txt_ip_address(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_ip_address not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement cbx_modem_baud_rate(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |cbx_modem_baud_rate not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}

    }
    
    // END OF CLASS GSM_GPRS
    
    
    public static class PSTN{
        
    	public static WebElement txt_modem_serial_no(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_modem_serial_no not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_bt_line_available(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_bt_line_available not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_comms_available(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_comms_available not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement txt_comms_no(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_comms_no not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    		// ALERT - POP-UP? - Remember BT Sticker
    	
    	public static WebElement btn_cust_advised(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_cust_advised not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement txt_cust_name(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_cust_name not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement txt_cust_contact_details(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_cust_contact_details not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
     }
    
    // END OF PSTN CLASS
    
    public static class PAKNET{
        
    	public static WebElement txt_pad_serial_no(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_modem_serial_no not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement txt_comms_no(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_modem_serial_no not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}  	
    	
    }
    
    // END OF PAKNET CLASS
    
    public static class OTHER{
        
    	public static WebElement txt_modem_serial_no(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_modem_serial_no not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement txt_comms_no(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_modem_serial_no not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}  	
    	
    }
    
    // END OF OTHER CLASS
    
			
//END OF METHODS	    
}
