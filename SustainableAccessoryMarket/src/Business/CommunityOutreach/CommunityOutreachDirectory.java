/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CommunityOutreach;

import java.util.ArrayList;

/**
 *
 *@author reetikabhanushali
 */
public class CommunityOutreachDirectory {
    private ArrayList<CommunityOutreach> COList;
    
    public CommunityOutreachDirectory(){
        COList = new ArrayList();
    }

    public ArrayList<CommunityOutreach> getNgoList() {
        return COList;
    }

    public void setNgoList(ArrayList<CommunityOutreach> nogList) {
        this.COList = nogList;
    }
    
    public void addNewNGO(CommunityOutreach ngo){
        COList.add(ngo);
    }
    
    public void deleteNGO(CommunityOutreach selectedngo){
        COList.remove(selectedngo);
    }

}
