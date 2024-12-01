/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.COVolunteer;

import Business.Role.Volunteer;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Worker.Worker;
import java.util.ArrayList;

/**
 *
 *@author reetikabhanushali
 */
public class COVolunteerDirectory {

    
    private ArrayList<COVolunteer> volList;
    private UserAccountDirectory userAccountDirectory;
    
    public COVolunteerDirectory(UserAccountDirectory userAccountDirectory){
        //volList = new ArrayList();
        
        this.userAccountDirectory = userAccountDirectory;
        this.volList = new ArrayList<>();
        initializeDefaultVolunteers(userAccountDirectory);
    }
    
    public ArrayList<COVolunteer> getVolunteerList() {
        return volList;
    }

    public void setVolunteerList(ArrayList<COVolunteer> volList) {
        this.volList = volList;
    }
    
    public void addNewVolunteer(COVolunteer vol){
        volList.add(vol);
    }
    
    public void deleteVolunteer(COVolunteer selectedvol){
        volList.remove(selectedvol);
    }
    
    
//    public void initializeDefaultVolunteers(UserAccountDirectory userAccountDirectory) {
//        COVolunteer volunteer1 = new COVolunteer();
//        volunteer1.setVolId("V1");
//        volunteer1.setVolName("Volunteer One");
//        volunteer1.setVolAge("25");
//        volunteer1.setVolPhno("1234567890");
//        volunteer1.setVolAddress("123 Main St");
//        volunteer1.setVolCity("Boston");
//        volunteer1.setVolState("MA");
//        volunteer1.setVolZipcode("02116");
//        volunteer1.setVolExp("2");
//        volunteer1.setManagerUsername("comanager1"); // Assign to comanager1
//
//        COVolunteer volunteer2 = new COVolunteer();
//        volunteer2.setVolId("V2");
//        volunteer2.setVolName("Volunteer Two");
//        volunteer2.setVolAge("30");
//        volunteer2.setVolPhno("9876543210");
//        volunteer2.setVolAddress("456 Elm St");
//        volunteer2.setVolCity("Cambridge");
//        volunteer2.setVolState("MA");
//        volunteer2.setVolZipcode("02140");
//        volunteer2.setVolExp("5");
//        volunteer2.setManagerUsername("comanager1"); // Assign to comanager1
//
//        this.volList.add(volunteer1);
//        this.volList.add(volunteer2);
//    }
    
    public void initializeDefaultVolunteers(UserAccountDirectory userAccountDirectory) {
        // Create Volunteer 1
        Worker volunteerWorker1 = new Worker();
        volunteerWorker1.setName("Volunteer One");

        UserAccount volunteerAccount1 = userAccountDirectory.createUserAccount(
            "volunteer1", // Default username
            "@Password123",  // Default password
            volunteerWorker1,
            new Volunteer() // Assuming you have a role for volunteers
        );

        COVolunteer volunteer1 = new COVolunteer();
        volunteer1.setVolId("V1");
        volunteer1.setVolName("Volunteer One");
        volunteer1.setVolAge("25");
        volunteer1.setVolPhno("1234567890");
        volunteer1.setVolAddress("123 Main St");
        volunteer1.setVolCity("Boston");
        volunteer1.setVolState("MA");
        volunteer1.setVolZipcode("02116");
        volunteer1.setVolExp("2");
        volunteer1.setManagerUsername("comanager1"); // Assign to comanager1
        volunteer1.setVolAccount(volunteerAccount1); // Link the UserAccount to the volunteer

        // Create Volunteer 2
        Worker volunteerWorker2 = new Worker();
        volunteerWorker2.setName("Volunteer Two");

        UserAccount volunteerAccount2 = userAccountDirectory.createUserAccount(
            "volunteer2", // Default username
            "@Password123",  // Default password
            volunteerWorker2,
            new Volunteer()
        );

        COVolunteer volunteer2 = new COVolunteer();
        volunteer2.setVolId("V2");
        volunteer2.setVolName("Volunteer Two");
        volunteer2.setVolAge("30");
        volunteer2.setVolPhno("9876543210");
        volunteer2.setVolAddress("456 Elm St");
        volunteer2.setVolCity("Cambridge");
        volunteer2.setVolState("MA");
        volunteer2.setVolZipcode("02140");
        volunteer2.setVolExp("5");
        volunteer2.setManagerUsername("comanager1"); // Assign to comanager1
        volunteer2.setVolAccount(volunteerAccount2); // Link the UserAccount to the volunteer

        // Add volunteers to the list
        this.volList.add(volunteer1);
        this.volList.add(volunteer2);

        // Debug messages to confirm initialization
        System.out.println("Default Volunteers initialized.");
        for (COVolunteer vol : this.volList) {
            System.out.println("ID: " + vol.getVolId() + ", Name: " + vol.getVolName()
                    + ", Username: " + vol.getVolAccount().getUsername());
        }
    }

}
