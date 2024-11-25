/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodRequestorder;

import java.util.ArrayList;

/**
 *
 * @author ankitapatil 
 */
public class FoodRequestorderDirectory {
    private ArrayList<FoodRequestorder> requestorOrderList;
    
    public FoodRequestorderDirectory(){
        requestorOrderList = new ArrayList();
    }

    public ArrayList<FoodRequestorder> getReqOrderList() {
        return requestorOrderList;
    }

    public void setReqOrderList(ArrayList<FoodRequestorder> requestorOrderList) {
        this.requestorOrderList = requestorOrderList;
    }
     public void addNewReqorder(FoodRequestorder rq){
        requestorOrderList.add(rq);
    }
    public void deleteReqorder(FoodRequestorder selectedD){
        requestorOrderList.remove(selectedD);
    }
}
