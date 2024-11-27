/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 *@author reetikabhanushali
 */
public abstract class Role {
          
    public enum RoleType{
        
        COManager("COManager"),
        DHManager("DHManager"),
        DOManager("DOManager"),
        PartnerDonor("PartnerDonor"),
        PartnerRequester("PartnerRequester"),
        PersonalDonor("PersonalDonor"),
        PersonalRequester("PersonalRequester"),
        SystemAdmin("SystemAdmin"),
        Volunteer("Volunteer");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business,
            JPanel jp,
            JSplitPane jsp);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}