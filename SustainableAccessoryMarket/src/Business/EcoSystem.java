/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

//import Business.Customer.CustomerDirectory;
//import Business.DeliveryMan.DeliveryManDirectory;
import Business.AccessoryDonation.AccessoryDonationDirectory;
import Business.AccessoryDonor.AccessoryDonorDirectory;
import Business.DropOff.DropOffDirectory;
import Business.DropOff.DropOffItemsDirectory;
import Business.DistributionHub.DistributionHubDirectory;
import Business.CommunityOutreach.CommunityOutreachDirectory;
import Business.COVolunteer.COVolunteerRequestsDirectory;
import Business.COVolunteer.COVolunteerDirectory;
import Business.AccessoryRequestorder.AccessoryRequestorderDirectory;
import Business.AccessoryRequestor.AccessoryRequestorDirectory;
import Business.Role.*;
import Business.Role.DOManagerRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author reetikabhanushali 
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    //private ShopDirectory restaurantDirectory;
    //private CustomerDirectory customerDirectory;
    //private DeliveryManDirectory deliveryManDirectory;

    private AccessoryRequestorDirectory requestorDir;
    private AccessoryDonorDirectory donorDir;
    private DistributionHubDirectory acDistributionHubDir;//warehouse
    private CommunityOutreachDirectory coDir;
    private DropOffDirectory acDropOffDir;//fcPantryDir
    private UserAccountDirectory uaDir;
    private DropOffItemsDirectory acDropOffItemsDir;
    private COVolunteerDirectory volunteerDir;
    private AccessoryDonationDirectory donationDir;
    private AccessoryRequestorderDirectory requestorOrderDir;
    private COVolunteerRequestsDirectory volunteerRequestsDir;
    private Integer donationCounttId;
    private Integer requestorCountID;
    private Integer distributionHubCnt;
    private Integer DropOffCnt;
    private Integer coCnt;
    private Integer volunteersCnt;
    private Integer donorsCnt;
    private Integer requestorsCnt;
    private Integer organisationsCnt;
    private Integer shopCnt;
    private Integer donationCnt;
    private Integer requestCnt;
    private DropOffDirectory dropOffDirectory;
    private UserAccountDirectory userAccountDirectory;

    public Integer getshopCnt() {
        return shopCnt;
    }

    public void setRestaurentCnt(Integer shopCnt) {
        this.shopCnt = shopCnt;
    }

    public Integer getdistributionHubCnt() {
        return distributionHubCnt;
    }

    public void setdistributionHubCnt(Integer distributionHubCnt) {
        this.distributionHubCnt = distributionHubCnt;
    }

    public Integer getDropOffCnt() {
        return DropOffCnt;
    }

    public void setDropOffCnt(Integer DropOffCnt) {
        this.DropOffCnt = DropOffCnt;
    }

    public Integer getcoCnt() {
        return coCnt;
    }

    public void setcoCnt(Integer coCnt) {
        this.coCnt = coCnt;
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

    public EcoSystem(AccessoryRequestorDirectory requestorDir, AccessoryDonorDirectory donorDir, DistributionHubDirectory acDistributionHubDir, CommunityOutreachDirectory coDir, COVolunteerDirectory volunteerDir,
            DropOffDirectory acDropOffDir, DropOffItemsDirectory acDropOffItemsDir, AccessoryDonationDirectory donationDir, AccessoryRequestorderDirectory requestorOrderDir,
            COVolunteerRequestsDirectory volunteerRequestsDir) { // to add ngo directory

        this.requestorDir = requestorDir;
        this.donorDir = donorDir;
        this.acDistributionHubDir = acDistributionHubDir;
        this.coDir = coDir;
        this.volunteerDir = volunteerDir;

        this.acDropOffDir = acDropOffDir;
        // this.uaDir = uaDir;
        this.acDropOffItemsDir = acDropOffItemsDir;
        this.donationDir = donationDir;
        this.requestorOrderDir = requestorOrderDir;
        this.volunteerRequestsDir = volunteerRequestsDir;

    }

    public COVolunteerDirectory getVolDir() {
        return volunteerDir;
    }

    public void setVolDir(COVolunteerDirectory volunteerDir) {
        this.volunteerDir = volunteerDir;
    }

    public CommunityOutreachDirectory getcoDir() {
        return coDir;
    }

    public void setNgoDir(CommunityOutreachDirectory nogDir) {
        this.coDir = nogDir;
    }

    public AccessoryRequestorDirectory getReqDir() {
        return requestorDir;
    }

    public void setReqDir(AccessoryRequestorDirectory requestorDir) {
        this.requestorDir = requestorDir;
    }

    public AccessoryDonorDirectory getDonDir() {
        return donorDir;
    }

    public void setDonDir(AccessoryDonorDirectory donorDir) {
        this.donorDir = donorDir;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        roleList.add(new PersonalRequestorRole());
        roleList.add(new PersonalDonorRole());
        roleList.add(new COManagerRole());
        roleList.add(new DHManagerRole());
        roleList.add(new DOManagerRole());
        roleList.add(new Volunteer());
        return roleList;
    }

    private EcoSystem() {
        super("Sustainable Accessory Market");
        //this.requestorDir = new AccessoryRequestorDirectory();
        this.donorDir = new AccessoryDonorDirectory();
        //this.acDistributionHubDir = new DistributionHubDirectory();
        //this.coDir = new CommunityOutreachDirectory(userAccountDirectory);
        this.uaDir = new UserAccountDirectory(); // Initialize UserAccountDirectory
        this.acDropOffItemsDir = new DropOffItemsDirectory();
        this.volunteerDir = new COVolunteerDirectory();
        this.donationDir = new AccessoryDonationDirectory();
        this.volunteerRequestsDir = new COVolunteerRequestsDirectory();
        this.donationCounttId = 1;
        this.requestorCountID = 1;

        // Initialize DropOffDirectory with UserAccountDirectory
        this.dropOffDirectory = new DropOffDirectory(this.uaDir);
        this.coDir = new CommunityOutreachDirectory(this.uaDir);
        this.acDistributionHubDir = new DistributionHubDirectory(this.uaDir);
        this.requestorDir = new AccessoryRequestorDirectory(this.uaDir);
        
        
        this.donorsCnt = 0;
        this.distributionHubCnt = 0; 
        this.requestorsCnt = 0;
        this.volunteersCnt = 0;
    }
    
    private void addDefaultUserAccounts() {
        // Prevent duplicate initialization
        if (!uaDir.getUserAccountList().isEmpty()) {
            return; // Skip if accounts already exist
        }
        // Add default accounts here
        uaDir.createUserAccount("admin", "admin123", null, new SystemAdminRole());
        uaDir.createUserAccount("dhmanager1", "@Password123", null, new DHManagerRole());}


    
    public DropOffDirectory getDropOffDirectory() {
        return dropOffDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return this.uaDir;
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

    public DistributionHubDirectory getACDDirectory() {
        return acDistributionHubDir;
    }

    public void setACDDirectory(DistributionHubDirectory acd) {
        this.acDistributionHubDir = acd;
    }

    public DropOffDirectory getACDOFDirectory() {
        return acDropOffDir;
    }

    public void setACDODirectory(DropOffDirectory dod) {
        this.acDropOffDir = dod;
    }

    public void setUserAccountDirectory(UserAccountDirectory uad) {
        this.uaDir = uad;
    }

    public DropOffItemsDirectory getACDOIDirectory() { //ACDOI
        return acDropOffItemsDir;
    }

    public void setACDOIDirectory(DropOffItemsDirectory acdoid) {
        this.acDropOffItemsDir = acdoid;
    }

    public AccessoryDonationDirectory getDonatDirectory() {
        return donationDir;
    }

    public void setDonatDirectory(AccessoryDonationDirectory donationDir) {
        this.donationDir = donationDir;
    }

    public AccessoryRequestorderDirectory getReqorderDirectory() {
        return requestorOrderDir;
    }

    public void setReqorderDirectory(AccessoryRequestorderDirectory requestorOrderDir) {
        this.requestorOrderDir = requestorOrderDir;
    }

    public COVolunteerRequestsDirectory getVRDirectory() {
        return volunteerRequestsDir;
    }

    public void setVRDirectory(COVolunteerRequestsDirectory volunteerRequestsDir) {
        this.volunteerRequestsDir = volunteerRequestsDir;
    }
    
    
}
