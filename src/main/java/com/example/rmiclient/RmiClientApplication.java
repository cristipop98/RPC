package com.example.rmiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import java.net.Inet4Address;
import java.net.UnknownHostException;

@SpringBootApplication
@Configuration
public class RmiClientApplication {

	@Bean RmiProxyFactoryBean service(){
		RmiProxyFactoryBean rmiProxyFactory = new RmiProxyFactoryBean();
		rmiProxyFactory.setServiceUrl("rmi://localhost:1099/MedicationPlanRpcService");
		rmiProxyFactory.setServiceInterface(MedicationPlanRpcService.class);
		return rmiProxyFactory;
	}

	public static void main(String[] args) {
		MedicationPlanRpcService service=SpringApplication.run(RmiClientApplication.class, args).getBean(MedicationPlanRpcService.class);

	}

}
