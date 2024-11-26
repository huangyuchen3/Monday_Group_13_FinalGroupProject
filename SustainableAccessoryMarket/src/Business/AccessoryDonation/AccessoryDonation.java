/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AccessoryDonation;

import Business.AccessoryDonor.AccessoryDonor;
import Business.UserAccount.UserAccount;

/**
 *
 * @auhtor ankitapatil
 */
public class AccessoryDonation {
    
    private String donationId;
    private String donationDname;
    private String donationItem;
    private String donationQuant;
    private String donationPickuptype;
    private String donationStatus;
    private String donationVol;
    private String donationWHname;
    private String donationAdd;
    private String donationCity;
    private String donationZip;
    private UserAccount donationDonorAcc;
    
    public AccessoryDonation(){
        donationId += 1;
    }

    public String getDonatAdd() {
        return donationAdd;
    }

    public void setDonatAdd(String donationAdd) {
        this.donationAdd = donationAdd;
    }

    public String getDonatCity() {
        return donationCity;
    }

    public void setDonatCity(String donationCity) {
        this.donationCity = donationCity;
    }

    public String getDonatZip() {
        return donationZip;
    }

    public void setDonatZip(String donationZip) {
        this.donationZip = donationZip;
    }

    public String getDonatVol() {
        return donationVol;
    }

    public void setDonatVol(String donationVol) {
        this.donationVol = donationVol;
    }
    
    public String getDonatItem() {
        return donationItem;
    }

    public void setDonatItem(String donationFooditem) {
        this.donationItem = donationFooditem;
    }

    public String getDonatQuant() {
        return donationQuant;
    }

    public void setDonatQuant(String donationFoodQuant) {
        this.donationQuant = donationFoodQuant;
    }

    public UserAccount getDonatDonorAcc() {
        return donationDonorAcc;
    }

    public void setDonatDonorAcc(UserAccount donationDonorAcc) {
        this.donationDonorAcc = donationDonorAcc;
    }
    
    public String getDonatStatus() {
        return donationStatus;
    }

    public void setDonatStatus(String donationStatus) {
        this.donationStatus = donationStatus;
    }

    public String getDonatId() {
        return donationId;
    }

    public void setDonatId(String donationId) {
        this.donationId = donationId;
    }

    public String getDonatDname() {
        return donationDname;
    }

    public void setDonatDname(String donationDname) {
        this.donationDname = donationDname;
    }

    public String getDonatPickuptype() {
        return donationPickuptype;
    }

    public void setDonatPickuptype(String donationPickuptype) {
        this.donationPickuptype = donationPickuptype;
    }

    public String getDonatWHname() {
        return donationWHname;
    }

    public void setDonatWHname(String donationWHname) {
        this.donationWHname = donationWHname;
    }
    @Override
    public String toString(){
        return donationId;
    }
}
