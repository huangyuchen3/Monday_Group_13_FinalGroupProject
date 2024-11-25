/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NonGovtOrgVolunteer;

import java.util.ArrayList;

/**
 *
 *@author ankitapatil
 */
public class NGOVolunteerDirectory {

    
    private ArrayList<NGOVolunteer> volList;
    
    public NGOVolunteerDirectory(){
        volList = new ArrayList();
    }
    
    public ArrayList<NGOVolunteer> getVolunteerList() {
        return volList;
    }

    public void setVolunteerList(ArrayList<NGOVolunteer> volList) {
        this.volList = volList;
    }
    
    public void addNewVolunteer(NGOVolunteer vol){
        volList.add(vol);
    }
    
    public void deleteVolunteer(NGOVolunteer selectedvol){
        volList.remove(selectedvol);
    }
}
