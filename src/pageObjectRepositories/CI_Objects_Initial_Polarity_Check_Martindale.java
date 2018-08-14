package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Initial_Polarity_Check_Martindale
* Purpose: This class contains all of the elements in the C&I Initial Polarity Check - Martindale Test section
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

public class CI_Objects_Initial_Polarity_Check_Martindale {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Initial_Polarity_Check_Martindale";

      
    public static WebElement cbx_polarity_check_plug_in_test(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_polarity_check_plug_in_test not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
	public static WebElement txt_unable_to_test_polarity(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id(INSERTID));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_unable_to_test_polarity not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}        
    
    public static WebElement btn_socket_safety_test_pass(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("p3"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_socket_safety_test_pass not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }    
	
    public static WebElement btn_socket_safety_test_fail(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("ps4"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_socket_safety_test_fail not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 	
    
    public static WebElement cbx_socket_test_location(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("select2"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_socket_test_location not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
        
    public static WebElement btn_photo_socket_test(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_socket_test not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }     
    
    public static WebElement btn_socket_reverse_polarity_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("ps5"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_socket_reverse_polarity_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }      
    
    public static WebElement btn_socket_reverse_polarity_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("ps6"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_socket_reverse_polarity_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }      
    
    public static WebElement cbx_reverse_socket_location(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("select3"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_socket_test_location not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }    
    
	public static WebElement txt_number_reverse_sockets(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_number_reverse_sockets not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}    
    
	public static WebElement txt_cust_witness_info(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id(INSERTID));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_cust_witness_info not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	} 
    
    public static WebElement btn_all_sockets_completed(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_all_sockets_completed not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 
    
    public static WebElement btn_next_section(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btnNextPlug"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_next_section not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
	
    // all other fields in this section are not happy path and so have not yet been included
	
			
//END OF METHODS	    
}
