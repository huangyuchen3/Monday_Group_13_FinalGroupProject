/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CommunityOutreach;

import Business.COVolunteer.COVolunteer;
import Business.EcoSystem;
import Business.Role.COManagerRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Worker.Worker;
import java.util.ArrayList;

/**
 *
 *@author reetikabhanushali
 */
public class CommunityOutreachDirectory {
    private ArrayList<CommunityOutreach> COList;
    private UserAccountDirectory userAccountDirectory;
    
    public CommunityOutreachDirectory(UserAccountDirectory userAccountDirectory){
        //COList = new ArrayList();
        
        this.userAccountDirectory = userAccountDirectory;
        this.COList = new ArrayList<>();
        initializeDefaultCommunityOutreachCenters(userAccountDirectory);
    }

    public ArrayList<CommunityOutreach> getNgoList() {
        return COList;
    }

    public void setNgoList(ArrayList<CommunityOutreach> nogList) {
        this.COList = nogList;
    }
    
    public void addNewNGO(CommunityOutreach ngo){
        COList.add(ngo);
    }
    
    public void deleteNGO(CommunityOutreach selectedngo){
        COList.remove(selectedngo);
    }
    
    
    public void initializeDefaultCommunityOutreachCenters(UserAccountDirectory userAccountDirectory) {
        // Create Worker and UserAccount for Community Outreach Center 1
        Worker coManager1 = new Worker();
        coManager1.setName("Community Manager One");

        UserAccount account1 = userAccountDirectory.createUserAccount(
            "comanager1",
            "@Password123",
            coManager1,
            new COManagerRole()
        );

        // Create Community Outreach Center 1
        CommunityOutreach co1 = new CommunityOutreach();
        co1.setCOId("CO1");
        co1.setCOName("Helping Hands Center");
        co1.setCOPhone("1234567890");
        co1.setCOAddress("789 Oak Street");
        co1.setCOCity("Boston");
        co1.setCOState("MA");
        co1.setCOZipcode("02116");
        co1.setCOAgent("Community Manager One");
        co1.setCOAccount(account1);

        // Add the first Community Outreach to the list
        this.COList.add(co1);
        
        
        // Create Worker and UserAccount for Community Outreach Center 2
        Worker coManager2 = new Worker();
        coManager2.setName("Community Manager Two");

        UserAccount account2 = userAccountDirectory.createUserAccount(
            "comanager2",
            "@Password123",
            coManager2,
            new COManagerRole()
        );

        // Create Community Outreach Center 2
        CommunityOutreach co2 = new CommunityOutreach();
        co2.setCOId("CO2");
        co2.setCOName("Care and Share Center");
        co2.setCOPhone("9876543210");
        co2.setCOAddress("123 Maple Avenue");
        co2.setCOCity("Cambridge");
        co2.setCOState("MA");
        co2.setCOZipcode("02140");
        co2.setCOAgent("Community Manager Two");
        co2.setCOAccount(account2);

        // Add the second Community Outreach to the list
        this.COList.add(co2);

        // Debug messages to confirm initialization
        System.out.println("Default Community Outreach Centers initialized.");
        for (CommunityOutreach co : this.COList) {
            System.out.println("ID: " + co.getCOId() + ", Name: " + co.getCOName());
        }
    }


}
