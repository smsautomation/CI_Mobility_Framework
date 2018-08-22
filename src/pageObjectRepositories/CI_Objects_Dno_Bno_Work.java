package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 05/07/2018
* Function: CI_Objects_DNO_BNO_Work
* Purpose: This class contains all of the elements in the C&I DNO/BNO Work section
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

public class CI_Objects_Dno_Bno_Work {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Dno_Bno_Work";

    // Tasks Completed sub-section
    public static class DNO_BNO_TASKS{
    
    	public static WebElement btn_de_energise_y(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_de_energise_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_de_energise_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_de_energise_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_connect_tails_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_connect_tails_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_connect_tails_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_connect_tails_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_connect_re_connect_tails_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_connect_re_connect_tails_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_connect_re_connect_tails_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_connect_re_connect_tails_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	    	
    	public static WebElement btn_install_replace_chamber_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_install_replace_chamber_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_install_replace_chamber_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_install_replace_chamber_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
        
    	public static WebElement btn_install_replace_reposition_chamber_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_install_replace_reposition_chamber_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_install_replace_reposition_chamber_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_install_replace_reposition_chamber_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
        
    	public static WebElement btn_repair_wiring_defects_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_repair_wiring_defects_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_repair_wiring_defects_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_repair_wiring_defects_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_ct_install_change_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_ct_install_change_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_ct_install_change_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_ct_install_change_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_replace_metering_termination_box_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_replace_metering_termination_box_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_replace_metering_termination_box_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_replace_metering_termination_box_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_replace_reposition_metering_termination_box_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_replace_reposition_metering_termination_box_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_replace_reposition_metering_termination_box_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_replace_reposition_metering_termination_box_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	
    	public static WebElement btn_wire_connect_box_cop2_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_wire_connect_box_cop2_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_wire_connect_box_cop2_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_wire_connect_box_cop2_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_wire_connect_box_cop3_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_wire_connect_box_cop3_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_wire_connect_box_cop3_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_wire_connect_box_cop3_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_wire_connect_box_cop5_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_wire_connect_box_cop5_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_wire_connect_box_cop5_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_wire_connect_box_cop5_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_replace_metering_multi_core_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_replace_metering_multi_core_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_replace_metering_multi_core_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_replace_metering_multi_core_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_replace_reconnect_metering_multi_core_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_replace_reconnect__metering_multi_core_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_replace_reconnect_metering_multi_core_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_replace_reconnect__metering_multi_core_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_equipment_removal_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_equipment_removal_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_equipment_removal_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_equipment_removal_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_hv_injection_test_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_hv_injection_test_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_hv_injection_test_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_hv_injection_test_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_survey_work_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_survey_work_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_survey_work_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_survey_work_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_energise_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_energise_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_energise_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_energise_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_p283_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_p283_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_p283_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_p283_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    }
    
    // END OF CLASS DNO_BNO_TASKS
    	
    	// Railway PME Survey Job Tasks
    
    public static class RAILWAY_PME_SURVEY_JOB_TASKS{
    	
    	public static WebElement btn_other_dno_supplies_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_other_dno_supplies_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_other_dno_supplies_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_other_dno_supplies_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_installation_complies_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_installation_complies_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_installation_complies_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_installation_complies_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
    	public static WebElement btn_intake_cubicle_metallic_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_intake_cubicle_metallic_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_intake_cubicle_metallic_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_intake_cubicle_metallic_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_ext_touch_potentials_controlled_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_ext_touch_potentials_controlled_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_ext_touch_potentials_controlled_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_ext_touch_potentials_controlled_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_railway_electrified_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_railway_electrified_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_railway_electrified_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_railway_electrified_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_ac_dc_traction_system_dc(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_ac_dc_traction_system_dc not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_ac_dc_traction_system_ac(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_ac_dc_traction_system_ac not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_assoc_dc_traction_sys_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_assoc_traction_sys_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_assoc_dc_traction_sys_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_assoc_traction_sys_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_transfer_track_between_ac_dc_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_transfer_track_between_systems_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_transfer_track_between_ac_dc_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_transfer_track_between_systems_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_earth_terminal_bonded_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_earth_terminal_bonded_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_earth_terminal_bonded_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_earth_terminal_bonded_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_bonding_adequate_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_bonding_adequate_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_bonding_adequate_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_bonding_adequate_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_traction_supply_point_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_traction_supply_point_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_traction_supply_point_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_traction_supply_point_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_same_source_substation_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_same_source_substation_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_same_source_substation_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_same_source_substation_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_reop_less_than_430v_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_reop_less_than_430v_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_reop_less_than_430v_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_reop_less_than_430v_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_traction_return_less_than_25v_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_traction_return_less_than_25v_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_traction_return_less_than_25v_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_traction_return_less_than_25v_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_assoc_ac_traction_system_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_assoc_ac_traction_system_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_assoc_ac_traction_system_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_assoc_ac_traction_system_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
          
    	public static WebElement btn_transfer_track_between_systems_5_1b_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_transfer_track_between_system_5.1b_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
         
    	public static WebElement btn_transfer_track_between_systems_5_1b_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_transfer_track_between_system_5.1b_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
         
    	public static WebElement btn_traction_supply_direct_to_earth_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_traction_supply_direct_to_earth_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
         
    	public static WebElement btn_traction_supply_direct_to_earth_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_traction_supply_direct_to_earth_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
         
    	public static WebElement btn_traction_supply_insulated_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_traction_supply_insulated_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
         
    	public static WebElement btn_traction_supply_insulated_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_traction_supply_insulated_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
         
    	public static WebElement btn_incidents_of_corrosion_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_incidents_of_corrosion_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
         
    	public static WebElement btn_incidents_of_corrosion_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_incidents_of_corrosion_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
         
    	public static WebElement btn_rail_to_earth_voltage_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_rail_to_earth_voltage_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
         
    	public static WebElement btn_rail_to_earth_voltage_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_rail_to_earth_voltage_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
         
    	public static WebElement btn_rail_to_earth_conductance_y(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_rail_to_earth_conductance_y not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
         
    	public static WebElement btn_rail_to_earth_conductance_n(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_rail_to_earth_conductance_n not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement lbl_pme_acceptable(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |lbl_pme_acceptable not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
         
    	public static WebElement lbl_pme_not_acceptable(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |lbl_pme_not_acceptable not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    }
    	
    // END OF CLASS RAILWAY_PME_SURVEY_JOB_TASKS
    	
    	// Job Summary Details sub-section
    
		public static WebElement cbx_job_actually_completed(WebDriver driver) {
    	
			try {
				element = driver.findElement(By.id(INSERTID));
			}catch(Exception e) {
				Log.error(sRepositoryName + " |cbx_job_actually_completed not found | Exception desc : "+e.getMessage());
			}
			return element;
		}
    	
    	public static WebElement txt_survey_report(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_survey_report not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_photo_survey_1(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_photo_survey_1 not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_photo_survey_2(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_photo_survey_2 not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_photo_survey_3(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_photo_survey_3 not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_photo_survey_4(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_photo_survey_4 not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_photo_survey_5(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_photo_survey_5 not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_p283_completed(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_p283_completed not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_photo_p283_1(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_photo_p283_1 not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement btn_photo_p283_2(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_photo_p283_2 not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_cabinet_serial_num(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_cabinet_serial_num not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_sub_station_name_num(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_sub_station_name_num not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	public static WebElement txt_work_summary(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |txt_work_summary not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	
			
//END OF METHODS	    
}
