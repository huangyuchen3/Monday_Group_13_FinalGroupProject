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
        
        Worker donorWorker = new Worker();
        donorWorker.setName("Default Donor");
        UserAccount donorAccount = new UserAccount();
        donorAccount.setUsername("donor");
        donorAccount.setPassword("donor123");
        donorAccount.setRole(new PersonalDonorRole()); // Replace with your PersonalDonorRole class
        donorAccount.setEmployee(donorWorker); // Set an Employee object if needed
        userAccList.add(donorAccount);
        
        Worker volunteerWorker = new Worker();
        volunteerWorker.setName("Default Volunteer");
        UserAccount volunteerAccount = new UserAccount();
        volunteerAccount.setUsername("volunteer");
        volunteerAccount.setPassword("volunteer123");
        volunteerAccount.setRole(new Volunteer()); // Replace with your VolunteerRole class
        volunteerAccount.setEmployee(volunteerWorker); // Set an Employee object if needed
        userAccList.add(volunteerAccount);
        
        UserAccount requesterAccount = new UserAccount();
        requesterAccount.setUsername("requester");
        requesterAccount.setPassword("requester123");
        requesterAccount.setRole(new PersonalRequestorRole()); // Replace with your PersonalRequestorRole class
        requesterAccount.setEmployee(null); // Set an Employee object if needed
        userAccList.add(requesterAccount);
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
