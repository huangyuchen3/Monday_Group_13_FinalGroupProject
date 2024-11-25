/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodPantry;

import Business.UserAccount.UserAccount;

/**
 *
 *@author ankitapatil
 */
public class FoodPantry {
    private String fcPantryId;
    private String fcPantryName;
    private String fcPantryPhone;
    private String fcPantryWarehouseName;
    private String fcPantryAddress;
    private String fcPantryCity;
    private String fcPantryState;
    private String fcPantryZipcode;
    private String fcPantryManager;
    private UserAccount fcPantryAccount;

    public String getFcpId() {
        return fcPantryId;
    }

    public void setFcpId(String fcPantryId) {
        this.fcPantryId = fcPantryId;
    }

    public String getFcpName() {
        return fcPantryName;
    }

    public void setFcpName(String fcPantryName) {
        this.fcPantryName = fcPantryName;
    }

    public String getFcpWHname() {
        return fcPantryWarehouseName;
    }

    public void setFcpWHname(String fcPantryWarehouseName) {
        this.fcPantryWarehouseName = fcPantryWarehouseName;
    }

    public String getFcpAddres() {
        return fcPantryAddress;
    }

    public void setFcpAddres(String fcPantryAddress) {
        this.fcPantryAddress = fcPantryAddress;
    }

    public String getFcpCity() {
        return fcPantryCity;
    }

    public void setFcpCity(String fcPantryCity) {
        this.fcPantryCity = fcPantryCity;
    }

    public String getFcpState() {
        return fcPantryState;
    }

    public void setFcpState(String fcPantryState) {
        this.fcPantryState = fcPantryState;
    }

    public String getFcpZipcode() {
        return fcPantryZipcode;
    }

    public void setFcpZipcode(String fcPantryZipcode) {
        this.fcPantryZipcode = fcPantryZipcode;
    }

    public String getFcpManager() {
        return fcPantryManager;
    }

    public void setFcpManager(String fcPantryManager) {
        this.fcPantryManager = fcPantryManager;
    }

    public String getFcpPhno() {
        return fcPantryPhone;
    }

    public void setFcpPhno(String fcPantryPhone) {
        this.fcPantryPhone = fcPantryPhone;
    }

    public UserAccount getFcpAccount() {
        return fcPantryAccount;
    }

    public void setFcpAccount(UserAccount fcPantryAccount) {
        this.fcPantryAccount = fcPantryAccount;
    }
    @Override
    public String toString(){
        return fcPantryId;
    }
    
}
