/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DistributionHub;

import Business.UserAccount.UserAccount;

/**
 *
 *@author ankitapatil
 */
public class DistributionHub {
    private String acDistributionHubId;
    private String acDistributionHubName;
    private String acDistributionHubPhone;
    private String acDistributionHubAddress;
    private String acDistributionHubCity;
    private String acDistributionHubState;
    private String acDistributionHubZipcode;
    private String acDistributionHubAdmin;
    private UserAccount acDistributionHubAccount;

    public String getAcDistributionHubId() {
        return acDistributionHubId;
    }

    public void setAcDistributionHubId(String acDistributionHubId) {
        this.acDistributionHubId = acDistributionHubId;
    }

    public String getAcDistributionHubName() {
        return acDistributionHubName;
    }

    public void setAcDistributionHubName(String acDistributionHubName) {
        this.acDistributionHubName = acDistributionHubName;
    }

    public String getAcDistributionHubPhone() {
        return acDistributionHubPhone;
    }

    public void setAcDistributionHubPhone(String acDistributionHubPhone) {
        this.acDistributionHubPhone = acDistributionHubPhone;
    }

    public String getAcDistributionHubAddress() {
        return acDistributionHubAddress;
    }

    public void setAcDistributionHubAddress(String acDistributionHubAddress) {
        this.acDistributionHubAddress = acDistributionHubAddress;
    }

    public String getAcDistributionHubCity() {
        return acDistributionHubCity;
    }

    public void setAcDistributionHubCity(String acDistributionHubCity) {
        this.acDistributionHubCity = acDistributionHubCity;
    }

    public String getAcDistributionHubState() {
        return acDistributionHubState;
    }

    public void setAcDistributionHubState(String acDistributionHubState) {
        this.acDistributionHubState = acDistributionHubState;
    }

    public String getAcDistributionHubZipcode() {
        return acDistributionHubZipcode;
    }

    public void setAcDistributionHubZipcode(String acDistributionHubZipcode) {
        this.acDistributionHubZipcode = acDistributionHubZipcode;
    }

    public String getAcDistributionHubAdmin() {
        return acDistributionHubAdmin;
    }

    public void setAcDistributionHubAdmin(String acDistributionHubAdmin) {
        this.acDistributionHubAdmin = acDistributionHubAdmin;
    }

    public UserAccount getAcDistributionHubAccount() {
        return acDistributionHubAccount;
    }

    public void setAcDistributionHubAccount(UserAccount acDistributionHubAccount) {
        this.acDistributionHubAccount = acDistributionHubAccount;
    }

    
    
   @Override
    public String toString(){
        return acDistributionHubId;
    }
}
