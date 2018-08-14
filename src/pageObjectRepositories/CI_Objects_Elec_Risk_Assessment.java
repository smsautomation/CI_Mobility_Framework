package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 03/07/2018
* Function: CI_Objects_Elec_Risk_Assessment
* Purpose: This class contains all of the elements in the C&I Carry Out Electricity Risk Assessment section
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

public class CI_Objects_Elec_Risk_Assessment {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Elec_Risk_Assessment";

      
    public static WebElement btn_perform_risk_assess_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiora5a"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_perform_risk_assess_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    
    public static WebElement cbx_risk_reason_code(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("selectRiskReason"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_risk_reason_code not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}    
    
    public static WebElement btn_risk_assess_pass_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiora9"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_risk_assess_pass_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }    
    
    public static WebElement btn_risk_assess_pass_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiora10"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_risk_assess_pass_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }    
    
// Risk Assessment Pass sub-section    
    
	public static WebElement txt_risk_assess_pass(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("ranotes"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_risk_assess_pass not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}        
    
    public static WebElement btn_photo_hazards_pass(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("photoelectriskassessriskAssessPass));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_hazards_pass not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }      
    
    public static WebElement btn_next_section(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btnNextrae"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_next_section not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
// Risk Assessment Fail sub-section
    
	public static WebElement txt_risk_assess_fail(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("textRiskAssessFail"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_risk_assess_fail not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	} 
    
    public static WebElement btn_photo_hazards_fail(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("photoelecriskassessriskAssessFail));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_hazards_fail not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

// Customer Issue Outcome sub-section   (if risk assessment failed) 	- only if risk reason code is C...
    
    public static class CUSTOMER_ISSUE_OUTCOME{      
    	
    	public static WebElement txt_risk_assess_fail_cust_issue(WebDriver driver){
   	   	 
    		try{
    			element = driver.findElement(By.id("text4"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | txt_risk_assess_fail_cust_issue not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}     	
    
        public static WebElement btn_fail_called_airline_y(WebDriver driver) {
        	
        	try {
        		element = driver.findElement(By.id("radiora19"));
        	}catch(Exception e) {
        		Log.error(sRepositoryName + " |btn_fail_called_airline_y not found | Exception desc : "+e.getMessage());
        	}
        	return element;
        }
    	
        public static WebElement btn_fail_called_airline_n(WebDriver driver) {
            	
           	try {
           		element = driver.findElement(By.id("radiora20"));
           	}catch(Exception e) {
           		Log.error(sRepositoryName + " |btn_fail_called_airline_n not found | Exception desc : "+e.getMessage());
           	}
           	return element;
        }
        
    	public static WebElement txt_fail_airline_ref_no(WebDriver driver){
      	   	 
    		try{
    			element = driver.findElement(By.id("radiora21"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | txt_fail_airline_ref_no not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}        

        public static WebElement btn_reschedule_job_y(WebDriver driver) {
        	
           	try {
           		element = driver.findElement(By.id("radiora22"));
           	}catch(Exception e) {
           		Log.error(sRepositoryName + " |btn_reschedule_job_y not found | Exception desc : "+e.getMessage());
           	}
           	return element;
        }      	
    	
        public static WebElement btn_reschedule_job_n(WebDriver driver) {
        	
           	try {
           		element = driver.findElement(By.id(INSERTID));
           	}catch(Exception e) {
           		Log.error(sRepositoryName + " |btn_reschedule_job_n not found | Exception desc : "+e.getMessage());
           	}
           	return element;
        }  
        
    }
    
//END OF CLASS CUSTOMER_ISSUE_OUTCOME
        
// Capture Job Data - Report to DNO sub-section (if risk code != C)
        
     public static class CAPTURE_JOB_DATA_REPORT_TO_DNO{        
        
        public static WebElement btn_called_airline_y(WebDriver driver) {
        	
        	try {
        		element = driver.findElement(By.id("radiora11"));
        	}catch(Exception e) {
        		Log.error(sRepositoryName + " |btn_called_airline_y not found | Exception desc : "+e.getMessage());
        	}
        	return element;
        }
    	
        public static WebElement btn_called_airline_n(WebDriver driver) {
            	
           	try {
           		element = driver.findElement(By.id("radiora12"));
           	}catch(Exception e) {
           		Log.error(sRepositoryName + " |btn_called_airline_n not found | Exception desc : "+e.getMessage());
           	}
           	return element;
        }
        
    	public static WebElement txt_airline_ref_no(WebDriver driver){
      	   	 
    		try{
    			element = driver.findElement(By.id("inputraeAirlineRef"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | txt_airline_ref_no not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}

        public static WebElement btn_reported_risk_to_dno_y(WebDriver driver) {
        	
        	try {
        		element = driver.findElement(By.id("radioRaeReportedDNOTrue"));
        	}catch(Exception e) {
        		Log.error(sRepositoryName + " |btn_reported_risk_to_dno_y not found | Exception desc : "+e.getMessage());
        	}
        	return element;
        }    	
    
        public static WebElement btn_reported_risk_to_dno_n(WebDriver driver) {
        	
        	try {
        		element = driver.findElement(By.id("radioRaeReportedDNOFalse"));
        	}catch(Exception e) {
        		Log.error(sRepositoryName + " |btn_reported_risk_to_dno_n not found | Exception desc : "+e.getMessage());
        	}
        	return element;
        } 
        
    	public static WebElement txt_dno_job_ref(WebDriver driver){
     	   	 
    		try{
    			element = driver.findElement(By.id("inputDNOJobRef"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | txt_dno_job_ref not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}        
        
        public static WebElement btn_stay_on_site_y(WebDriver driver) {
        	
        	try {
        		element = driver.findElement(By.id("radioStayOnSiteTrue"));
        	}catch(Exception e) {
        		Log.error(sRepositoryName + " |btn_stay_on_site_y not found | Exception desc : "+e.getMessage());
        	}
        	return element;
        }    	
    	
        public static WebElement btn_stay_on_site_n(WebDriver driver) {
        	
        	try {
        		element = driver.findElement(By.id("radioStayOnSiteFalse"));
        	}catch(Exception e) {
        		Log.error(sRepositoryName + " |btn_stay_on_site_n not found | Exception desc : "+e.getMessage());
        	}
        	return element;
        }         
        
        public static WebElement btn_work_can_be_completed_y(WebDriver driver) {
        	
        	try {
        		element = driver.findElement(By.id("radioCanCompleteTrue"));
        	}catch(Exception e) {
        		Log.error(sRepositoryName + " |btn_work_can_be_completed_y not found | Exception desc : "+e.getMessage());
        	}
        	return element;
        }          
        
        public static WebElement btn_work_can_be_completed_n(WebDriver driver) {
        	
        	try {
        		element = driver.findElement(By.id("radioCanCompleteFalse"));
        	}catch(Exception e) {
        		Log.error(sRepositoryName + " |btn_work_can_be_completed_n not found | Exception desc : "+e.getMessage());
        	}
        	return element;
        }          
        
    	public static WebElement txt_assess_fail_dno_issue(WebDriver driver){
    	   	 
    		try{
    			element = driver.findElement(By.id("textRiskAssessFailDNORemarks"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | txt_assess_fail_dno_issue not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}        
        
    	public static WebElement btn_next_section(WebDriver driver) {
        	
        	try {
        		element = driver.findElement(By.id("btnNextrae"));
        	}catch(Exception e) {
        		Log.error(sRepositoryName + " |btn_next_section not found | Exception desc : "+e.getMessage());
        	}
        	return element;
        } 
          	
    	
    }

// END OF CLASS CAPTURE_JOB_DATA_REPORT_TO_DNO    	
    	

	
			
//END OF METHODS	    
}
