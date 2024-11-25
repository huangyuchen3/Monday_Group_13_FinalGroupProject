/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodDonation;

import java.util.ArrayList;

/**
 *
 *@author ankitapatil
 */
public class FoodDonationDirectory {
    public ArrayList<FoodDonation> donationList = new ArrayList<FoodDonation>();
    
    public FoodDonationDirectory(){
        donationList = new ArrayList();
    }

    public ArrayList<FoodDonation> getDonatList() {
        return donationList;
    }

    public void setDonatList(ArrayList<FoodDonation> donationList) {
        this.donationList = donationList;
    }
     public void addNewDonation(FoodDonation dt){
        donationList.add(dt);
    }
    public void deleteDonation(FoodDonation selectedD){
        donationList.remove(selectedD);
    }
}
