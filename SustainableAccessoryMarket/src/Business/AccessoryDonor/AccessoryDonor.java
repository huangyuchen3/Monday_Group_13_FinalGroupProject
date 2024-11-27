/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AccessoryDonor;

import Business.UserAccount.UserAccount;

/**
 *
 * @author reetikabhanushali 
 */
public class AccessoryDonor {
    private int donrId;
    private String donrName;
    private String donrType;
    private String donrPhone;
    private String donrAddress;
    private String donrCity;
    private String donrState;
    private String donrZipcode;
    private String donrEmail;
    private UserAccount donrAccount;
    private String donrUserName;
     private String donrPwd;

    public String getDonUserName() {
        return donrUserName;
    }

    public void setDonUserName(String donrUserName) {
        this.donrUserName = donrUserName;
    }

    public String getDonPwd() {
        return donrPwd;
    }

    public void setDonPwd(String donrPwd) {
        this.donrPwd = donrPwd;
    }

    
    
    
    public AccessoryDonor(UserAccount ua)
    {
        this.donrAccount = ua;
        this.donrUserName = ua.getUsername();
        this.donrPwd = ua.getPassword();
                
    }

    public int getDonorId() {
        return donrId;
    }

    public void setDonorId(int donrId) {
        this.donrId = donrId;
    }

    public String getDonorName() {
        return donrName;
    }

    public void setDonorName(String donrName) {
        this.donrName = donrName;
    }

    public String getDonorType() {
        return donrType;
    }

    public void setDonorType(String donrType) {
        this.donrType = donrType;
    }

    public String getDonorPhno() {
        return donrPhone;
    }

    public void setDonorPhno(String donrPhone) {
        this.donrPhone = donrPhone;
    }

    public String getDonorAddres() {
        return donrAddress;
    }

    public void setDonorAddres(String donrAddress) {
        this.donrAddress = donrAddress;
    }

    public String getDonorCity() {
        return donrCity;
    }

    public void setDonorCity(String donrCity) {
        this.donrCity = donrCity;
    }

    public String getDonorState() {
        return donrState;
    }

    public void setDonorState(String donrState) {
        this.donrState = donrState;
    }

    public String getDonorZipcode() {
        return donrZipcode;
    }

    public void setDonorZipcode(String donrZipcode) {
        this.donrZipcode = donrZipcode;
    }

    public String getDonorEmail() {
        return donrEmail;
    }

    public void setDonorEmail(String donrEmail) {
        this.donrEmail = donrEmail;
    }

    public UserAccount getDonorAccount() {
        return donrAccount;
    }

    public void setDonorAccount(UserAccount donrAccount) {
        this.donrAccount = donrAccount;
    }
    
}
