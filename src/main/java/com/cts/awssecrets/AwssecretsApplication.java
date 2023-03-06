package com.cts.awssecrets;

import io.awspring.cloud.secretsmanager.AwsSecretsManagerPropertySources;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwssecretsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwssecretsApplication.class, args);
	}
	//AwsSecretsManagerPropertySources

}
