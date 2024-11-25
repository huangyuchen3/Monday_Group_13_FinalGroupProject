/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodPantry;

import java.util.ArrayList;

/**
 *
 *@author ankitapatil
 */
public class FoodPantryDirectory {
    private ArrayList<FoodPantry> fcPantryList = new ArrayList<FoodPantry>();

    public ArrayList<FoodPantry> getFcpList() {
        return fcPantryList;
    }

    public void setFcpList(ArrayList<FoodPantry> fcPantryList) {
        this.fcPantryList = fcPantryList;
    }
     public void addNewFCPantry(FoodPantry fcp){
        fcPantryList.add(fcp);
    }
    public void deleteFCPantry(FoodPantry selectedfcp){
        fcPantryList.remove(selectedfcp);
    }
}
