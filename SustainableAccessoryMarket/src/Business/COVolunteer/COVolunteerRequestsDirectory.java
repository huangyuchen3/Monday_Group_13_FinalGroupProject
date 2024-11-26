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
public class COVolunteerRequestsDirectory {
    private ArrayList<COVolunteerRequests> volunteerRequestsList;
    public COVolunteerRequestsDirectory(){
        volunteerRequestsList = new ArrayList();
    }

    public ArrayList<COVolunteerRequests> getVrList() {
        return volunteerRequestsList;
    }

    public void setVrList(ArrayList<COVolunteerRequests> volunteerRequestsList) {
        this.volunteerRequestsList = volunteerRequestsList;
    }
     public void addVR(COVolunteerRequests vr) {
        volunteerRequestsList.add(vr);
    }
}
