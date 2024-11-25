/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author ankitapatil 
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workReqList;

    public WorkQueue() {
        workReqList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workReqList;
    }
}