/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AccessoryDonation;

import java.util.ArrayList;

/**
 *
 *@author ankitapatil
 */
public class AccessoryDonationDirectory {
    public ArrayList<AccessoryDonation> donationList = new ArrayList<AccessoryDonation>();
    
    public AccessoryDonationDirectory(){
        donationList = new ArrayList();
    }

    public ArrayList<AccessoryDonation> getDonatList() {
        return donationList;
    }

    public void setDonatList(ArrayList<AccessoryDonation> donationList) {
        this.donationList = donationList;
    }
     public void addNewDonation(AccessoryDonation dt){
        donationList.add(dt);
    }
    public void deleteDonation(AccessoryDonation selectedD){
        donationList.remove(selectedD);
    }
}
