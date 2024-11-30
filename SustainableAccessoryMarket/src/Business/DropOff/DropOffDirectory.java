/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DropOff;

import Business.Role.DOManagerRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Worker.Worker;
import java.util.ArrayList;

/**
 *
 *@author reetikabhanushali
 */
public class DropOffDirectory {
    private ArrayList<DropOff> DropOffList = new ArrayList<DropOff>();
    private UserAccountDirectory userAccountDirectory;
    
    public DropOffDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
        this.DropOffList = new ArrayList<>();
        initializeDefaultDropOffStores(userAccountDirectory);
    }

    public ArrayList<DropOff> getFcpList() {
        return DropOffList;
    }

    public void setFcpList(ArrayList<DropOff> DropOffList) {
        this.DropOffList = DropOffList;
    }
     public void addNewDO(DropOff fcp){
        DropOffList.add(fcp);
    }
    public void deleteFCPantry(DropOff selectedfcp){
        DropOffList.remove(selectedfcp);
    }
    
    public void initializeDefaultDropOffStores(UserAccountDirectory userAccountDirectory) {
        Worker manager1 = new Worker();
        manager1.setName("Manager one");
        UserAccount account1 = userAccountDirectory.createUserAccount(
            "domanager1",
            "@Password123",
            manager1,
            new DOManagerRole()
        );

        DropOff dropOff1 = new DropOff();
        dropOff1.setDropOffId("DO1");
        dropOff1.setDropOffName("Default DropOff Store 1");
        dropOff1.setDropOffPhone("1234567890");
        dropOff1.setDropOffHubName("Main Distribution Hub");
        dropOff1.setDropOffAddress("123 Main Street");
        dropOff1.setDropOffCity("Boston");
        dropOff1.setDropOffState("MA");
        dropOff1.setDropOffZipcode("02115");
        dropOff1.setDropOffManager("Manager one");
        dropOff1.setDropOffAccount(account1);
        this.DropOffList.add(dropOff1);
        
        
        // Create Worker for Manager 2
        Worker manager2 = new Worker();
        manager2.setName("Manager two");

        // Create UserAccount for Manager 2
        UserAccount account2 = userAccountDirectory.createUserAccount(
            "domanager2",
            "@Password123",
            manager2,
            new DOManagerRole()
        );

        // Create DropOff for Manager 2
        DropOff dropOff2 = new DropOff();
        dropOff2.setDropOffId("DO2");
        dropOff2.setDropOffName("Default DropOff Store 2");
        dropOff2.setDropOffPhone("9876543210");
        dropOff2.setDropOffHubName("Secondary Distribution Hub");
        dropOff2.setDropOffAddress("456 Elm Street");
        dropOff2.setDropOffCity("Cambridge");
        dropOff2.setDropOffState("MA");
        dropOff2.setDropOffZipcode("02139");
        dropOff2.setDropOffManager("Manager two");
        dropOff2.setDropOffAccount(account2);

        // Add the second DropOff to the list
        this.DropOffList.add(dropOff2);
    }


}
