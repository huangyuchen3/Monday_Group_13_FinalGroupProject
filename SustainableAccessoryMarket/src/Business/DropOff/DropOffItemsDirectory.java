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
public class DropOffItemsDirectory {
    private ArrayList<DropOffItems> DropOffItemsList;

    public DropOffItemsDirectory(){
        DropOffItemsList = new ArrayList<DropOffItems>();
    }
    public ArrayList<DropOffItems> getDOiList() {
        return DropOffItemsList;
    }

    public void setFcpiList(ArrayList<DropOffItems> DropOffItemsList) {
        this.DropOffItemsList = DropOffItemsList;
    }
    public void addFCPItems(DropOffItems fcpi){
        DropOffItemsList.add(fcpi);
    }
    public void deleteFCPItems(DropOffItems selectedfcpi){
        DropOffItemsList.remove(selectedfcpi);
    }
}
