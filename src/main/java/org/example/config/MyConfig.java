package org.example.config;

import org.example.restapi.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    public ResourceConfig resourceConfig() {
        ResourceConfig jersyServlet = new ResourceConfig();
        jersyServlet.register(CompteRestJaxRSAPI.class);
        return jersyServlet;
    }
}
