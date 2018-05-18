package com.radu.test.microservices.accounts;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.radu.test.microservices.accounts")
@EnableJpaRepositories("com.radu.test.microservices.accounts")
//@PropertySource("classpath:db-config.properties")
public class AccountsWebApplication {

}
