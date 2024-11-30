/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DistributionHub;

import java.util.ArrayList;
import Business.DistributionHub.DistributionHubDirectory;
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

     public DistributionHubDirectory(){
         DistributionHubList = new ArrayList<DistributionHub>();
     }
    public ArrayList<DistributionHub> getFadList() {
        return DistributionHubList;
    }

    public void setFadList(ArrayList<DistributionHub> DistributionHubIdList) {
        this.DistributionHubList = DistributionHubIdList;
    }
    public void addNewDistributionHub(DistributionHub fac){
        DistributionHubList.add(fac);
    }
    public void deleteDistributionHub(DistributionHub selectedfac){
        DistributionHubList.remove(selectedfac);
    }
    public String getDHname(String FCAname){
        String WHname;
        for(DistributionHub f: DistributionHubList){
            if(f.getDistributionHubAdmin().equals(FCAname)){
                return f.getDistributionHubName();
            }
        }
        return null;
    }
    
    public void initializeDefaultDistributionHubs(UserAccountDirectory userAccountDirectory) {
        // Create Worker and UserAccount for the first hub
        Worker admin1 = new Worker();
        admin1.setName("Admin One");
        UserAccount account1 = userAccountDirectory.createUserAccount(
            "hubadmin1",
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
        hub1.setDistributionHubAdmin("Admin One");
        hub1.setDistributionHubAccount(account1);
        DistributionHubList.add(hub1);

        // Create Worker and UserAccount for the second hub
        Worker admin2 = new Worker();
        admin2.setName("Admin Two");
        UserAccount account2 = userAccountDirectory.createUserAccount(
            "hubadmin2",
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
        hub2.setDistributionHubAdmin("Admin Two");
        hub2.setDistributionHubAccount(account2);
        DistributionHubList.add(hub2);
    }
}
