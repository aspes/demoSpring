package payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PayrollApplication {

    public static void main(String... args) {
        SpringApplication.run(PayrollApplication.class, args);
    }
}

// ./mvnw clean spring-boot:run
// curl -v localhost:8080/employees
// curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'
// curl -X DELETE localhost:8080/employees/3


/*
Restful app is resilient.
A key factor of resilience is that when you make upgrades to your services, your clients do not suffer downtime.
Keep db columns for backward compatibility.
 */