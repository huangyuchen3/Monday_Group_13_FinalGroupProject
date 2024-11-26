/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import userinterface.ACPManagerRole.ACPManagerWorkAreaPanel;

/**
 *
 *@author ankitapatil
 */
public class ACPManagerRole extends Role{
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, JPanel jp, JSplitPane jsp) {
        return new ACPManagerWorkAreaPanel(userProcessContainer, business,account,jp,jsp);
    }
}
