/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DropOff;

import Business.UserAccount.UserAccount;

/**
 *
 *@author reetikabhanushali
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

    public void setDropOffId(String DropOffId) {
        this.DropOffId = DropOffId;
    }

    public String getDropOffName() {
        return DropOffName;
    }

    public void setDropOffName(String DropOffName) {
        this.DropOffName = DropOffName;
    }

    public String getDropOffHubName() {
        return DropOffHubName;
    }

    public void setDropOffHubName(String DropOffHubName) {
        this.DropOffHubName = DropOffHubName;
    }

    public String getDropOffAddress() {
        return DropOffAddress;
    }

    public void setDropOffAddresss(String DropOffAddress) {
        this.DropOffAddress = DropOffAddress;
    }

    public String getDropOffCity() {
        return DropOffCity;
    }

    public void setDropOffCity(String DropOffCity) {
        this.DropOffCity = DropOffCity;
    }

    public String getDropOffState() {
        return DropOffState;
    }

    public void setDropOffState(String DropOffState) {
        this.DropOffState = DropOffState;
    }

    public String getDropOffZipcode() {
        return DropOffZipcode;
    }

    public void setDropOffZipcode(String DropOffZipcode) {
        this.DropOffZipcode = DropOffZipcode;
    }

    public String getDropOffManager() {
        return DropOffManager;
    }

    public void setDropOffManager(String DropOffManager) {
        this.DropOffManager = DropOffManager;
    }

    public String getDropOffPhone() {
        return DropOffPhone;
    }

    public void setDropOffPhone(String DropOffPhone) {
        this.DropOffPhone = DropOffPhone;
    }

    public UserAccount getDropOffAccount() {
        return DropOffAccount;
    }

    public void setDropOffAccount(UserAccount DropOffAccount) {
        this.DropOffAccount = DropOffAccount;
    }
    @Override
    public String toString(){
        return DropOffId;
    }
    
}
