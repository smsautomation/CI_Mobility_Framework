package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 06/07/2018
* Function: CI_Objects_TAA_Non_Compliance_Visit
* Purpose: This class contains all of the elements in the C&I Technical Assurance Access (TAA) Non-Compliance Visit section
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

public class CI_Objects_Taa_Non_Compliance_Visit {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_TAA_Non_Compliance_Visit";

      
    // ******* Need to work out how the layout of this page will work - think it was proposed to be developed differently to how it has been 
    //         written in the workflow document ******
    
    
    
    public static WebElement btn_commission_meter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_commission_meter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    
    // Job Resolution sub-section
    
    public static WebElement txt_outcome_of_visit(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_outcome_of_visit not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_photo_evidence_1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_evidence_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
	// ******** in the workflow doc, it says "multiple photos" - need to work out what this means for the workflow elements ********
    
    
    
			
//END OF METHODS	    
}
