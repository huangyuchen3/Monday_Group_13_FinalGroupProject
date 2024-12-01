/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.COVolunteer;

import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 *@author reetikabhanushali
 */
public class COVolunteerDirectory {

    
    private ArrayList<COVolunteer> volList;
    private UserAccountDirectory userAccountDirectory;
    
    public COVolunteerDirectory(UserAccountDirectory userAccountDirectory){
        //volList = new ArrayList();
        
        this.userAccountDirectory = userAccountDirectory;
        this.volList = new ArrayList<>();
        initializeDefaultVolunteers(userAccountDirectory);
    }
    
    public ArrayList<COVolunteer> getVolunteerList() {
        return volList;
    }

    public void setVolunteerList(ArrayList<COVolunteer> volList) {
        this.volList = volList;
    }
    
    public void addNewVolunteer(COVolunteer vol){
        volList.add(vol);
    }
    
    public void deleteVolunteer(COVolunteer selectedvol){
        volList.remove(selectedvol);
    }
    
    
    public void initializeDefaultVolunteers(UserAccountDirectory userAccountDirectory) {
        COVolunteer volunteer1 = new COVolunteer();
        volunteer1.setVolId("V1");
        volunteer1.setVolName("Volunteer One");
        volunteer1.setVolAge("25");
        volunteer1.setVolPhno("1234567890");
        volunteer1.setVolAddress("123 Main St");
        volunteer1.setVolCity("Boston");
        volunteer1.setVolState("MA");
        volunteer1.setVolZipcode("02116");
        volunteer1.setVolExp("2");
        volunteer1.setManagerUsername("comanager1"); // Assign to comanager1

        COVolunteer volunteer2 = new COVolunteer();
        volunteer2.setVolId("V2");
        volunteer2.setVolName("Volunteer Two");
        volunteer2.setVolAge("30");
        volunteer2.setVolPhno("9876543210");
        volunteer2.setVolAddress("456 Elm St");
        volunteer2.setVolCity("Cambridge");
        volunteer2.setVolState("MA");
        volunteer2.setVolZipcode("02140");
        volunteer2.setVolExp("5");
        volunteer2.setManagerUsername("comanager1"); // Assign to comanager1

        this.volList.add(volunteer1);
        this.volList.add(volunteer2);
    }
}
