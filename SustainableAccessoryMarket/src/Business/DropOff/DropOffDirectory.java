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
}
