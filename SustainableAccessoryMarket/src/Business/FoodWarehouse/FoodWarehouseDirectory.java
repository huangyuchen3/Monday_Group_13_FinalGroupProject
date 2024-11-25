/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodWarehouse;

import java.util.ArrayList;
import Business.FoodWarehouse.FoodWarehouseDirectory;

/**
 *
 *@author ankitapatil
 */
public class FoodWarehouseDirectory {
     ArrayList<FoodWarehouse> fcWarehouseList;

     public FoodWarehouseDirectory(){
         fcWarehouseList = new ArrayList<FoodWarehouse>();
     }
    public ArrayList<FoodWarehouse> getFcwList() {
        return fcWarehouseList;
    }

    public void setFcwList(ArrayList<FoodWarehouse> fcWarehouseList) {
        this.fcWarehouseList = fcWarehouseList;
    }
    public void addNewFCWarehouse(FoodWarehouse fcw){
        fcWarehouseList.add(fcw);
    }
    public void deleteFCWarehouse(FoodWarehouse selectedfcw){
        fcWarehouseList.remove(selectedfcw);
    }
    public String getWHname(String FCAname){
        String WHname;
        for(FoodWarehouse f: fcWarehouseList){
            if(f.getFcwAdmin().equals(FCAname)){
                return f.getFcwName();
            }
        }
        return null;
    }
}
