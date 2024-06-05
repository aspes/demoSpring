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
// curl -v localhost:8080/employees // read
// curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}' // create
// curl -v -X POST localhost:8080/employees -H 'Content-Type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}' | json_pp
// curl -X PUT localhost:8080/employees/2 -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}' // update
// curl -X DELETE localhost:8080/employees/3 // delete

/*
Restful app is resilient.
A key factor of resilience is that when you make upgrades to your services, your clients do not suffer downtime.
Keep db columns for backward compatibility.
 */