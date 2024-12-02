/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.COVolunteer;

/**
 *
 *@author reetikabhanushali
 */
public class COVolunteerRequests {
    private String volunteerRequestsId;
    private String volunteerRequestsName;
    private int volunteerRequestsNum;
    private String volunteerRequestsDB;
    private String volunteerRequestsStatus;

    public String getVolreqDB() {
        return volunteerRequestsDB;
    }

    public void setVolreqDB(String volunteerRequestsWH) {
        this.volunteerRequestsDB = volunteerRequestsWH;
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

    public int getVolreqNum() {
        return volunteerRequestsNum;
    }

    public void setVolreqNum(int volunteerRequestsNum) {
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
