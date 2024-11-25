/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.FoodDonation.FoodDonationDirectory;
import Business.FoodDonor.FoodDonorDirectory;
import Business.FoodPantry.FoodPantryDirectory;
import Business.FoodPantry.FoodPantryItemsDirectory;
import Business.FoodWarehouse.FoodWarehouse;
import Business.FoodWarehouse.FoodWarehouseDirectory;
import Business.NonGovtOrg.NonGovtOrgDirectory;
import Business.NonGovtOrgVolunteer.NGOVolunteerRequestsDirectory;
import Business.NonGovtOrgVolunteer.NGOVolunteerDirectory;
import Business.FoodRequestorder.FoodRequestorderDirectory;
import Business.FoodRequestor.FoodRequestorDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.DeliveryVolunteer;
import Business.Role.DonorRole;
import Business.Role.FCAdminRole;
import Business.Role.FCPManagerRole;
import Business.Role.NgoRole;
import Business.Role.RequestorRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author ankitapatil 
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    //private RestaurantDirectory restaurantDirectory;
    //private CustomerDirectory customerDirectory;
    //private DeliveryManDirectory deliveryManDirectory;

    private FoodRequestorDirectory requestorDir;
    private FoodDonorDirectory donorDir;
    private FoodWarehouseDirectory fcWarehouseDir;
    private NonGovtOrgDirectory nogDir;
    private FoodPantryDirectory fcPantryDir;
    private UserAccountDirectory uaDir;
    private FoodPantryItemsDirectory fcPantryItemsDir;
    private NGOVolunteerDirectory volunteerDir;
    private FoodDonationDirectory donationDir;
    private FoodRequestorderDirectory requestorOrderDir;
    private NGOVolunteerRequestsDirectory volunteerRequestsDir;
    private Integer donationCounttId;
    private Integer requestorCountID;
    private Integer warehouseCnt;
    private Integer pantryCnt;
    private Integer ngoCnt;
    private Integer volunteersCnt;
    private Integer donorsCnt;
    private Integer requestorsCnt;
    private Integer organisationsCnt;
    private Integer restaurentCnt;
    private Integer donationCnt;
    private Integer requestCnt;

    public Integer getRestaurentCnt() {
        return restaurentCnt;
    }

    public void setRestaurentCnt(Integer restaurentCnt) {
        this.restaurentCnt = restaurentCnt;
    }

    public Integer getWarehouseCnt() {
        return warehouseCnt;
    }

    public void setWarehouseCnt(Integer warehouseCnt) {
        this.warehouseCnt = warehouseCnt;
    }

    public Integer getPantryCnt() {
        return pantryCnt;
    }

    public void setPantryCnt(Integer pantryCnt) {
        this.pantryCnt = pantryCnt;
    }

    public Integer getNgoCnt() {
        return ngoCnt;
    }

    public void setNgoCnt(Integer ngoCnt) {
        this.ngoCnt = ngoCnt;
    }

    public Integer getVolunteersCnt() {
        return volunteersCnt;
    }

    public void setVolunteersCnt(Integer volunteersCnt) {
        this.volunteersCnt = volunteersCnt;
    }

    public Integer getDonorsCnt() {
        return donorsCnt;
    }

    public void setDonorsCnt(Integer donorsCnt) {
        this.donorsCnt = donorsCnt;
    }

    public Integer getRequestorsCnt() {
        return requestorsCnt;
    }

    public void setRequestorsCnt(Integer requestorsCnt) {
        this.requestorsCnt = requestorsCnt;
    }

    public Integer getOrganisationsCnt() {
        return organisationsCnt;
    }

    public void setOrganisationsCnt(Integer organisationsCnt) {
        this.organisationsCnt = organisationsCnt;
    }

    public Integer getDonationCnt() {
        return donationCnt;
    }

    public void setDonationCnt(Integer donationCnt) {
        this.donationCnt = donationCnt;
    }

    public Integer getRequestCnt() {
        return requestCnt;
    }

    public void setRequestCnt(Integer requestCnt) {
        this.requestCnt = requestCnt;
    }

    public Integer getReqCntID() {
        return requestorCountID;
    }

    public void setReqCntID(Integer requestorCountID) {
        this.requestorCountID = requestorCountID + 1;
    }

    public Integer getDonationCntId() {
        return donationCounttId;
    }

    public void setDonationCntId(Integer donationCounttId) {
        this.donationCounttId = donationCounttId + 1;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public EcoSystem(FoodRequestorDirectory requestorDir, FoodDonorDirectory donorDir, FoodWarehouseDirectory fcWarehouseDir, NonGovtOrgDirectory nogDir, NGOVolunteerDirectory volunteerDir,
            FoodPantryDirectory fcPantryDir, FoodPantryItemsDirectory fcPantryItemsDir, FoodDonationDirectory donationDir, FoodRequestorderDirectory requestorOrderDir,
            NGOVolunteerRequestsDirectory volunteerRequestsDir) { // to add ngo directory

        this.requestorDir = requestorDir;
        this.donorDir = donorDir;
        this.fcWarehouseDir = fcWarehouseDir;
        this.nogDir = nogDir;
        this.volunteerDir = volunteerDir;

        this.fcPantryDir = fcPantryDir;
        // this.uaDir = uaDir;
        this.fcPantryItemsDir = fcPantryItemsDir;
        this.donationDir = donationDir;
        this.requestorOrderDir = requestorOrderDir;
        this.volunteerRequestsDir = volunteerRequestsDir;

    }

    public NGOVolunteerDirectory getVolDir() {
        return volunteerDir;
    }

    public void setVolDir(NGOVolunteerDirectory volunteerDir) {
        this.volunteerDir = volunteerDir;
    }

    public NonGovtOrgDirectory getNgoDir() {
        return nogDir;
    }

    public void setNgoDir(NonGovtOrgDirectory nogDir) {
        this.nogDir = nogDir;
    }

    public FoodRequestorDirectory getReqDir() {
        return requestorDir;
    }

    public void setReqDir(FoodRequestorDirectory requestorDir) {
        this.requestorDir = requestorDir;
    }

    public FoodDonorDirectory getDonDir() {
        return donorDir;
    }

    public void setDonDir(FoodDonorDirectory donorDir) {
        this.donorDir = donorDir;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            System.out.println(4);
            business = new EcoSystem();
        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        roleList.add(new RequestorRole());
        roleList.add(new DonorRole());
        roleList.add(new NgoRole());
        roleList.add(new FCAdminRole());
        roleList.add(new FCPManagerRole());
        roleList.add(new DeliveryVolunteer());
        return roleList;
    }

    private EcoSystem() {
        super("nourished.bridge");
        this.requestorDir = new FoodRequestorDirectory();
        this.donorDir = new FoodDonorDirectory();
        this.fcWarehouseDir = new FoodWarehouseDirectory();
        this.nogDir = new NonGovtOrgDirectory();
        this.fcPantryDir = new FoodPantryDirectory();
        this.uaDir = new UserAccountDirectory();
        this.fcPantryItemsDir = new FoodPantryItemsDirectory();
        this.volunteerDir = new NGOVolunteerDirectory();
        this.donationDir = new FoodDonationDirectory();
        this.volunteerRequestsDir = new NGOVolunteerRequestsDirectory();
        this.donationCounttId = 1;
        this.requestorCountID = 1;
      
        
        this.warehouseCnt = 0;
        this.pantryCnt = 0;
        this.ngoCnt = 0;
        this.volunteersCnt = 0;
        this.donorsCnt = 0;
        this.requestorsCnt = 0;
        this.organisationsCnt = 0;
        this.restaurentCnt = 0;
        this.donationCnt = 0;
        this.requestCnt = 0;
        System.out.println(this.donationCounttId + "sati");
        // networkList=new ArrayList<Network>();
    }

    public boolean checkIfUserIsUnique(String userName) {
        UserAccountDirectory usersList = business.getUserAccountDirectory();
        ArrayList<UserAccount> userAccounts = usersList.getUserAccountList();

        for (UserAccount ua : userAccounts) {
            if (ua.getUsername().equals(userName)) {
                return false;
            }
        }

        return true;
    }

    public FoodWarehouseDirectory getFCWDirectory() {
        return fcWarehouseDir;
    }

    public void setFCWDirectory(FoodWarehouseDirectory fcd) {
        this.fcWarehouseDir = fcd;
    }

    public FoodPantryDirectory getFCPDirectory() {
        return fcPantryDir;
    }

    public void setFCPDirectory(FoodPantryDirectory fcp) {
        this.fcPantryDir = fcp;
    }

    public void setUserAccountDirectory(UserAccountDirectory uad) {
        this.uaDir = uad;
    }

    public FoodPantryItemsDirectory getFCPIDirectory() {
        return fcPantryItemsDir;
    }

    public void setFCPIDirectory(FoodPantryItemsDirectory fcpid) {
        this.fcPantryItemsDir = fcpid;
    }

    public FoodDonationDirectory getDonatDirectory() {
        return donationDir;
    }

    public void setDonatDirectory(FoodDonationDirectory donationDir) {
        this.donationDir = donationDir;
    }

    public FoodRequestorderDirectory getReqorderDirectory() {
        return requestorOrderDir;
    }

    public void setReqorderDirectory(FoodRequestorderDirectory requestorOrderDir) {
        this.requestorOrderDir = requestorOrderDir;
    }

    public NGOVolunteerRequestsDirectory getVRDirectory() {
        return volunteerRequestsDir;
    }

    public void setVRDirectory(NGOVolunteerRequestsDirectory volunteerRequestsDir) {
        this.volunteerRequestsDir = volunteerRequestsDir;
    }
}
