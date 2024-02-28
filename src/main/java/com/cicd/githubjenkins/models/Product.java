package com.cicd.githubjenkins.models;

public class Product {

    private int productId;
    private String productName;
    private float rating;
    private int productPrice;

    public Product(int productId, String productName, float rating, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.rating = rating;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String toString() {
        return "Product Id: " + productId +
            "\nProduct Name: " + productName +
            "\nRating(out of 5): " + rating +
            "\nPrice: " + productPrice + "\n";
    }
}
