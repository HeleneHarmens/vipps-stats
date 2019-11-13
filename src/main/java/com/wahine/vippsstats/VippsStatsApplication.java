package com.wahine.vippsstats;

import com.wahine.vippsstats.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.List;

@Controller
@SpringBootApplication
public class VippsStatsApplication {

	public String host;
	public String port;
	public String username;
	public String password;
	public String database;
	private Connection connection;

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello!";
	}

	public static void main(String[] args) {

		// For testing, not needed

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


	public ResultSet returnStats(String table) {
		try {
			this.connect();
			Statement stmt = null;
			String query = "SELECT * FROM " + table;

			stmt = this.connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			//System.out.println("Column " + pkColumn);
			/*
			while (rs.next()) {
				String id = new String(rs.getBytes(pkColumn), StandardCharsets.UTF_8);
				//System.out.println("| Column " + id + " |");
			}

			 */

			this.disconnect();
			return rs;
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		return null;
	}

	private void connect() throws Exception {
		Class.forName("org.postgresql.Driver");
		this.connection = null;
		this.connection = DriverManager.getConnection(
				"jdbc:postgresql://" + this.host + ":" + this.port + "/" + this.database, this.username, this.password);
	}

	private void disconnect() throws Exception {
		if (this.connection != null) {
			this.connection.close();
			this.connection = null;
		}
	}


}
