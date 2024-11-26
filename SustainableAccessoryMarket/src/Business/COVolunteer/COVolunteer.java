/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.COVolunteer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 *@author ankitapatil
 */
public class COVolunteer {
    private String volunteerId;
    private String volunteerName;
    private String volunteerAge;
    private String volunteerPhone;
    private String volunteerAddress;
    private String volunteerCity;
    private String volunteerState;
    private String volunteerZipcode;
    private String volunteerExp;
    private String volunteerAvail;
    private String volunteerCO;

    public String getVolCO() {
        return volunteerCO;
    }

    public void setVolCO(String volunteerNGO) {
        this.volunteerCO = volunteerNGO;
    }
    

    public String getVolAvail() {
        return volunteerAvail;
    }

    public void setVolAvail(String volunteerAvail) {
        this.volunteerAvail = volunteerAvail;
    }
    //private ArrayList<String> volAvaildays;
    private UserAccount volAccount;
    private String volUserName;
    private String volPwd;

    public String getVolId() {
        return volunteerId;
    }

    public void setVolId(String volunteerId) {
        this.volunteerId = volunteerId;
    }

    public String getVolName() {
        return volunteerName;
    }

    public void setVolName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public String getVolAge() {
        return volunteerAge;
    }

    public void setVolAge(String volunteerAge) {
        this.volunteerAge = volunteerAge;
    }

    public String getVolPhno() {
        return volunteerPhone;
    }

    public void setVolPhno(String volunteerPhone) {
        this.volunteerPhone = volunteerPhone;
    }

    public String getVolAddress() {
        return volunteerAddress;
    }

    public void setVolAddress(String volunteerAddress) {
        this.volunteerAddress = volunteerAddress;
    }

    public String getVolCity() {
        return volunteerCity;
    }

    public void setVolCity(String volunteerCity) {
        this.volunteerCity = volunteerCity;
    }

    public String getVolZipcode() {
        return volunteerZipcode;
    }

    public void setVolZipcode(String volunteerZipcode) {
        this.volunteerZipcode = volunteerZipcode;
    }

    public String getVolExp() {
        return volunteerExp;
    }

    public void setVolExp(String volunteerExp) {
        this.volunteerExp = volunteerExp;
    }

//    public ArrayList<String> getVolAvaildays() {
//        return volAvaildays;
//    }
//
//    public void setVolAvaildays(ArrayList<String> volAvaildays) {
//        this.volAvaildays = volAvaildays;
//    }
    
    
    public UserAccount getVolAccount() {
        return volAccount;
    }

    public void setVolAccount(UserAccount volAccount) {
        this.volAccount = volAccount;
    }

    public String getVolUserName() {
        return volUserName;
    }

    public void setVolUserName(String volUserName) {
        this.volUserName = volUserName;
    }

    public String getVolPwd() {
        return volPwd;
    }

    public void setVolPwd(String volPwd) {
        this.volPwd = volPwd;
    }
    
    
    public String getVolState() {
        return volunteerState;
    }

    public void setVolState(String volunteerState) {
        this.volunteerState = volunteerState;
    }
    
    @Override
    public String toString(){
        return volunteerId;
    }
    
    
}
