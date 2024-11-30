package Business;

import Business.Worker.Worker;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author reetikabhanushali 
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();

    // Initialize system admin account
    Worker adminWorker = system.getEmployeeDirectory().createEmployee("sysadmin");
    system.getUserAccountDirectory().createUserAccount(
        "sysadmin",
        "sysadmin",
        adminWorker,
        new SystemAdminRole()
    );

    return system;}
    
}
