package net.javaguides.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {


	// when client sends request to api gateway - it will discover the correct service ip address
	// and port using service registry to communicate and route the request
	// thats why we have registered api gateway as a eureka client with eureka server based server registry
	// here eureka server is nothing but service registry

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
