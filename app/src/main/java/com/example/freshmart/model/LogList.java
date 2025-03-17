package com.example.freshmart.model;

import java.util.Date;

public class LogList {
    private String itemName;
    private String itemCategory;
    private double itemMPrice;
    private double itemSRP;
    private int itemQuant;
    private Date itemLogDate;

    public LogList(String itemName, String itemCategory, double itemMPrice, double itemSRP, int itemQuant, Date itemLogDate) {
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemMPrice = itemMPrice;
        this.itemSRP = itemSRP;
        this.itemQuant = itemQuant;
        this.itemLogDate = itemLogDate;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public double getItemMPrice() {
        return itemMPrice;
    }

    public double getItemSRP(){
        return itemSRP;
    }

    public int getItemQuant(){
        return itemQuant;
    }

    public Date getItemLogDate(){
        return itemLogDate;
    }
}
