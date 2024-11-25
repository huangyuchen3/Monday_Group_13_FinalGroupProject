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
public class FoodPantryItemsDirectory {
    private ArrayList<FoodPantryItems> fcPantryItemsList;

    public FoodPantryItemsDirectory(){
        fcPantryItemsList = new ArrayList<FoodPantryItems>();
    }
    public ArrayList<FoodPantryItems> getFcpiList() {
        return fcPantryItemsList;
    }

    public void setFcpiList(ArrayList<FoodPantryItems> fcPantryItemsList) {
        this.fcPantryItemsList = fcPantryItemsList;
    }
    public void addFCPItems(FoodPantryItems fcpi){
        fcPantryItemsList.add(fcpi);
    }
    public void deleteFCPItems(FoodPantryItems selectedfcpi){
        fcPantryItemsList.remove(selectedfcpi);
    }
}
