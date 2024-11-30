/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AccessoryDonor;

import Business.AccessoryRequestor.AccessoryRequestor;
import Business.Role.PartnerDonorRole;
import Business.Role.PersonalDonorRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Worker.Worker;
import java.util.ArrayList;

/**
 *
 * @author reetikabhanushali 
 */
public class AccessoryDonorDirectory {
    private ArrayList<AccessoryDonor> donrList;
    private UserAccountDirectory userAccountDirectory;
    
    public AccessoryDonorDirectory(UserAccountDirectory userAccountDirectory){
        //donrList = new ArrayList();
        this.userAccountDirectory = userAccountDirectory;
        this.donrList = new ArrayList<>();
        initializeDefaultAccessoryDonors(userAccountDirectory);
    }

    public ArrayList<AccessoryDonor> getDonorList() {
        return donrList;
    }

    public void setDonorList(ArrayList<AccessoryDonor> donrList) {
        this.donrList = donrList;
    }
    
    public void addDonDir(AccessoryDonor dd) {
        donrList.add(dd);
    }
    
    public void removeDonor(AccessoryDonor d) {
        this.donrList.remove(d);
    }

    public void removeDonByIndex(int index) {
        donrList.remove(index);
    }

    public AccessoryDonor getDonorDetailsByIndex(int index) {
        return donrList.get(index);
    }
    
    int donIdGeneration = 1000;

    public int generateDonOrderId() {
        donIdGeneration++;
        return donIdGeneration;
    }
    public String getdonState(String name){
        for(AccessoryDonor d: donrList){
            if(d.getDonorAccount().getUsername().equals(name)){
                return d.getDonorState();
            }
        }
        return null;
    }
    
    
    public void initializeDefaultAccessoryDonors(UserAccountDirectory userAccountDirectory) {
        // Personal Donor 1
        Worker personalDonor1 = new Worker();
        personalDonor1.setName("Personal Donor One");

        UserAccount account1 = userAccountDirectory.createUserAccount(
            "personaldonor1",
            "@Password123",
            personalDonor1,
            new PersonalDonorRole()
        );

        AccessoryDonor donor1 = new AccessoryDonor(account1);
        donor1.setDonorId(generateDonOrderId());
        donor1.setDonorName("Personal Donor One");
        donor1.setDonorType("Personal");
        donor1.setDonorPhno("1234567890");
        donor1.setDonorAddres("789 Oak Street");
        donor1.setDonorCity("Boston");
        donor1.setDonorState("MA");
        donor1.setDonorZipcode("02116");
        donor1.setDonorEmail("personaldonor1@example.com");

        this.donrList.add(donor1);

        // Personal Donor 2
        Worker personalDonor2 = new Worker();
        personalDonor2.setName("Personal Donor Two");

        UserAccount account2 = userAccountDirectory.createUserAccount(
            "personaldonor2",
            "@Password123",
            personalDonor2,
            new PersonalDonorRole()
        );

        AccessoryDonor donor2 = new AccessoryDonor(account2);
        donor2.setDonorId(generateDonOrderId());
        donor2.setDonorName("Personal Donor Two");
        donor2.setDonorType("Personal");
        donor2.setDonorPhno("9876543210");
        donor2.setDonorAddres("456 Maple Avenue");
        donor2.setDonorCity("Cambridge");
        donor2.setDonorState("MA");
        donor2.setDonorZipcode("02138");
        donor2.setDonorEmail("personaldonor2@example.com");

        this.donrList.add(donor2);

        // Partner Donor 1
        Worker partnerDonor1 = new Worker();
        partnerDonor1.setName("Partner Donor One");

        UserAccount account3 = userAccountDirectory.createUserAccount(
            "partnerdonor1",
            "@Password123",
            partnerDonor1,
            new PartnerDonorRole()
        );

        AccessoryDonor donor3 = new AccessoryDonor(account3);
        donor3.setDonorId(generateDonOrderId());
        donor3.setDonorName("Partner Donor One");
        donor3.setDonorType("Partner");
        donor3.setDonorPhno("1122334455");
        donor3.setDonorAddres("123 Elm Street");
        donor3.setDonorCity("Boston");
        donor3.setDonorState("MA");
        donor3.setDonorZipcode("02139");
        donor3.setDonorEmail("partnerdonor1@example.com");

        this.donrList.add(donor3);

        // Partner Donor 2
        Worker partnerDonor2 = new Worker();
        partnerDonor2.setName("Partner Donor Two");

        UserAccount account4 = userAccountDirectory.createUserAccount(
            "partnerdonor2",
            "@Password123",
            partnerDonor2,
            new PartnerDonorRole()
        );

        AccessoryDonor donor4 = new AccessoryDonor(account4);
        donor4.setDonorId(generateDonOrderId());
        donor4.setDonorName("Partner Donor Two");
        donor4.setDonorType("Partner");
        donor4.setDonorPhno("5566778899");
        donor4.setDonorAddres("456 Oak Street");
        donor4.setDonorCity("Cambridge");
        donor4.setDonorState("MA");
        donor4.setDonorZipcode("02140");
        donor4.setDonorEmail("partnerdonor2@example.com");

        this.donrList.add(donor4);

        // Debugging Messages
        System.out.println("Default Accessory Donors initialized.");
        for (AccessoryDonor donor : this.donrList) {
            System.out.println("ID: " + donor.getDonorId() + ", Name: " + donor.getDonorName());
        }
    }
}
