package com.cicd.githubjenkins.models;

public class Order {

    private int orderID;
    private String orderDate;
    private Address location;
    private Product[] products;

    public Order(int orderID, String orderDate, Address location, Product[] products) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.location = location;
        this.products = products;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String toString() {
        StringBuilder orderToString = new StringBuilder();

        String orderDetails = "Order Id: " + orderID +
            "\nOrder Date: " + orderDate +
            "\nShipping Address:\n" + location;

        orderToString.append(orderDetails);
        orderToString.append("Products:-\n");

        int totalPrice = 0;

        for(Product prod : products) {
            orderToString.append(prod.getProductName())
                .append(" - Rs.").append(prod.getProductPrice())
                .append("\n");
            totalPrice += prod.getProductPrice();
        }

        orderToString.append("Total Amount: Rs.").append(totalPrice).append("\n");

        return orderToString.toString();
    }
}
