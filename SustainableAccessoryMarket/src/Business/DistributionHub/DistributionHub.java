/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DistributionHub;

import Business.UserAccount.UserAccount;

/**
 *
 *@author reetikabhanushali
 */
public class DistributionHub {
    private String DistributionHubId;
    private String DistributionHubName;
    private String DistributionHubPhone;
    private String DistributionHubAddress;
    private String DistributionHubCity;
    private String DistributionHubState;
    private String DistributionHubZipcode;
    private String DistributionHubAdmin;
    private UserAccount DistributionHubAccount;

    public String getDistributionHubId() {
        return DistributionHubId;
    }

    public void setDistributionHubId(String DistributionHubId) {
        this.DistributionHubId = DistributionHubId;
    }

    public String getDistributionHubName() {
        return DistributionHubName;
    }

    public void setDistributionHubName(String DistributionHubName) {
        this.DistributionHubName = DistributionHubName;
    }

    public String getDistributionHubPhone() {
        return DistributionHubPhone;
    }

    public void setDistributionHubPhone(String DistributionHubPhone) {
        this.DistributionHubPhone = DistributionHubPhone;
    }

    public String getDistributionHubAddress() {
        return DistributionHubAddress;
    }

    public void setDistributionHubAddress(String DistributionHubAddress) {
        this.DistributionHubAddress = DistributionHubAddress;
    }

    public String getDistributionHubCity() {
        return DistributionHubCity;
    }

    public void getDistributionHubCity(String DistributionHubCity) {
        this.DistributionHubCity = DistributionHubCity;
    }

    public String getDistributionHubState() {
        return DistributionHubState;
    }

    public void setDistributionHubState(String DistributionHubState) {
        this.DistributionHubState = DistributionHubState;
    }

    public String getDistributionHubZipcode() {
        return DistributionHubZipcode;
    }

    public void setDistributionHubZipcode(String DistributionHubZipcode) {
        this.DistributionHubZipcode = DistributionHubZipcode;
    }

    public String getDistributionHubAdmin() {
        return DistributionHubAdmin;
    }

    public void setDistributionHubAdmin(String DistributionHubAdmin) {
        this.DistributionHubAdmin = DistributionHubAdmin;
    }

    public UserAccount getDistributionHubAccount() {
        return DistributionHubAccount;
    }

    public void setDistributionHubAccount(UserAccount DistributionHubAccount) {
        this.DistributionHubAccount = DistributionHubAccount;
    }

    
    
   @Override
    public String toString(){
        return DistributionHubId;
    }
}
