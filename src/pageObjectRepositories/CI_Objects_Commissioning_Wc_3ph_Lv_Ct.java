package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Commissioning_WC_3PH_LV_CT
* Purpose: This class contains all of the elements in the C&I Commissioning Document - WC 3PH & LV CT section
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

public class CI_Objects_Commissioning_Wc_3ph_Lv_Ct {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Commissioning_WC_3PH_LV_CT";


    	// Commissioning Possible? sub-section
    	  
    	public static WebElement btn_can_meters_be_commissioned_y(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_can_meters_be_commissioned_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_can_meters_be_commissioned_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_can_meters_be_commissioned_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement cbx_reason_why_meters_not_commissioned(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |cbx_reason_why_meters_not_commissioned not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement txt_other_reasons(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_other_reasons not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	// Meter Checks sub-section
    	
    	public static WebElement cbx_serial_num(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |cbx_serial_num not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_date_time_correct_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_date_time_correct_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_date_time_correct_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_date_time_correct_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_operator_label_fitted_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_operator_label_fitted_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_operator_label_fitted_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_operator_label_fitted_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_wiring_connected_correctly_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_wiring_connected_correctly_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_wiring_connected_correctly_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_wiring_connected_correctly_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_phase_rotation_correct_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_phase_rotation_correct_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_phase_rotation_correct_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_phase_rotation_correct_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_ct_polarity_correct_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_ct_polarity_correct_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_ct_polarity_correct_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_ct_polarity_correct_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_meter_advances_each_element_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_meter_advances_each_element_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_meter_advances_each_element_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_meter_advances_each_element_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_test_block_correct_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_test_block_correct_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_test_block_correct_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_test_block_correct_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_phase_failure_indication_working_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_phase_failure_indication_working_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_phase_failure_indication_working_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_phase_failure_indication_working_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_ct_burden_less_than_ct_rating_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_ct_burden_less_than_ct_rating_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_ct_burden_less_than_ct_rating_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_ct_burden_less_than_ct_rating_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	  	
     	public static WebElement btn_ct_ratio_confirmed_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_ct_ratio_confirmed_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_ct_ratio_confirmed_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_ct_ratio_confirmed_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	// Phase Voltages sub-section
    	
    	public static WebElement txt_l1_l2(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_l2 not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l1_l3(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_l3 not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l2_l3(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l2_l3 not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l1_earth(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_earth not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l1_neutral(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_neutral not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	 	
    	// Measured and Calculated Load Values sub-section (display with the Meter Indicated Values section)
    	
    	public static WebElement txt_l1_measured_volts(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_measured_volts not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l1_measured_i_pri(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_measured_i_pri not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l1_measured_i_sec(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_measured_i_sec not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l2_measured_volts(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_measured_volts not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l2_measured_i_pri(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_measured_i_pri not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l2_measured_i_sec(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_measured_i_sec not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l3_measured_volts(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_measured_volts not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l3_measured_i_pri(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_measured_i_pri not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l3_measured_i_sec(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_measured_i_sec not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	   	
    	// Meter Indicated Values sub-section (display with the Measured and Calculated Load Values section)
    	
    	public static WebElement txt_l1_meter_indicated_v_primary(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_meter_indicated_v_primary not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l1_meter_indicated_i_pri(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_meter_indicated_i_pri not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l2_meter_indicated_v_primary(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_meter_indicated_v_primary not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l2_meter_indicated_i_pri(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_meter_indicated_i_pri not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l3_meter_indicated_v_primary(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_meter_indicated_v_primary not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_l3_meter_indicated_i_pri(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_l1_meter_indicated_i_pri not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	   	
    	public static WebElement txt_displayed_values_kw(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_displayed_values_kw not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_displayed_values_kvar(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_displayed_values_kvar not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_displayed_values_pf(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_displayed_values_pf not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_displayed_values_kva(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_displayed_values_kva not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	// Timed Demand Advance
    	
    	public static WebElement txt_rising_md_value(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_rising_md_value not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_time_seconds(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_time_seconds not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement cbx_unit(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |cbx_unit not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
	
    	// Impulses/Pulses Set sub-section
   	
    	public static WebElement txt_impulses_kw_actual_num(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_impulses_kw_actual_num not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
	
    	public static WebElement txt_impulses_kw_time_taken(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_impulses_kw_actual_no not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
	
    	public static WebElement txt_impulses_kw_pulse_value_meter(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_impulses_kw_pulse_value_meter not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
	
    	public static WebElement txt_impulses_kvar_actual_num(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_impulses_kvar_actual_num not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
	
    	public static WebElement txt_impulses_kvar_time_taken(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_impulses_kvar_time_taken not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
	
    	public static WebElement txt_impulses_kvar_pulse_value_meter(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_impulses_kvar_pulse_value_meter not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
	
    	// Registers sub-section
    	
    	public static WebElement txt_time_start(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_time_start not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
	
    	public static WebElement txt_time_finish(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_time_finish not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
	
    	public static WebElement txt_import_kwh_start(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_import_kwh_start not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
	
    	public static WebElement txt_import_kwh_finish(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_import_kwh_finish not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
	
    	public static WebElement txt_export_kwh_start(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_export_kwh_start not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
	
    	public static WebElement txt_export_kwh_finish(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_export_kwh_finish not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
		
    	public static WebElement txt_total_kvarh_start(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_total_kvarh_start not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
	
    	public static WebElement txt_total_kvarh_finish(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_total_kvarh_finish not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
		
    	public static WebElement txt_total_kvah_start(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_total_kvah_start not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
	
    	public static WebElement txt_total_kvah_finish(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_total_kvah_finish not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
		
    	public static WebElement txt_commissioned_date(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_commissioned_date not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
		
    	public static WebElement txt_signature(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_signature not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
					
    	public static WebElement txt_comments(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_comments not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
					
    	public static WebElement btn_save(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_save not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
					
    	public static WebElement btn_add_another_meter(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_add_another_meter not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}	
					
    	public static WebElement btn_continue(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_continue not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}			
    	
    	

    	

    	  
      }
			
//END OF METHODS	    
}
