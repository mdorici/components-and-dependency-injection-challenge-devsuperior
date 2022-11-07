package com.mdorici.challenge01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mdorici.challenge01.entities.Order;
import com.mdorici.challenge01.services.OrderService;

@SpringBootApplication
public class Challenge01Application implements CommandLineRunner {

	private OrderService orderService;

	public Challenge01Application(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {

		SpringApplication.run(Challenge01Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Order order1 = new Order(1034, 150.0, 20.0);

		System.out.println("Order code " + order1.getCode());
		System.out.println("Order total value: R$ " + orderService.total(order1));

		Order order2 = new Order(2282, 800.0, 10.0);

		System.out.println("Order code " + order2.getCode());
		System.out.println("Order total value: R$ " + orderService.total(order2));

		Order order3 = new Order(1309, 95.9, 0.0);

		System.out.println("Order code " + order3.getCode());
		System.out.println("Order total value: R$ " + orderService.total(order3));
	}

}
