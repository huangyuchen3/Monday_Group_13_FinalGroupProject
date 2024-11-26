/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AccessoryRequestor;

import Business.Shop.Shop;
import java.util.ArrayList;

/**
 *
 * @author ankitapatil 
 */
public class AccessoryRequestorDirectory {
    private ArrayList<AccessoryRequestor> reqAccList;
    
    public AccessoryRequestorDirectory(){
        reqAccList = new ArrayList();
    }

    public ArrayList<AccessoryRequestor> getReqAccList() {
        return reqAccList;
    }

    public void setReqAccList(ArrayList<AccessoryRequestor> reqAccList) {
        this.reqAccList = reqAccList;
    }
    
    public void addReqDir(AccessoryRequestor ro) {
        reqAccList.add(ro);
    }
    
    public void removeRequestor(AccessoryRequestor r) {
        this.reqAccList.remove(r);
    }

    public void removeReqByIndex(int index) {
        reqAccList.remove(index);
    }

    public AccessoryRequestor getRestDetailsByIndex(int index) {
        return reqAccList.get(index);
    }
    
    int reqIdGeneration = 1000;

    public int generateOrderId() {
        reqIdGeneration++;
        return reqIdGeneration;
    }
    public String getreqState(String name){
        for(AccessoryRequestor r: reqAccList){
            if(r.getReqAccount().getUsername().equals(name)){
                return r.getReqState();
            }
        }
        return null;
    }
}
