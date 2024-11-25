/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodRequestor;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author ankitapatil 
 */
public class FoodRequestorDirectory {
    private ArrayList<FoodRequestor> reqAccList;
    
    public FoodRequestorDirectory(){
        reqAccList = new ArrayList();
    }

    public ArrayList<FoodRequestor> getReqAccList() {
        return reqAccList;
    }

    public void setReqAccList(ArrayList<FoodRequestor> reqAccList) {
        this.reqAccList = reqAccList;
    }
    
    public void addReqDir(FoodRequestor ro) {
        reqAccList.add(ro);
    }
    
    public void removeRequestor(FoodRequestor r) {
        this.reqAccList.remove(r);
    }

    public void removeReqByIndex(int index) {
        reqAccList.remove(index);
    }

    public FoodRequestor getRestDetailsByIndex(int index) {
        return reqAccList.get(index);
    }
    
    int reqIdGeneration = 1000;

    public int generateOrderId() {
        reqIdGeneration++;
        return reqIdGeneration;
    }
    public String getreqState(String name){
        for(FoodRequestor r: reqAccList){
            if(r.getReqAccount().getUsername().equals(name)){
                return r.getReqState();
            }
        }
        return null;
    }
}
