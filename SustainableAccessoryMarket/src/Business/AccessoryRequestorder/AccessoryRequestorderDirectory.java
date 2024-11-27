/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AccessoryRequestorder;

import java.util.ArrayList;

/**
 *
 * @author reetikabhanushali 
 */
public class AccessoryRequestorderDirectory {
    private ArrayList<AccessoryRequestorder> requestorOrderList;
    
    public AccessoryRequestorderDirectory(){
        requestorOrderList = new ArrayList();
    }

    public ArrayList<AccessoryRequestorder> getReqOrderList() {
        return requestorOrderList;
    }

    public void setReqOrderList(ArrayList<AccessoryRequestorder> requestorOrderList) {
        this.requestorOrderList = requestorOrderList;
    }
     public void addNewReqorder(AccessoryRequestorder rq){
        requestorOrderList.add(rq);
    }
    public void deleteReqorder(AccessoryRequestorder selectedD){
        requestorOrderList.remove(selectedD);
    }
}
