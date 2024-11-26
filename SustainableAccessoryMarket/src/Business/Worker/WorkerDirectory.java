/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Worker;

import java.util.ArrayList;

/**
 *
 * @author ankitapatil
 */
public class WorkerDirectory {

    private ArrayList<Worker> empList;

    public WorkerDirectory() {
        empList = new ArrayList();
    }

    public ArrayList<Worker> getEmployeeList() {
        return empList;
    }

    public Worker createEmployee(String name) {
        Worker employee = new Worker();
        employee.setName(name);
        empList.add(employee);
        return employee;
    }
}
