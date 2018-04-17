package com.example.hp.calculator;


public class Product {
    String productName;
    Double productPrice, totalCost;
    int productGst;

    Product(String productName, double productPrice, int productGst, double totalCost) {
        this.setProductName(productName);
        this.setProductPrice(productPrice);
        this.setProductGst(productGst);
        this.setTotalCost(totalCost);
    }

    String getProductName() {
        return productName;
    }

    void setProductName(String productName) {
        this.productName = productName;
    }

    Double getProductPrice() {
        return productPrice;
    }

    void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    Double getTotalCost() {
        return totalCost;
    }

    void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    int getProductGst() {
        return productGst;
    }

    void setProductGst(int productGst) {
        this.productGst = productGst;
    }

}