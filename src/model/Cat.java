/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author ppolo
 */
public class Cat {
    private Integer catId;
    private String catName;
    private BigDecimal price;
    private Integer quantity;
    private MyColor color;
    private Float weight;

    public Cat() {
    }

    public Cat(Integer catId, String catName, BigDecimal price, Integer quantity, MyColor color, Float weight) {
        this.catId = catId;
        this.catName = catName;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.weight = weight;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public MyColor getMyColor() {
        return color;
    }

    public void setMyColor(MyColor color) {
        this.color = color;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "catId: " + catId + ", catName: " + catName + ", price: " + price + ", quantity: " + quantity + ", color: " + color + ", weight: " + weight + "\n";
    }
    
    
}
