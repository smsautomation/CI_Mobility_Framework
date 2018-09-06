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
    		element = driver.findElement(By.id("polaritycheckmartindaleinit-pluginTestSelectPCM"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_polarity_check_plug_in_test not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
	public static WebElement txt_unable_to_test_polarity(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("polaritycheckmartindaleinit-unableToTestNotesPCM"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_unable_to_test_polarity not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}        
    
    public static WebElement btn_socket_safety_test_pass(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("polaritycheckmartindaleinit-p3PCM"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_socket_safety_test_pass not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }    
	
    public static WebElement btn_socket_safety_test_fail(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("polaritycheckmartindaleinit-ps4PCM"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_socket_safety_test_fail not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 	
    
    public static WebElement cbx_socket_test_location(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("polaritycheckmartindaleinit-select2PCM"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_socket_test_location not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
        
    public static WebElement btn_photo_pre_installation_martindale_test(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("photopluginTestPass"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_pre_installation_martindale_test not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }     
    
    public static WebElement btn_socket_reverse_polarity_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("polaritycheckmartindaleinit-ps5PCM"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_socket_reverse_polarity_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }      
    
    public static WebElement btn_socket_reverse_polarity_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("polaritycheckmartindaleinit-ps6PCM"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_socket_reverse_polarity_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }      
      
    public static WebElement cbx_reverse_socket_location_1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("polaritycheckmartindaleinit-select3PCM-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_socket_test_location_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }    
    
	public static WebElement txt_number_reverse_sockets_1(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("polaritycheckmartindaleinit-input-plugTestFail1PCM-0"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_number_reverse_sockets_1 not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}    
	
    public static WebElement cbx_reverse_socket_location_2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("polaritycheckmartindaleinit-select3PCM-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_socket_test_location_2 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }    
    
	public static WebElement txt_number_reverse_sockets_2(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("polaritycheckmartindaleinit-input-plugTestFail1PCM-1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_number_reverse_sockets_2 not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	} 
    
	public static WebElement btn_add_another(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("polaritycheckmartindaleinit-btn2PCM2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_add_another not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	} 
	
	public static WebElement txt_cust_witness_info(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("textCustomerWitnessNotesPCM"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_cust_witness_info not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	} 
    
    public static WebElement btn_all_sockets_completed(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("polaritycheckmartindaleinit-btn3PCM"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_all_sockets_completed not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 
    
    public static WebElement btn_next_section(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("polaritycheckmartindaleinit-btn2PCM1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_next_section not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
	
    // all other fields in this section are not happy path and so have not yet been included
	
			
//END OF METHODS	    
}
