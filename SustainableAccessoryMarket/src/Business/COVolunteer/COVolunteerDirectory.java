/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.COVolunteer;

import java.util.ArrayList;

/**
 *
 *@author ankitapatil
 */
public class COVolunteerDirectory {

    
    private ArrayList<COVolunteer> volList;
    
    public COVolunteerDirectory(){
        volList = new ArrayList();
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
}
