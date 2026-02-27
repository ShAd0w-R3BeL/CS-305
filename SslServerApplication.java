package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}
}

@RestController
class CheckSumController {

	@RequestMapping("/hash")
    public String displayHash() throws NoSuchAlgorithmException {
    	String data = "Hello World Check Sum!";
        
        // Use SHA-256 for the cryptographic hash algorithm [cite: 27]
    	MessageDigest digest = MessageDigest.getInstance("SHA-256");
    	byte[] encodedHash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
    	
    	// Convert bytes to hex string
    	StringBuilder hexString = new StringBuilder();
    	for (byte b : encodedHash) {
    		String hex = Integer.toHexString(0xff & b);
    		if (hex.length() == 1) hexString.append('0');
    		hexString.append(hex);
    	}
    	
    	// Requirement: Show your name and a unique data string 
    	return "<p>Data: " + data + "</p><p>Name: Matthew Wood</p><p>SHA-256 Checksum: " + hexString.toString() + "</p>";
    }
}