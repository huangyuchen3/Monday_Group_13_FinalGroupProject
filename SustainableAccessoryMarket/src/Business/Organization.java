/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Worker.WorkerDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author ankitapatil 
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQ;
    private WorkerDirectory empDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int orgID;
    private static int counter=0;
    
    public enum Type{
//        RestaurantAdmin("RestaurantAdmin"),
//        Customer("Customer"),
//        DeliveryMan("Delivery"),

        ACAdmin("ACAdmin"),
        ACPManager("ACPManager"),
        Donor("Donor"),
        Requestor("Requestor"),
        COAgent("COAgent"),
        Volunteer("Volunteer"),
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQ = new WorkQueue();
        empDirectory = new WorkerDirectory();
        userAccountDirectory = new UserAccountDirectory();
        orgID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return orgID;
    }

    public WorkerDirectory getEmployeeDirectory() {
        return empDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQ) {
        this.workQ = workQ;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
