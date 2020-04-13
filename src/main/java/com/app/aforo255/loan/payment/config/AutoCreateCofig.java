package com.app.aforo255.loan.payment.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@Profile("loan")
public class AutoCreateCofig {

	@Bean
	public NewTopic depositEvents() {
		return TopicBuilder.name("loan-events")
				.partitions(3)
				.replicas(1)
				.build();
	}

}
