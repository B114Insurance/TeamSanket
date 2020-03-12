package com.crts.insurance.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
@SpringBootApplication
public class MsLedgerCreationApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(MsLedgerCreationApplication.class, args);
		System.out.println("Ledger Creation MS");
	}

	
}
