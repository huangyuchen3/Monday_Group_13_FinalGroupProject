/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Worker.Worker;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author reetikabhanushali 
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Worker employee;
    private Role role;
    private WorkQueue workQ;

    public UserAccount() {
        workQ = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Worker employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Worker getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQ;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}