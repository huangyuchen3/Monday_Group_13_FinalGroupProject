/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NonGovtOrg;

import java.util.ArrayList;

/**
 *
 *@author ankitapatil
 */
public class NonGovtOrgDirectory {
    private ArrayList<NonGovtOrg> nogList;
    
    public NonGovtOrgDirectory(){
        nogList = new ArrayList();
    }

    public ArrayList<NonGovtOrg> getNgoList() {
        return nogList;
    }

    public void setNgoList(ArrayList<NonGovtOrg> nogList) {
        this.nogList = nogList;
    }
    
    public void addNewNGO(NonGovtOrg ngo){
        nogList.add(ngo);
    }
    
    public void deleteNGO(NonGovtOrg selectedngo){
        nogList.remove(selectedngo);
    }

}
