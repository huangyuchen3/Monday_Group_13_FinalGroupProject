/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DropOff;

import Business.UserAccount.UserAccount;

/**
 *
 *@author ankitapatil
 */
public class DropOff {
    private String DropOffId;
    private String DropOffName;
    private String DropOffPhone;
    private String DropOffHubName;
    private String DropOffAddress;
    private String DropOffCity;
    private String DropOffState;
    private String DropOffZipcode;
    private String DropOffManager;
    private UserAccount DropOffAccount;

    public String getDropOffId() {
        return DropOffId;
    }

    public void setDropOffId(String fcPantryId) {
        this.DropOffId = fcPantryId;
    }

    public String getDropOffName() {
        return DropOffName;
    }

    public void setDropOffName(String fcPantryName) {
        this.DropOffName = DropOffName;
    }

    public String getDropOffHubName() {
        return DropOffHubName;
    }

    public void setDropOffHubName(String fcPantryWarehouseName) {
        this.DropOffHubName = DropOffHubName;
    }

    public String getDropOffAddress() {
        return DropOffAddress;
    }

    public void setDropOffAddresss(String fcPantryAddress) {
        this.DropOffAddress = fcPantryAddress;
    }

    public String getDropOffCity() {
        return DropOffCity;
    }

    public void setDropOffCity(String fcPantryCity) {
        this.DropOffCity = fcPantryCity;
    }

    public String getDropOffState() {
        return DropOffState;
    }

    public void setDropOffState(String fcPantryState) {
        this.DropOffState = fcPantryState;
    }

    public String getDropOffZipcode() {
        return DropOffZipcode;
    }

    public void setDropOffZipcode(String fcPantryZipcode) {
        this.DropOffZipcode = fcPantryZipcode;
    }

    public String getDropOffManager() {
        return DropOffManager;
    }

    public void setDropOffManager(String fcPantryManager) {
        this.DropOffManager = fcPantryManager;
    }

    public String getDropOffPhone() {
        return DropOffPhone;
    }

    public void setDropOffPhone(String fcPantryPhone) {
        this.DropOffPhone = fcPantryPhone;
    }

    public UserAccount getDropOffAccount() {
        return DropOffAccount;
    }

    public void setDropOffAccount(UserAccount fcPantryAccount) {
        this.DropOffAccount = fcPantryAccount;
    }
    @Override
    public String toString(){
        return DropOffId;
    }
    
}
