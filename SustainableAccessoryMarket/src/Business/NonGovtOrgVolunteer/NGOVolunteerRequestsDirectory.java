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
public class NGOVolunteerRequestsDirectory {
    private ArrayList<NGOVolunteerRequests> volunteerRequestsList;
    public NGOVolunteerRequestsDirectory(){
        volunteerRequestsList = new ArrayList();
    }

    public ArrayList<NGOVolunteerRequests> getVrList() {
        return volunteerRequestsList;
    }

    public void setVrList(ArrayList<NGOVolunteerRequests> volunteerRequestsList) {
        this.volunteerRequestsList = volunteerRequestsList;
    }
     public void addVR(NGOVolunteerRequests vr) {
        volunteerRequestsList.add(vr);
    }
}
