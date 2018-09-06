package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Initial_Polarity_Check_Failed
* Purpose: This class contains all of the elements in the C&I Initial Polarity Check Failed section
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

public class CI_Objects_Initial_Polarity_Check_Failed {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Initial_Polarity_Check_Failed";

      
	public static WebElement btn_reported_to_team_manager(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("pol7PCI"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_reported_to_team_manager not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	} 
    
    public static WebElement txt_team_manager_name(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterc1PCI"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_team_manager_name not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_team_manager_authorised_proceed_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("pol9PCI"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_team_manager_authorise_proceed_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_team_manager_authorised_proceed_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("pol10PCI"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_team_manager_authorise_proceed_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_called_airline_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("pol11PCI"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_called_airline_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }    
    
    public static WebElement btn_called_airline_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("pol12PCI"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_called_airline_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }     
    
    public static WebElement txt_airline_ref(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("formra2PCI"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_airline_ref not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 
    
    public static WebElement btn_reported_to_dno_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("pol11aPCI"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_reported_to_dno_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }      
    
    public static WebElement btn_reported_to_dno_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("pol12aPCI"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_reported_to_dno_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_dno_ref(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("formra3PCI"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_dno_ref not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 
    
    public static WebElement btn_init_polarity_check_fail_photo(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("photopolarityFail"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_init_polarity_check_fail_photo not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement btn_abort(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(btnNextPolPCI));	// not included the quotes as this id is a duplicate of the one below
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_abort not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_next_section(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(btnNextPolPCI));	// not included the quotes as this id is a duplicate of the one above
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_next_section not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
			
//END OF METHODS	    
}
