/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CommunityOutreach;

import Business.UserAccount.UserAccount;

/**
 *
 *@author ankitapatil
 */
public class CommunityOutreach {
    private String COId;
    private String COName;
    private String COPhone;
    private String COAddress;
    private String COCity;
    private String COState;
    private String COZipcode;
    private String COAgent;
    private UserAccount COAccount;

    public String getCOId() {
        return COId;
    }

    public void setCOId(String COId) {
        this.COId = COId;
    }

    public String getCOName() {
        return COName;
    }

    public void setCOName(String COName) {
        this.COName = COName;
    }

    public String getCOPhone() {
        return COPhone;
    }

    public void setCOPhone(String COPhone) {
        this.COPhone = COPhone;
    }

    public String getCOAddress() {
        return COAddress;
    }

    public void setCOAddress(String COAddress) {
        this.COAddress = COAddress;
    }

    public String getCOCity() {
        return COCity;
    }

    public void setCOCity(String COCity) {
        this.COCity = COCity;
    }

    public String getCOState() {
        return COState;
    }

    public void setCOState(String COState) {
        this.COState = COState;
    }

    public String getCOZipcode() {
        return COZipcode;
    }

    public void setCOZipcode(String COZipcode) {
        this.COZipcode = COZipcode;
    }

    public String getCOAgent() {
        return COAgent;
    }

    public void setCOAgent(String COAgent) {
        this.COAgent = COAgent;
    }

    public UserAccount getCOAccount() {
        return COAccount;
    }

    public void setCOAccount(UserAccount COAccount) {
        this.COAccount = COAccount;
    }

    
    @Override
    public String toString(){
        return COId;
    }
    
}
