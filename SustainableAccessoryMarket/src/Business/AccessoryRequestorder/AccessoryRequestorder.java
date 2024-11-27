
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AccessoryRequestorder;

import Business.AccessoryRequestor.AccessoryRequestor;
import Business.UserAccount.UserAccount;

/**
 *
 * @author reetikabhanushali 
 */
public class AccessoryRequestorder {
    private String requestorOrderId;
    private String requestorName;
    private String requestorOrderQuant;
    private String requestorOrderType;
    private String requestorOrderStatus;
    private String requestorPantryName;
    private String requestorVol;
    private String requestorAdd;
    private String requestorCity;
    private String requestorZip;
     private String requestorDonId;

    private UserAccount reqRequestorAcc;

    public String getReqVol() {
        return requestorVol;
    }

    public void setReqVol(String requestorVol) {
        this.requestorVol = requestorVol;
    }
    
    public String getReqOrderId() {
        return requestorOrderId;
    }

    public void setReqOrderId(String requestorOrderId) {
        this.requestorOrderId = requestorOrderId;
    }

    public String getReqName() {
        return requestorName;
    }

    public void setReqName(String requestorName) {
        this.requestorName = requestorName;
    }

    public String getReqOrderQuant() {
        return requestorOrderQuant;
    }

    public void setReqOrderQuant(String requestorOrderQuant) {
        this.requestorOrderQuant = requestorOrderQuant;
    }

    public String getReqOrderType() {
        return requestorOrderType;
    }

    public void setReqOrderType(String requestorOrderType) {
        this.requestorOrderType = requestorOrderType;
    }

    public String getReqOrderStatus() {
        return requestorOrderStatus;
    }

    public void setReqOrderStatus(String requestorOrderStatus) {
        this.requestorOrderStatus = requestorOrderStatus;
    }

    public String getReqPantryName() {
        return requestorPantryName;
    }

    public void setReqPantryName(String requestorPantryName) {
        this.requestorPantryName = requestorPantryName;
    }

    public String getReqAdd() {
        return requestorAdd;
    }

    public void setReqAdd(String requestorAdd) {
        this.requestorAdd = requestorAdd;
    }

    public String getReqCity() {
        return requestorCity;
    }

    public void setReqCity(String requestorCity) {
        this.requestorCity = requestorCity;
    }

    public String getReqZip() {
        return requestorZip;
    }

    public void setReqZip(String requestorZip) {
        this.requestorZip = requestorZip;
    }

    

    public UserAccount getReqRequestorAcc() {
        return reqRequestorAcc;
    }

    public void setReqRequestorAcc(UserAccount reqRequestorAcc) {
        this.reqRequestorAcc = reqRequestorAcc;
    }

    public String getReqDonId() {
        return requestorDonId;
    }

    public void setReqDonId(String requestorDonId) {
        this.requestorDonId = requestorDonId;
    }
    
     @Override
    public String toString(){
        return requestorOrderId;
    } 
    
}
