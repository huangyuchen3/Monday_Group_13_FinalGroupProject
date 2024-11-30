/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AccessoryRequestor;

//import Business.Shop.Shop;
import Business.Role.PartnerRequesterRole;
import Business.Role.PersonalRequestorRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Worker.Worker;
import java.util.ArrayList;

/**
 *
 * @author reetikabhanushali 
 */
public class AccessoryRequestorDirectory {
    private ArrayList<AccessoryRequestor> reqAccList;
    private UserAccountDirectory userAccountDirectory;
    
    public AccessoryRequestorDirectory(UserAccountDirectory userAccountDirectory){
        //reqAccList = new ArrayList();
        this.userAccountDirectory = userAccountDirectory;
        this.reqAccList = new ArrayList<>();
        initializeDefaultAccessoryRequestors(userAccountDirectory);
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
    
    
    public void initializeDefaultAccessoryRequestors(UserAccountDirectory userAccountDirectory) {
        // Create Worker and UserAccount for Requestor 1
        Worker reqWorker1 = new Worker();
        reqWorker1.setName("Personal Requestor One");

        UserAccount account1 = userAccountDirectory.createUserAccount(
            "personalreqone",
            "@Password123",
            reqWorker1,
            new PersonalRequestorRole()
        );

        // Create Accessory Requestor 1
        AccessoryRequestor requestor1 = new AccessoryRequestor(account1);
        requestor1.setReqId("REQ1");
        requestor1.setReqName("Personal Requestor One");
        requestor1.setReqType("Personal");
        requestor1.setReqQuan("50");
        requestor1.setReqPhno("1234567890");
        requestor1.setReqAddres("456 Oak Street");
        requestor1.setReqCity("Boston");
        requestor1.setReqState("MA");
        requestor1.setReqZipcode("02116");
        requestor1.setReqEmail("reqone@example.com");

        // Add the first Accessory Requestor to the list
        this.reqAccList.add(requestor1);
        
        
        

        // Create Worker and UserAccount for Requestor 2
        Worker reqWorker2 = new Worker();
        reqWorker2.setName("Partner Requestor Two");

        UserAccount account2 = userAccountDirectory.createUserAccount(
            "partnerreqtwo",
            "@Password123",
            reqWorker2,
            new PartnerRequesterRole()
        );

        // Create Accessory Requestor 2
        AccessoryRequestor requestor2 = new AccessoryRequestor(account2);
        requestor2.setReqId("REQ2");
        requestor2.setReqName("Partner Requestor Two");
        requestor2.setReqType("Partner");
        requestor2.setReqQuan("200");
        requestor2.setReqPhno("9876543210");
        requestor2.setReqAddres("789 Maple Street");
        requestor2.setReqCity("Cambridge");
        requestor2.setReqState("MA");
        requestor2.setReqZipcode("02139");
        requestor2.setReqEmail("reqtwo@example.com");

        // Add the second Accessory Requestor to the list
        this.reqAccList.add(requestor2);

        // Debug messages to confirm initialization
        System.out.println("Default Accessory Requestors initialized.");
        for (AccessoryRequestor requestor : this.reqAccList) {
            System.out.println("ID: " + requestor.getReqId() + ", Name: " + requestor.getReqName());
        }
    }
}
