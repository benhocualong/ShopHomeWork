package com.team1.prm392.shophomework;

public class Product {

    private String productImage;

    private String productName;


    public Product(String productImage, String productName) {
        this.productImage = productImage;
        this.productName = productName;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
