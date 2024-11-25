/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodPantry;

/**
 *
 *@author ankitapatil
 */
public class FoodPantryItems {
    private String fcPantryItemId;
    private String fcPantryWarehouseName;
    private String pantryName;
    private String pantryManager;
    private String foodItems;
    private String foodQuantity;

    public String getFcpitemid() {
        return fcPantryItemId;
    }

    public void setFcpitemid(String fcPantryItemId) {
        this.fcPantryItemId = fcPantryItemId;
    }

    public String getFcpWHname() {
        return fcPantryWarehouseName;
    }

    public void setFcpWHname(String fcPantryWarehouseName) {
        this.fcPantryWarehouseName = fcPantryWarehouseName;
    }

    public String getPantryName() {
        return pantryName;
    }

    public void setPantryName(String pantryName) {
        this.pantryName = pantryName;
    }

    public String getPantryManager() {
        return pantryManager;
    }

    public void setPantryManager(String pantryManager) {
        this.pantryManager = pantryManager;
    }

    public String getFoodItem() {
        return foodItems;
    }

    public void setFoodItem(String foodItems) {
        this.foodItems = foodItems;
    }

    public String getFoodQuan() {
        return foodQuantity;
    }

    public void setFoodQuan(String foodQuantity) {
        this.foodQuantity = foodQuantity;
    }
    @Override
    public String toString(){
        return fcPantryItemId;
    }
}
