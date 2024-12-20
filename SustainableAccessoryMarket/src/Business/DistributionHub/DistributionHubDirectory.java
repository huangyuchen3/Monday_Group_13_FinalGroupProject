/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DistributionHub;

import java.util.ArrayList;
import Business.DistributionHub.DistributionHubDirectory;
import Business.EcoSystem;
import Business.Role.DHManagerRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Worker.Worker;

/**
 *
 *@author reetikabhanushali
 */
public class DistributionHubDirectory {
     ArrayList<DistributionHub> DistributionHubList;
     private UserAccountDirectory userAccountDirectory;
     EcoSystem ecosystem;

     public DistributionHubDirectory(UserAccountDirectory userAccountDirectory){
        //DistributionHubList = new ArrayList<DistributionHub>();
        this.userAccountDirectory = userAccountDirectory;
        this.ecosystem = ecosystem; // Assign ecosystem
        this.DistributionHubList = new ArrayList<>();
        initializeDefaultDistributionHubs(userAccountDirectory);
     }
    public ArrayList<DistributionHub> getFadList() {
        return DistributionHubList;
    }

    public void setFadList(ArrayList<DistributionHub> DistributionHubIdList) {
        this.DistributionHubList = DistributionHubIdList;
    }
    public void addNewDistributionHub(DistributionHub fac){
//        for (DistributionHub existingHub : DistributionHubList) {
//        if (existingHub.getDistributionHubId().equals(fac.getDistributionHubId())) {
//            System.out.println("Duplicate Distribution Hub ID detected: " + fac.getDistributionHubId());
//            return; // Prevent duplicate addition
//        }
//    }
//    DistributionHubList.add(fac);
//    ecosystem.setdistributionHubCnt(ecosystem.getdistributionHubCnt() + 1); // Increment count only for new hubs
        for (DistributionHub existingHub : DistributionHubList) {
            if (existingHub.getDistributionHubId().equals(fac.getDistributionHubId())) {
                System.out.println("Duplicate Distribution Hub ID detected: " + fac.getDistributionHubId());
                return; // Prevent duplicate addition
            }
        }
        DistributionHubList.add(fac);

        // Increment count only if ecosystem is valid
        if (ecosystem != null) {
            ecosystem.setdistributionHubCnt(ecosystem.getdistributionHubCnt() + 1);
        }

    }
    public void deleteDistributionHub(DistributionHub selectedfac){
//        if (DistributionHubList.remove(selectedfac)) {
//        ecosystem.setdistributionHubCnt(ecosystem.getdistributionHubCnt() - 1); // Decrement count
//    }
        if (DistributionHubList.remove(selectedfac)) {
            if (ecosystem != null) {
                ecosystem.setdistributionHubCnt(ecosystem.getdistributionHubCnt() - 1);
            }
        }
    }
    public String getDHname(String FCAname) {
        System.out.println("Finding Hub for Manager: " + FCAname);
        for (DistributionHub f : DistributionHubList) {
            System.out.println("Checking Hub Admin: " + f.getDistributionHubAdmin());
            if (f.getDistributionHubAdmin().equals(FCAname)) {
                System.out.println("Hub Found: " + f.getDistributionHubName());
                return f.getDistributionHubName();
            }
        }
        System.out.println("No Hub Found for Manager: " + FCAname);
        return null;
    }
    
    public void initializeDefaultDistributionHubs(UserAccountDirectory userAccountDirectory) {
        // Create Worker and UserAccount for the first hub
        if (!DistributionHubList.isEmpty()) {
            // Prevent re-initialization
            return;
        }
        if (ecosystem != null) {
            ecosystem.setdistributionHubCnt(DistributionHubList.size());
        }
        Worker admin1 = new Worker();
        admin1.setName("Distribution Hub Manager One");
        UserAccount account1 = userAccountDirectory.createUserAccount(
            "dhmanager1",
            "@Password123",
            admin1,
            new DHManagerRole()
        );

        DistributionHub hub1 = new DistributionHub();
        hub1.setDistributionHubId("DH001");
        hub1.setDistributionHubName("Central Distribution Hub");
        hub1.setDistributionHubPhone("1234567890");
        hub1.setDistributionHubAddress("123 Main St");
        hub1.setDistributionHubCity("Boston");
        hub1.setDistributionHubState("MA");
        hub1.setDistributionHubZipcode("02118");
        hub1.setDistributionHubAdmin(admin1.getName());
        hub1.setDistributionHubAccount(account1);
        DistributionHubList.add(hub1);
        
        System.out.println("Hub Added: " + hub1.getDistributionHubName() + ", Admin: " + hub1.getDistributionHubAdmin());

        // Create Worker and UserAccount for the second hub
        Worker admin2 = new Worker();
        admin2.setName("Distribution Hub Manager Two");
        UserAccount account2 = userAccountDirectory.createUserAccount(
            "dhmanager2",
            "@Password123",
            admin2,
            new DHManagerRole()
        );

        DistributionHub hub2 = new DistributionHub();
        hub2.setDistributionHubId("DH002");
        hub2.setDistributionHubName("East Distribution Hub");
        hub2.setDistributionHubPhone("9876543210");
        hub2.setDistributionHubAddress("456 Elm St");
        hub2.setDistributionHubCity("New York");
        hub2.setDistributionHubState("NY");
        hub2.setDistributionHubZipcode("10001");
        hub2.setDistributionHubAdmin(admin2.getName());
        hub2.setDistributionHubAccount(account2);
        DistributionHubList.add(hub2);
        
        System.out.println("DistributionHubList: " + DistributionHubList);
    }
}
