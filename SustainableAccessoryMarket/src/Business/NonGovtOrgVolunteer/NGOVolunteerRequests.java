/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NonGovtOrgVolunteer;

/**
 *
 *@author ankitapatil
 */
public class NGOVolunteerRequests {
    private String volunteerRequestsId;
    private String volunteerRequestsName;
    private String volunteerRequestsNum;
    private String volunteerRequestsWH;
    private String volunteerRequestsStatus;

    public String getVolreqWH() {
        return volunteerRequestsWH;
    }

    public void setVolreqWH(String volunteerRequestsWH) {
        this.volunteerRequestsWH = volunteerRequestsWH;
    }

    public String getVolreqId() {
        return volunteerRequestsId;
    }

    public void setVolreqId(String volunteerRequestsId) {
        this.volunteerRequestsId = volunteerRequestsId;
    }

    public String getVolreqName() {
        return volunteerRequestsName;
    }

    public void setVolreqName(String volunteerRequestsName) {
        this.volunteerRequestsName = volunteerRequestsName;
    }

    public String getVolreqNum() {
        return volunteerRequestsNum;
    }

    public void setVolreqNum(String volunteerRequestsNum) {
        this.volunteerRequestsNum = volunteerRequestsNum;
    }

    public String getVolreqStatus() {
        return volunteerRequestsStatus;
    }

    public void setVolreqStatus(String volunteerRequestsStatus) {
        this.volunteerRequestsStatus = volunteerRequestsStatus;
    }
    @Override
    public String toString(){
        return volunteerRequestsId;
    }
}
