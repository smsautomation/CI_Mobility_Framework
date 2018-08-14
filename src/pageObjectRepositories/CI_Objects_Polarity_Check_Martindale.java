package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Polarity_Check_Martindale
* Purpose: This class contains all of the elements in the C&I Polarity Check - Martindale Test section
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

public class CI_Objects_Polarity_Check_Martindale {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Polarity_Check_Martindale";

      
    public static WebElement cbx_polarity_check_plug_in_test(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_polarity_check_plug_in_test not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_unable_to_test_polarity_(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_unable_to_test_polarity not found | Exception desc : "+e.getMessage());
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

    public static WebElement cbx_socket_test_location_1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("select2"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_socket_test_location_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement btn_photo_socket_test_pass(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_socket_test_pass not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement btn_socket_found_reversed_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("ps5"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_socket_found_reversed_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_socket_found_reversed_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("ps6"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_socket_found_reversed_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_socket_test_location_2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("select3"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_socket_test_location_2 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_no_of_sockets(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("input1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_no_of_sockets not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_add_another(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btn2"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_add_another not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    
    
//END OF METHODS	    
}
