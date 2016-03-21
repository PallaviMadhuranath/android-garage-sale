package com.example.pallavidas.garagesale;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by pallavidas on 3/11/16.
 */
public class GarageItem {
    private String itemName;
    private double price;
    private String description;
    private String emalAdd;

    public GarageItem(){

    }

    public GarageItem(String itemName, double price, String description, String emailAdd/*Bitmap imagebp*/){
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.emalAdd = emailAdd;
    }


    public String getItemName(){
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price ){
        this.price = price;
    }

    public String getDescription(){
        return  description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getEmalAdd(){
        return emalAdd;
    }

    public void setEmalAdd(String emalAdd){
        this.emalAdd = emalAdd;
    }

}
