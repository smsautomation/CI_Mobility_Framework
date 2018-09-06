package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Final_Meter_Reading
* Purpose: This class contains all of the elements in the C&I Final Meter Reading section
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

public class CI_Objects_Final_Meter_Reading {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Final_Meter_Reading";
    
public static class First_Meter_Reads {

      
    public static WebElement btn_able_to_read_meter_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-radioUnableToReadFalseMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_read_meter_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }   
   
    public static WebElement btn_able_to_read_meter_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-radioUnableToReadTrueMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_read_meter_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 
    
    public static WebElement txt_no_installed_meter_reading(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-ranotesMRD-0")); 
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_no_installed_meter_reading not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement cbx_dial_end(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-dialEndSelectMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_dial_end not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_units(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-unitsSelectMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_units not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
	
    public static WebElement txt_total_kwh_imp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-totalkwhImpMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kwh_imp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kwh_exp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-totalkwhExpMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kwh_exp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_1_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-quad1KvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_1_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_2_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-quad2KvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_2_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_3_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-quad3KvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_3_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
	
    public static WebElement txt_quad_4_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-quad4KvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_4_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvarh_imp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-TotalKvArhImpMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvarh_imp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvarh_exp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-totalKvArhExpMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvarh_exp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvah(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-totalKvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvah not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-registerMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-registerMRD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_2 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_3(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-registerMRD-2"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_3 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_4(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-registerMRD-3"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_4 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_5(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-registerMRD-4"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_5 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_6(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-registerMRD-5"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_6 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_kw_max_demand(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-kwMaxMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_kw_max_demand not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_kva_max_demand(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-kvaMaxMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_kva_max_demand not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_add_other_reg(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-btnAddNewOtherRegisterMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_other_reg_read not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_other_reg_read(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-otherRegReadMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_other_reg_read not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_other_reg_name(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-otherRegNameMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_other_reg_name not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
// END OF CLASS FIRST METER READS
    
}


public static class Second_Meter_Reads {

    
    public static WebElement btn_able_to_read_meter_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-radioUnableToReadFalseMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_read_meter_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }   
   
    public static WebElement btn_able_to_read_meter_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-radioUnableToReadTrueMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_read_meter_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 
    
    public static WebElement txt_no_installed_meter_reading(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-ranotesMRD-0")); 
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_no_installed_meter_reading not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement cbx_dial_end(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-dialEndSelectMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_dial_end not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_units(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-unitsSelectMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_units not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
	
    public static WebElement txt_total_kwh_imp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-totalkwhImpMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kwh_imp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kwh_exp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-totalkwhExpMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kwh_exp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_1_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-quad1KvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_1_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_2_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-quad2KvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_2_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_3_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-quad3KvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_3_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
	
    public static WebElement txt_quad_4_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-quad4KvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_4_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvarh_imp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-TotalKvArhImpMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvarh_imp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvarh_exp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-totalKvArhExpMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvarh_exp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvah(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-totalKvArhMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvah not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-registerMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-registerMRD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_2 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_3(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-registerMRD-2"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_3 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_4(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-registerMRD-3"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_4 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_5(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-registerMRD-4"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_5 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_6(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-registerMRD-5"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_6 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_kw_max_demand(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-kwMaxMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_kw_max_demand not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_kva_max_demand(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-kvaMaxMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_kva_max_demand not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_add_other_reg(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-btnAddNewOtherRegisterMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_other_reg_read not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_other_reg_read(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-otherRegReadMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_other_reg_read not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_other_reg_name(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-otherRegNameMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_other_reg_name not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
// END OF CLASS SECOND METER READS 
}

	public static WebElement btn_add_found_asset(WebDriver driver) {
	
		try {
			element = driver.findElement(By.id("btnNextCommDMD"));
		}catch(Exception e) {
			Log.error(sRepositoryName + " |btn_add_found_asset not found | Exception desc : "+e.getMessage());
		}
		return element;
	}
	
	public static WebElement btn_continue_with_job_y(WebDriver driver) {
		
		try {
			element = driver.findElement(By.id("radiotargetfieldTrue3DMD"));
		}catch(Exception e) {
			Log.error(sRepositoryName + " |btn_continue_with_job_y not found | Exception desc : "+e.getMessage());
		}
		return element;
	}

	public static WebElement btn_continue_with_job_n(WebDriver driver) {
		
		try {
			element = driver.findElement(By.id("radiotargetfieldFalse3DMD"));
		}catch(Exception e) {
			Log.error(sRepositoryName + " |btn_continue_with_job_n not found | Exception desc : "+e.getMessage());
		}
		return element;
	}

	
	
	
	
	
	
    public static WebElement cbx_status_of_asset(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_status_of_asset not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_addnl_notes(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_addnl_notes not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_next_section(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_next_section not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    
    
    
//END OF METHODS	    
}
