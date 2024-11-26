/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DistributionHub;

import java.util.ArrayList;
import Business.DistributionHub.DistributionHubDirectory;

/**
 *
 *@author ankitapatil
 */
public class DistributionHubDirectory {
     ArrayList<DistributionHub> acDistributionHubList;

     public DistributionHubDirectory(){
         acDistributionHubList = new ArrayList<DistributionHub>();
     }
    public ArrayList<DistributionHub> getFadList() {
        return acDistributionHubList;
    }

    public void setFadList(ArrayList<DistributionHub> acDistributionHubIdList) {
        this.acDistributionHubList = acDistributionHubIdList;
    }
    public void addNewACDistributionHub(DistributionHub fac){
        acDistributionHubList.add(fac);
    }
    public void deleteACDistributionHub(DistributionHub selectedfac){
        acDistributionHubList.remove(selectedfac);
    }
    public String getDHname(String FCAname){
        String WHname;
        for(DistributionHub f: acDistributionHubList){
            if(f.getAcDistributionHubAdmin().equals(FCAname)){
                return f.getAcDistributionHubName();
            }
        }
        return null;
    }
}
