package org.as.Cloud_GateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;


import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CloudGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGateWayApplication.class, args);
		System.out.println("*******************************************************************************");


		System.out.println("******  APPLICATION SUCCES__Service__GateWay            ************************");


		System.out.println("*******************************************************************************");
	}


    // RouteLocator routes(RouteLocatorBuilder)

	//RouteLocator routes(RouteLocatorBuilder )

	//@Bean
	/*public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r ->r.path("/customer/**")
						.uri("lb://CUSTOMER-SERVICE") // Ajoutez le port correctement
						 )
				.route(r -> r.path("/inventory/**")
						.uri("lb://INVENTORY-SERVICE") // Ajoutez le port correctement
						 )
				.build();
		}
*/


		@Bean
	DiscoveryClientRouteDefinitionLocator routesDynamic(ReactiveDiscoveryClient rdc , DiscoveryLocatorProperties dlp){

		return  new DiscoveryClientRouteDefinitionLocator(rdc,dlp);
		}

}
