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
            volunteer1.setVolCO("Helping Hands Center");
            volunteer1.setVolAccount(volunteerAccount1); // Link the UserAccount to the volunteer
            volunteer1.setVolAvail("New");

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
            volunteer2.setVolCO("Helping Hands Center");
            volunteer2.setVolAccount(volunteerAccount2); // Link the UserAccount to the volunteer
            volunteer2.setVolAvail("New");

            // Create Volunteer 3 (Assigned to comanager2)
            Worker volunteerWorker3 = new Worker();
            volunteerWorker3.setName("Volunteer Three");

            UserAccount volunteerAccount3 = userAccountDirectory.createUserAccount(
                "volunteer3", // Default username
                "@Password123",  // Default password
                volunteerWorker3,
                new Volunteer()
            );

            COVolunteer volunteer3 = new COVolunteer();
            volunteer3.setVolId("V3");
            volunteer3.setVolName("Volunteer Three");
            volunteer3.setVolAge("28");
            volunteer3.setVolPhno("1112233445");
            volunteer3.setVolAddress("789 Pine St");
            volunteer3.setVolCity("Somerville");
            volunteer3.setVolState("MA");
            volunteer3.setVolZipcode("02144");
            volunteer3.setVolExp("3");
            volunteer3.setManagerUsername("comanager2"); // Assign to comanager2
            volunteer3.setVolCO("Care and Share Center");
            volunteer3.setVolAccount(volunteerAccount3); // Link the UserAccount to the volunteer
            volunteer3.setVolAvail("New");

            // Create Volunteer 4 (Assigned to comanager2)
            Worker volunteerWorker4 = new Worker();
            volunteerWorker4.setName("Volunteer Four");

            UserAccount volunteerAccount4 = userAccountDirectory.createUserAccount(
                "volunteer4", // Default username
                "@Password123",  // Default password
                volunteerWorker4,
                new Volunteer()
            );

            COVolunteer volunteer4 = new COVolunteer();
            volunteer4.setVolId("V4");
            volunteer4.setVolName("Volunteer Four");
            volunteer4.setVolAge("32");
            volunteer4.setVolPhno("5566778899");
            volunteer4.setVolAddress("321 Oak St");
            volunteer4.setVolCity("Medford");
            volunteer4.setVolState("MA");
            volunteer4.setVolZipcode("02155");
            volunteer4.setVolExp("6");
            volunteer4.setManagerUsername("comanager2"); // Assign to comanager2
            volunteer4.setVolCO("Care and Share Center");
            volunteer4.setVolAccount(volunteerAccount4); // Link the UserAccount to the volunteer
            volunteer4.setVolAvail("New");

            // Add all volunteers to the list
            this.volList.add(volunteer1);
            this.volList.add(volunteer2);
            this.volList.add(volunteer3);
            this.volList.add(volunteer4);

            // Debug messages to confirm initialization
            System.out.println("Default Volunteers initialized.");
            for (COVolunteer vol : this.volList) {
                System.out.println("ID: " + vol.getVolId() + ", Name: " + vol.getVolName()
                        + ", Manager: " + vol.getManagerUsername() + ", Username: " + vol.getVolAccount().getUsername());
            }
        }

        }
