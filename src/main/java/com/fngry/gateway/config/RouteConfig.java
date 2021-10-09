package com.fngry.gateway.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * route config
 * @author gaorongyu
 */
@SpringBootConfiguration
public class RouteConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/muse/**").uri("lb://springboot-service-muse"))
                .build();
    }

}
