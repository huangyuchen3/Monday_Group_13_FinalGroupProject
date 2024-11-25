/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodRequestor;

import Business.UserAccount.UserAccount;

/**
 *
 * @author ankitapatil 
 */
public class FoodRequestor {
    private String requestorId;
    private String requestorName;
    private String requestorType;
    private String requestorQuan;
    private String requestorPhone;
    private String requestorAddress;
    private String requestorCity;
    private String requestorState;
    private String requestorZipcode;
    private String requestorEmail;
    private UserAccount userAccount;
    private String requestorUserName;
     private String requestorPwd;

    public String getReqUserName() {
        return requestorUserName;
    }

    public void setReqUserName(String requestorUserName) {
        this.requestorUserName = requestorUserName;
    }

    public String getReqPwd() {
        return requestorPwd;
    }

    public void setReqPwd(String requestorPwd) {
        this.requestorPwd = requestorPwd;
    }

    public String getReqQuan() {
        return requestorQuan;
    }

    public void setReqQuan(String requestorQuan) {
        this.requestorQuan = requestorQuan;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
   
    
    
    
    public FoodRequestor(UserAccount ua)
    {
        this.userAccount = ua;
        this.requestorUserName = ua.getUsername();
        this.requestorPwd = ua.getPassword();
                
    }
    

    public String getReqId() {
        return requestorId;
    }

    public void setReqId(String requestorId) {
        this.requestorId = requestorId;
    }

    public String getReqName() {
        return requestorName;
    }

    public void setReqName(String requestorName) {
        this.requestorName = requestorName;
    }

    public String getReqType() {
        return requestorType;
    }

    public void setReqType(String requestorType) {
        this.requestorType = requestorType;
    }

    public String getReqPhno() {
        return requestorPhone;
    }

    public void setReqPhno(String requestorPhone) {
        this.requestorPhone = requestorPhone;
    }

    public String getReqAddres() {
        return requestorAddress;
    }

    public void setReqAddres(String requestorAddress) {
        this.requestorAddress = requestorAddress;
    }

    public String getReqCity() {
        return requestorCity;
    }

    public void setReqCity(String requestorCity) {
        this.requestorCity = requestorCity;
    }

    public String getReqState() {
        return requestorState;
    }

    public void setReqState(String requestorState) {
        this.requestorState = requestorState;
    }

    public String getReqZipcode() {
        return requestorZipcode;
    }

    public void setReqZipcode(String requestorZipcode) {
        this.requestorZipcode = requestorZipcode;
    }

    public String getReqEmail() {
        return requestorEmail;
    }

    public void setReqEmail(String requestorEmail) {
        this.requestorEmail = requestorEmail;
    }

    public UserAccount getReqAccount() {
        return userAccount;
    }

    public void setReqAccount(UserAccount reqAccount) {
        this.userAccount = reqAccount;
    }
    
}
