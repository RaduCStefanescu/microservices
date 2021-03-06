package com.radu.test.microservices.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(AccountsWebApplication.class)
public class AccountsServer {

    //@Autowired private AccountRepository accountRepository;

    public static void main(String[] args){
        System.setProperty("spring.config.name", "accounts-server");
        SpringApplication.run(AccountsServer.class, args);
    }
}
