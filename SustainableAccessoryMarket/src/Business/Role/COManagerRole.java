/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import ui.COManagerRole.COWorkAreaPanel;


/**
 *
 * @author reetikabhanushali 
 */
public class COManagerRole extends Role{

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, JPanel jp, JSplitPane jsp) {
        return new COWorkAreaPanel(userProcessContainer, business, account,jp,jsp);
    }
}
