/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NonGovtOrg;

import Business.UserAccount.UserAccount;

/**
 *
 *@author ankitapatil
 */
public class NonGovtOrg {
    private String nogId;
    private String nogName;
    private String nogPhone;
    private String nogAddress;
    private String nogCity;
    private String nogState;
    private String nogZipcode;
    private String nogAgent;
    private UserAccount nogAccount;

    public String getNgoId() {
        return nogId;
    }

    public void setNgoId(String nogId) {
        this.nogId = nogId;
    }

    public String getNgoName() {
        return nogName;
    }

    public void setNgoName(String nogName) {
        this.nogName = nogName;
    }

    public String getNgoPhno() {
        return nogPhone;
    }

    public void setNgoPhno(String nogPhone) {
        this.nogPhone = nogPhone;
    }

    public String getNgoAddress() {
        return nogAddress;
    }

    public void setNgoAddress(String nogAddress) {
        this.nogAddress = nogAddress;
    }

    public String getNgoCity() {
        return nogCity;
    }

    public void setNgoCity(String nogCity) {
        this.nogCity = nogCity;
    }

    public String getNgoState() {
        return nogState;
    }

    public void setNgoState(String nogState) {
        this.nogState = nogState;
    }

    public String getNgoZipcode() {
        return nogZipcode;
    }

    public void setNgoZipcode(String nogZipcode) {
        this.nogZipcode = nogZipcode;
    }

    public String getNgoAgent() {
        return nogAgent;
    }

    public void setNgoAgent(String nogAgent) {
        this.nogAgent = nogAgent;
    }

    public UserAccount getNgoAccount() {
        return nogAccount;
    }

    public void setNgoAccount(UserAccount nogAccount) {
        this.nogAccount = nogAccount;
    }
    @Override
    public String toString(){
        return nogId;
    }
    
}
