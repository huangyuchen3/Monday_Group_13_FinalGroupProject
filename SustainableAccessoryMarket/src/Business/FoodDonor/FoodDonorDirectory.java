/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodDonor;

import Business.FoodRequestor.FoodRequestor;
import java.util.ArrayList;

/**
 *
 * @author ankitapatil 
 */
public class FoodDonorDirectory {
    private ArrayList<FoodDonor> donrList;
    
    public FoodDonorDirectory(){
        donrList = new ArrayList();
    }

    public ArrayList<FoodDonor> getDonorList() {
        return donrList;
    }

    public void setDonorList(ArrayList<FoodDonor> donrList) {
        this.donrList = donrList;
    }
    
    public void addDonDir(FoodDonor dd) {
        donrList.add(dd);
    }
    
    public void removeDonor(FoodDonor d) {
        this.donrList.remove(d);
    }

    public void removeDonByIndex(int index) {
        donrList.remove(index);
    }

    public FoodDonor getDonorDetailsByIndex(int index) {
        return donrList.get(index);
    }
    
    int donIdGeneration = 1000;

    public int generateDonOrderId() {
        donIdGeneration++;
        return donIdGeneration;
    }
    public String getdonState(String name){
        for(FoodDonor d: donrList){
            if(d.getDonorAccount().getUsername().equals(name)){
                return d.getDonorState();
            }
        }
        return null;
    }
}
