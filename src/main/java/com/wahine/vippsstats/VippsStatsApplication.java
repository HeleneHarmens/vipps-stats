package com.wahine.vippsstats;

import com.wahine.vippsstats.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.List;

@Controller
@SpringBootApplication
public class VippsStatsApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello!";
	}

	public static void main(String[] args) {

		//SpringApplication.run(VippsStatsApplication.class, args);

		String host = "ec2-54-197-238-238.compute-1.amazonaws.com";
		String port = "5432";
		String user = "zzfjlycmvbpfau";
		String pass = "03a0094107507610c121285d2d780a99c967d312977c1506319003e3dd853966";
		String database = "dcipc4joknr9oa";

		PostgreSQLConnection psqlc = new PostgreSQLConnection(host, port, user, pass, database);

		//String prettyConsoleOutput = psqlc.getResults("SELECT 'customerID', 'firstName' FROM customer");
		//System.out.println(prettyConsoleOutput);

		psqlc.checkDemo("customer", "customer_id");
		psqlc.checkDemo("customer", "first_name");
		psqlc.checkDemo("customer", "last_name");
		psqlc.checkDemo("customer", "email_id");
		psqlc.checkDemo("customer", "ssn");


		SpringApplication.run(VippsStatsApplication.class, args);
	}


}
