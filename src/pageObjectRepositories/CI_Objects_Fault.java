package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 05/07/2018
* Function: CI_Objects_Fault
* Purpose: This class contains all of the elements in the C&I Fault section
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

public class CI_Objects_Fault {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Fault";

      
    public static WebElement btn_no_fault_found(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_no_fault_found not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_test_dial_completed_by(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_test_dial_completed_by not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_fault_type(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_fault_type not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    // Comms heading
    //Replaced Assets sub-section
    
    public static WebElement btn_replaced_any_assets_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_replaced_any_assets_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_replaced_any_assets_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_replaced_any_assets_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_type_of_asset(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_type_of_asset not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
	// Conditional Fields heading
    //GSM/GPRS Modem sub-section
   
  public static class MODEM_GSM_GPRS{  
    
    public static WebElement txt_removed_modem_serial_no(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_removed_modem_serial_no not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_new_modem_serial_no(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_new_modem_serial_no not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_baud_rate(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_baud_rate not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
  } 
  // END OF CLASS MODEM_GSM_GPRS
    
    // PSTN sub-section
    
  public static class MODEM_PSTN{
	  
    public static WebElement txt_removed_modem_serial_no(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_removed_modem_serial_no not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_new_modem_serial_no(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_new_modem_serial_no not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_prev_modem_not_pstn(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_prev_modem_not_pstn not found | Exception desc : "+e.getMessage());
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
    		Log.error(sRepositoryName + " |txt_cust_name not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
     
    
  }  
  // END OF CLASS MODEM_PSTN  
  
  // Other Modem sub-section
  public static class MODEM_OTHER{
	  
	 public static WebElement txt_removed_modem_serial_no(WebDriver driver) {
	    	
	    try {
	    	element = driver.findElement(By.id(INSERTID));
	    }catch(Exception e) {
	    	Log.error(sRepositoryName + " |txt_removed_modem_serial_no not found | Exception desc : "+e.getMessage());
	    }
	    return element;
	  }
	    
	 public static WebElement txt_new_modem_serial_no(WebDriver driver) {
	    	
	    try {
	    	element = driver.findElement(By.id(INSERTID));
	    }catch(Exception e) {
	    	Log.error(sRepositoryName + " |txt_new_modem_serial_no not found | Exception desc : "+e.getMessage());
	    }
	    return element;
	 }
	     
	 public static WebElement txt_comms_nos(WebDriver driver) {
	    	
		 try {
		    element = driver.findElement(By.id(INSERTID));
		 }catch(Exception e) {
		    Log.error(sRepositoryName + " |txt_comms_nos not found | Exception desc : "+e.getMessage());
		 }
		 return element;
	 }
  }
  // END OF CLASS MODEM_OTHER
  
  // Sim sub-section
  public static class SIM{
	 
	 public static WebElement txt_sim_serial_no(WebDriver driver) {
	    	
		 try {
		    element = driver.findElement(By.id(INSERTID));
		 }catch(Exception e) {
		    Log.error(sRepositoryName + " |txt_sim_serial_no not found | Exception desc : "+e.getMessage());
		 }
		 return element;
	 } 
	  
	 public static WebElement txt_network_provider(WebDriver driver) {
	    	
		 try {
		    element = driver.findElement(By.id(INSERTID));
		 }catch(Exception e) {
		    Log.error(sRepositoryName + " |txt_network_provider not found | Exception desc : "+e.getMessage());
		 }
		 return element;
	 } 
	  
	 public static WebElement txt_comms_nos(WebDriver driver) {
	    	
		 try {
		    element = driver.findElement(By.id(INSERTID));
		 }catch(Exception e) {
		    Log.error(sRepositoryName + " |txt_comms_nos not found | Exception desc : "+e.getMessage());
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
	 
  }
  // END OF CLASS SIM

  
  
  // Meter sub-section
  
	 public static WebElement btn_can_meter_exch_y(WebDriver driver) {
	    	
		 try {
		    element = driver.findElement(By.id(INSERTID));
		 }catch(Exception e) {
		    Log.error(sRepositoryName + " |btn_can_meter_exch_y not found | Exception desc : "+e.getMessage());
		 }
		 return element;
	 }
	 
	 public static WebElement btn_can_meter_exch_n(WebDriver driver) {
	    	
		 try {
		    element = driver.findElement(By.id(INSERTID));
		 }catch(Exception e) {
		    Log.error(sRepositoryName + " |btn_can_meter_exch_n not found | Exception desc : "+e.getMessage());
		 }
		 return element;
	 }
	 
  // DNO Equipment sub-section
	 
	 public static WebElement txt_dno_fault_work(WebDriver driver) {
	    	
		 try {
		    element = driver.findElement(By.id(INSERTID));
		 }catch(Exception e) {
		    Log.error(sRepositoryName + " |txt_dno_fault_work not found | Exception desc : "+e.getMessage());
		 }
		 return element;
	 }
	 
  // Other Fault sub-section
	
	 public static WebElement txt_other_fault(WebDriver driver) {
	    	
		 try {
		    element = driver.findElement(By.id(INSERTID));
		 }catch(Exception e) {
		    Log.error(sRepositoryName + " |txt_other_fault not found | Exception desc : "+e.getMessage());
		 }
		 return element;
	 }
	 
  // Fault Resolution
	 
	 public static WebElement btn_is_fault_fixed_y(WebDriver driver) {
	    	
		 try {
		    element = driver.findElement(By.id(INSERTID));
		 }catch(Exception e) {
		    Log.error(sRepositoryName + " |btn_is_fault_fixed_y not found | Exception desc : "+e.getMessage());
		 }
		 return element;
	 }
	 
	 public static WebElement btn_is_fault_fixed_n(WebDriver driver) {
	    	
		 try {
		    element = driver.findElement(By.id(INSERTID));
		 }catch(Exception e) {
		    Log.error(sRepositoryName + " |btn_is_fault_fixed_n not found | Exception desc : "+e.getMessage());
		 }
		 return element;
	 }
	 
	 public static WebElement txt_fault_not_resolved(WebDriver driver) {
	    	
		 try {
		    element = driver.findElement(By.id(INSERTID));
		 }catch(Exception e) {
		    Log.error(sRepositoryName + " |txt_fault_not_resolved not found | Exception desc : "+e.getMessage());
		 }
		 return element;
	 }
	 
	 
	 
//END OF METHODS	    
}
