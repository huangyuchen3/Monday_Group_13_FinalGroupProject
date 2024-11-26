/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DropOff;

/**
 *
 *@author ankitapatil
 */
public class DropOffItems {
    private String DropOffItemId;

    public void setDropOffItemId(String DropOffItemId) {
        this.DropOffItemId = DropOffItemId;
    }
    private String DropOffHubName;
    private String DropOffName;
    private String DropOffManager;
    private String AccessoryItems;
    private String AccessoryQuantity;

    public String getDropOffHubName() {
        return DropOffHubName;
    }

    public void setDropOffHubName(String DropOffHubName) {
        this.DropOffHubName = DropOffHubName;
    }

    public String getDropOffName() {
        return DropOffName;
    }

    public void setDropOffName(String DropOffName) {
        this.DropOffName = DropOffName;
    }

    public String getDropOffManager() {
        return DropOffManager;
    }

    public void setDropOffManager(String DropOffManager) {
        this.DropOffManager = DropOffManager;
    }

    public String getAccessoryItems() {
        return AccessoryItems;
    }

    public void setAccessoryItems(String AccessoryItems) {
        this.AccessoryItems = AccessoryItems;
    }

    public String getAccessoryQuantity() {
        return AccessoryQuantity;
    }

    public void setAccessoryQuantity(String AccessoryQuantity) {
        this.AccessoryQuantity = AccessoryQuantity;
    }

    public String getDropOffItemId() {
        return DropOffItemId;
    }

 
    @Override
    public String toString(){
        return DropOffItemId;
    }
}
