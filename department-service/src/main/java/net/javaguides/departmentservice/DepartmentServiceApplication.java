package net.javaguides.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "Department Service REST APIs",
				description = "Department Service REST APIs documentation",
				version = "v1.0",
				contact = @Contact(
						name = "S",
						email = "abc@gmail.com",
						url = "https://ww.javaguides.net"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://ww.javaguides.net"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Department service Doc",
				url = "https://ww.javaguides.net"
		)
)
@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
