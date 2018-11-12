package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"model"})
@PropertySource("classpath:application.properties")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

/*
1. Spring boot project (Spring Boot Starter Web)
Spring: core, beans, AOP
Web MVC: Spring MVC
JSON Binding: Jackson
Validation: Hibernate Validator
Servlet Container: Embedded Tomcat
Logging: logback, slf4j
Database: MySQL
DataAcess: Spring Data, Hibernate, JDBC

2. Database tables:
User (id, email, firstName, lastName, age, registrationDate, userType, roles, status)
Category (id, name, subcategories)
Product (id, name, categories)
Cart (id, totalPrice, entries, createDate)
CartEntry (id, entryNumber - generated 0...N, cart, product, basePrice, quantity, taxCost, totalPrice - calculated value)

product-category: many-2-many
category-subcategories: one-2-many
cart-cartEntry: one-2-many
user-cart: many-2-many
cartEntry-product: one-2-one
 */
