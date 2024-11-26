/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AccessoryDonor;

import Business.AccessoryRequestor.AccessoryRequestor;
import java.util.ArrayList;

/**
 *
 * @author ankitapatil 
 */
public class AccessoryDonorDirectory {
    private ArrayList<AccessoryDonor> donrList;
    
    public AccessoryDonorDirectory(){
        donrList = new ArrayList();
    }

    public ArrayList<AccessoryDonor> getDonorList() {
        return donrList;
    }

    public void setDonorList(ArrayList<AccessoryDonor> donrList) {
        this.donrList = donrList;
    }
    
    public void addDonDir(AccessoryDonor dd) {
        donrList.add(dd);
    }
    
    public void removeDonor(AccessoryDonor d) {
        this.donrList.remove(d);
    }

    public void removeDonByIndex(int index) {
        donrList.remove(index);
    }

    public AccessoryDonor getDonorDetailsByIndex(int index) {
        return donrList.get(index);
    }
    
    int donIdGeneration = 1000;

    public int generateDonOrderId() {
        donIdGeneration++;
        return donIdGeneration;
    }
    public String getdonState(String name){
        for(AccessoryDonor d: donrList){
            if(d.getDonorAccount().getUsername().equals(name)){
                return d.getDonorState();
            }
        }
        return null;
    }
}
