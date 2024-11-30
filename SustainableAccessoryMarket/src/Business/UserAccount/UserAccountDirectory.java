/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Role.*;
import Business.Role.PersonalRequestorRole;
import Business.Worker.Worker;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author reetikabhanushali 
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccList;

    public UserAccountDirectory() {
        userAccList = new ArrayList();
        
        // Add default admin user
        UserAccount adminAccount = new UserAccount();
        adminAccount.setUsername("admin");
        adminAccount.setPassword("admin123");
        adminAccount.setRole(new SystemAdminRole()); // Assuming SystemAdminRole exists
        adminAccount.setEmployee(null); // If no employee object is needed
        userAccList.add(adminAccount);
        
//        Worker personalDonorWorker = new Worker();
//        personalDonorWorker.setName("Default Personal Donor");
//        UserAccount personalDonorAccount = new UserAccount();
//        personalDonorAccount.setUsername("personaldonor");
//        personalDonorAccount.setPassword("personaldonor123");
//        personalDonorAccount.setRole(new PersonalDonorRole()); // Replace with your PersonalDonorRole class
//        personalDonorAccount.setEmployee(personalDonorWorker); // Set an Employee object if needed
//        userAccList.add(personalDonorAccount);
//        
//        Worker partnerDonorWorker = new Worker();
//        partnerDonorWorker.setName("Default Partner Donor");
//        UserAccount partnerDonorAccount = new UserAccount();
//        partnerDonorAccount.setUsername("partnerdonor");
//        partnerDonorAccount.setPassword("partnerdonor123");
//        partnerDonorAccount.setRole(new PartnerDonorRole()); // Replace with your PartnerDonorRole class
//        partnerDonorAccount.setEmployee(partnerDonorWorker); // Set an Employee object if needed
//        userAccList.add(partnerDonorAccount); 
        
        Worker volunteerWorker = new Worker();
        volunteerWorker.setName("Default Volunteer");
        UserAccount volunteerAccount = new UserAccount();
        volunteerAccount.setUsername("volunteer");
        volunteerAccount.setPassword("volunteer123");
        volunteerAccount.setRole(new Volunteer()); // Replace with your VolunteerRole class
        volunteerAccount.setEmployee(volunteerWorker); // Set an Employee object if needed
        userAccList.add(volunteerAccount);
        
//        Worker personalRequesterWorker = new Worker();
//        personalRequesterWorker.setName("Default Personal Requester");
//        UserAccount personalRequesterAccount = new UserAccount();
//        personalRequesterAccount.setUsername("personalrequester");
//        personalRequesterAccount.setPassword("personalrequester123");
//        personalRequesterAccount.setRole(new PersonalRequestorRole()); // Replace with your PersonalRequestorRole class
//        personalRequesterAccount.setEmployee(personalRequesterWorker); // Set an Employee object if needed
//        userAccList.add(personalRequesterAccount);
        
//        Worker partnerRequesterWorker = new Worker();
//        partnerRequesterWorker.setName("Default Partner Requester");
//        UserAccount partnerRequesterAccount = new UserAccount();
//        partnerRequesterAccount.setUsername("partnerrequester");
//        partnerRequesterAccount.setPassword("partnerrequester123");
//        partnerRequesterAccount.setRole(new PartnerRequesterRole()); // Replace with your PersonalRequestorRole class
//        partnerRequesterAccount.setEmployee(partnerRequesterWorker); // Set an Employee object if needed
//        userAccList.add(partnerRequesterAccount); 
        
//        Worker COManagerWorker = new Worker();
//        COManagerWorker.setName("Default COManager");
//        UserAccount COManagerAccount = new UserAccount();
//        COManagerAccount.setUsername("comanager");
//        COManagerAccount.setPassword("comanager123");
//        COManagerAccount.setRole(new COManagerRole()); // Replace with your PersonalRequestorRole class
//        COManagerAccount.setEmployee(COManagerWorker); // Set an Employee object if needed
//        userAccList.add(COManagerAccount);
//        
//        Worker DHManagerWorker = new Worker();
//        DHManagerWorker.setName("Default DHManager");
//        UserAccount DHManagerAccount = new UserAccount();
//        DHManagerAccount.setUsername("dhmanager");
//        DHManagerAccount.setPassword("dhmanager123");
//        DHManagerAccount.setRole(new DHManagerRole()); // Replace with your PersonalRequestorRole class
//        DHManagerAccount.setEmployee(DHManagerWorker); // Set an Employee object if needed
//        userAccList.add(DHManagerAccount); //need work
//        
//        Worker DOManagerWorker = new Worker();
//        DOManagerWorker.setName("Default DOManager");
//        UserAccount DOManagerAccount = new UserAccount();
//        DOManagerAccount.setUsername("domanager");
//        DOManagerAccount.setPassword("domanager123");
//        DOManagerAccount.setRole(new DOManagerRole()); // Replace with your PersonalRequestorRole class
//        DOManagerAccount.setEmployee(DOManagerWorker); // Set an Employee object if needed
//        userAccList.add(DOManagerAccount);
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccList;
    }
    
    public UserAccount getUserAccount(String username) {
        for (UserAccount ua : userAccList) {
            if (ua.getUsername().equals(username)) {
                return ua;
            }
        }
        return null;
    }
    
//    public UserAccount authenticateUser(String username, String password){
//        for (UserAccount ua : userAccList)
//            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
//                return ua;
//            }
//        return null;
//    }
    
    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount account : userAccList) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                return account;
            }
        }
        return null;
    }

    
    public UserAccount createUserAccount(String username, String password, Worker employee, Role role){
        if (!checkIfUsernameIsUnique(username)) {
            System.out.println("Username already exists: " + username);
            return null; // Prevent duplicate accounts
        }
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);  // Associate the Worker object here
        userAccount.setRole(role);
        userAccList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public void deleteUserAccount(UserAccount inputUserAcc) {
        Iterator<UserAccount> ir = userAccList.iterator();
        while (ir.hasNext()) {
            UserAccount ua = ir.next();
            if (ua.getUsername().equals(inputUserAcc.getUsername())) {
                ir.remove();
            }
        }
    }
    
     public void editUserAccount(String oldName, String newusername, String pwd) {
        for (UserAccount ua : userAccList) {
            if (ua.getUsername().equals(oldName)) {
               ua.setUsername(newusername);
               ua.setPassword(pwd);
            }
        }
    }
     
    public void addUserAccount(UserAccount userAccount) {
        if (userAccList == null) {
            userAccList = new ArrayList<>();
        }
        userAccList.add(userAccount);
}

}
