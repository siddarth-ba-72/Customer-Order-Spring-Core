package com.cicd.githubjenkins;

import com.cicd.githubjenkins.models.Address;
import com.cicd.githubjenkins.models.Order;
import com.cicd.githubjenkins.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class GithubJenkinsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GithubJenkinsApplication.class, args);

		System.out.println("\nAvailable Products:-");
		List<Product> productsList = (List<Product>) ctx.getBean("products");
		for(Product p : productsList)
			System.out.println(p);

		System.out.println("\nService Locations:-");
		List<Address> locations = (List<Address>) ctx.getBean("locations");
		for(Address a : locations)
			System.out.println(a);

		System.out.println("\nOrders:-");
		List<Order> ordersList = (List<Order>) ctx.getBean("orders");
		for(Order o : ordersList)
			System.out.println(o);

	}

}
