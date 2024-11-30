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
        
        Worker personalDonorWorker = new Worker();
        personalDonorWorker.setName("Default Personal Donor");
        UserAccount personalDonorAccount = new UserAccount();
        personalDonorAccount.setUsername("personaldonor");
        personalDonorAccount.setPassword("personaldonor123");
        personalDonorAccount.setRole(new PersonalDonorRole()); // Replace with your PersonalDonorRole class
        personalDonorAccount.setEmployee(personalDonorWorker); // Set an Employee object if needed
        userAccList.add(personalDonorAccount);
        
        Worker partnerDonorWorker = new Worker();
        partnerDonorWorker.setName("Default Partner Donor");
        UserAccount partnerDonorAccount = new UserAccount();
        partnerDonorAccount.setUsername("partnerdonor");
        partnerDonorAccount.setPassword("partnerdonor123");
        partnerDonorAccount.setRole(new PartnerDonorRole()); // Replace with your PartnerDonorRole class
        partnerDonorAccount.setEmployee(partnerDonorWorker); // Set an Employee object if needed
        userAccList.add(partnerDonorAccount); 
        
        Worker volunteerWorker1 = new Worker();
        volunteerWorker1.setName("Default Volunteer 1");
        UserAccount volunteerAccount1 = new UserAccount();
        volunteerAccount1.setUsername("volunteer1");
        volunteerAccount1.setPassword("volunteer123");
        volunteerAccount1.setRole(new Volunteer()); // Replace with your VolunteerRole class
        volunteerAccount1.setEmployee(volunteerWorker1); // Set an Employee object if needed
        userAccList.add(volunteerAccount1);
        
        Worker volunteerWorker2 = new Worker();
        volunteerWorker2.setName("Default Volunteer 2");
        UserAccount volunteerAccount2 = new UserAccount();
        volunteerAccount2.setUsername("volunteer2");
        volunteerAccount2.setPassword("volunteer123");
        volunteerAccount2.setRole(new Volunteer()); // Replace with your VolunteerRole class
        volunteerAccount2.setEmployee(volunteerWorker2); // Set an Employee object if needed
        userAccList.add(volunteerAccount2);
        
        Worker volunteerWorker3 = new Worker();
        volunteerWorker3.setName("Default Volunteer 3");
        UserAccount volunteerAccount3 = new UserAccount();
        volunteerAccount3.setUsername("volunteer3");
        volunteerAccount3.setPassword("volunteer123");
        volunteerAccount3.setRole(new Volunteer()); // Replace with your VolunteerRole class
        volunteerAccount3.setEmployee(volunteerWorker3); // Set an Employee object if needed
        userAccList.add(volunteerAccount3);
        
        Worker volunteerWorker4 = new Worker();
        volunteerWorker4.setName("Default Volunteer 4");
        UserAccount volunteerAccount4 = new UserAccount();
        volunteerAccount4.setUsername("volunteer4");
        volunteerAccount4.setPassword("volunteer123");
        volunteerAccount4.setRole(new Volunteer()); // Replace with your VolunteerRole class
        volunteerAccount4.setEmployee(volunteerWorker4); // Set an Employee object if needed
        userAccList.add(volunteerAccount4);
        
//        Worker personalRequesterWorker = new Worker();
//        personalRequesterWorker.setName("Default Personal Requester");
//        UserAccount personalRequesterAccount = new UserAccount();
//        personalRequesterAccount.setUsername("personalrequester");
//        personalRequesterAccount.setPassword("personalrequester123");
//        personalRequesterAccount.setRole(new PersonalRequestorRole()); // Replace with your PersonalRequestorRole class
//        personalRequesterAccount.setEmployee(personalRequesterWorker); // Set an Employee object if needed
//        userAccList.add(personalRequesterAccount);
        
        Worker partnerRequesterWorker = new Worker();
        partnerRequesterWorker.setName("Default Partner Requester");
        UserAccount partnerRequesterAccount = new UserAccount();
        partnerRequesterAccount.setUsername("partnerrequester");
        partnerRequesterAccount.setPassword("partnerrequester123");
        partnerRequesterAccount.setRole(new PartnerRequesterRole()); // Replace with your PersonalRequestorRole class
        partnerRequesterAccount.setEmployee(partnerRequesterWorker); // Set an Employee object if needed
        userAccList.add(partnerRequesterAccount); 
        
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
