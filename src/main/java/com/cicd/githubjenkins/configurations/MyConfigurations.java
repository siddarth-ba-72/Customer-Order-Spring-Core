package com.cicd.githubjenkins.configurations;

import com.cicd.githubjenkins.models.Address;
import com.cicd.githubjenkins.models.Order;
import com.cicd.githubjenkins.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyConfigurations {

    @Bean("products")
    public List<Product> availableProducts() {
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product(1, "Logitech Mouse", 3.9f, 2500));
        productsList.add(new Product(2, "Samsung Mobile", 4.2f, 26000));
        productsList.add(new Product(3, "Boats Earbuds", 4.5f, 2100));
        productsList.add(new Product(4, "HP Webcam", 3.8f, 3100));
        productsList.add(new Product(5, "T-Link Ethernet-USB Connector", 4.6f, 1800));
        productsList.add(new Product(6, "One-plus Nord Earbuds", 4.8f, 2200));
        return productsList;
    }

    @Bean("locations")
    public List<Address> getAddress() {
        List<Address> locations = new ArrayList<>();
        locations.add(new Address("Bengaluru", "Karnataka", 560019));
        locations.add(new Address("Mysore", "Karnataka", 530012));
        locations.add(new Address("Nashik", "Maharashtra", 460072));
        return locations;
    }

    @Bean("orders")
    public List<Order> getOrders() {
        List<Order> ordersList = new ArrayList<>();
        List<Product> products = availableProducts();
        List<Address> locations = getAddress();

        ordersList.add(new Order(1, "27/02/2024", locations.get(0), new Product[]{
            products.get(0), products.get(1), products.get(2)
        }));
        ordersList.add(new Order(2, "28/02/2024", locations.get(2), new Product[]{
            products.get(3), products.get(4), products.get(5)
        }));

        return ordersList;
    }
}
