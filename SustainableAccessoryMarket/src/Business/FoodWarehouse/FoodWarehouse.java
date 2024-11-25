/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodWarehouse;

import Business.UserAccount.UserAccount;

/**
 *
 *@author ankitapatil
 */
public class FoodWarehouse {
    private String fcWarehouseId;
    private String fcWarehouseName;
    private String fcWarehousePhone;
    private String fcWarehouseAddress;
    private String fcWarehouseCity;
    private String fcWarehouseState;
    private String fcWarehouseZipcode;
    private String fcWarehouseAdmin;
    private UserAccount fcWarehouseAccount;

    public String getFcwId() {
        return fcWarehouseId;
    }

    public void setFcwId(String fcWarehouseId) {
        this.fcWarehouseId = fcWarehouseId;
    }

    

    public String getFcwName() {
        return fcWarehouseName;
    }

    public void setFcwName(String fcWarehouseName) {
        this.fcWarehouseName = fcWarehouseName;
    }

    public String getFcwPhno() {
        return fcWarehousePhone;
    }

    public void setFcwPhno(String fcWarehousePhone) {
        this.fcWarehousePhone = fcWarehousePhone;
    }

    public String getFcwAddres() {
        return fcWarehouseAddress;
    }

    public void setFcwAddres(String fcWarehouseAddress) {
        this.fcWarehouseAddress = fcWarehouseAddress;
    }

    public String getFcwCity() {
        return fcWarehouseCity;
    }

    public void setFcwCity(String fcWarehouseCity) {
        this.fcWarehouseCity = fcWarehouseCity;
    }

    public String getFcwState() {
        return fcWarehouseState;
    }

    public void setFcwState(String fcWarehouseState) {
        this.fcWarehouseState = fcWarehouseState;
    }

    public String getFcwZipcode() {
        return fcWarehouseZipcode;
    }

    public void setFcwZipcode(String fcWarehouseZipcode) {
        this.fcWarehouseZipcode = fcWarehouseZipcode;
    }

    public String getFcwAdmin() {
        return fcWarehouseAdmin;
    }

    public void setFcwAdmin(String fcWarehouseAdmin) {
        this.fcWarehouseAdmin = fcWarehouseAdmin;
    }

    public UserAccount getFcwAccount() {
        return fcWarehouseAccount;
    }

    public void setFcwAccount(UserAccount fcWarehouseAccount) {
        this.fcWarehouseAccount = fcWarehouseAccount;
    }
   @Override
    public String toString(){
        return fcWarehouseId;
    }
}
