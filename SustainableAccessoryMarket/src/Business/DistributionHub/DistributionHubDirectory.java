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
     ArrayList<DistributionHub> DistributionHubList;

     public DistributionHubDirectory(){
         DistributionHubList = new ArrayList<DistributionHub>();
     }
    public ArrayList<DistributionHub> getFadList() {
        return DistributionHubList;
    }

    public void setFadList(ArrayList<DistributionHub> DistributionHubIdList) {
        this.DistributionHubList = DistributionHubIdList;
    }
    public void addNewDistributionHub(DistributionHub fac){
        DistributionHubList.add(fac);
    }
    public void deleteDistributionHub(DistributionHub selectedfac){
        DistributionHubList.remove(selectedfac);
    }
    public String getDHname(String FCAname){
        String WHname;
        for(DistributionHub f: DistributionHubList){
            if(f.getDistributionHubAdmin().equals(FCAname)){
                return f.getDistributionHubName();
            }
        }
        return null;
    }
}
