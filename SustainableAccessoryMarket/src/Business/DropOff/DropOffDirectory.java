/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DropOff;

import java.util.ArrayList;

/**
 *
 *@author reetikabhanushali
 */
public class DropOffDirectory {
    private ArrayList<DropOff> DropOffList = new ArrayList<DropOff>();
    
    public DropOffDirectory() {
        DropOffList = new ArrayList<>();
        initializeDefaultDropOffStores();
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
    
    public void initializeDefaultDropOffStores() {
        DropOff dropOff1 = new DropOff();
        dropOff1.setDropOffId("DO1");
        dropOff1.setDropOffName("Default DropOff Store 1");
        dropOff1.setDropOffPhone("123-456-7890");
        dropOff1.setDropOffHubName("Main Distribution Hub");
        dropOff1.setDropOffAddress("123 Main Street");
        dropOff1.setDropOffCity("Boston");
        dropOff1.setDropOffState("MA");
        dropOff1.setDropOffZipcode("02115");
        dropOff1.setDropOffManager("Manager 1");

        DropOff dropOff2 = new DropOff();
        dropOff2.setDropOffId("DO2");
        dropOff2.setDropOffName("Default DropOff Store 2");
        dropOff2.setDropOffPhone("987-654-3210");
        dropOff2.setDropOffHubName("Secondary Hub");
        dropOff2.setDropOffAddress("456 Elm Street");
        dropOff2.setDropOffCity("Cambridge");
        dropOff2.setDropOffState("MA");
        dropOff2.setDropOffZipcode("02139");
        dropOff2.setDropOffManager("Manager 2");

        // Add these default drop-off stores to the list
        addNewDO(dropOff1);
        addNewDO(dropOff2);
    }
}
