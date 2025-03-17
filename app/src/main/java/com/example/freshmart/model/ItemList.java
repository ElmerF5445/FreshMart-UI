package com.example.freshmart.model;

public class ItemList {
    private String itemName;
    private double mPrice;
    private double SRP;
    private String category;
    private int quantity;

    public ItemList(String itemName, double mPrice, double SRP, String category, int quantity){
        this.itemName = itemName;
        this.mPrice = mPrice;
        this.SRP = SRP;
        this.category = category;
        this.quantity = quantity;
    }

    public String getItemName(){
        return itemName;
    }

    public double getmPrice(){
        return mPrice;
    }

    public double getSRP(){
        return SRP;
    }

    public String getCategory(){
        return category;
    }

    public int getQuantity(){
        return quantity;
    }
}
