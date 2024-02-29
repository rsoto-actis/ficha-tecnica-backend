package cl.gobiernosantiago.fichatecnicaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@SpringBootApplication
public class FichaTecnicaAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(FichaTecnicaAPIApplication.class, args);
    }
    
    @Bean
    public OpenAPI customOpenAPI() {
    	final String bearerAuthName = "autorization";
    	return new OpenAPI()
    			.addSecurityItem(new SecurityRequirement()
    			        .addList(bearerAuthName))
    			      .components(new Components()
    			        .addSecuritySchemes(bearerAuthName, new SecurityScheme()
    			          .name(bearerAuthName)
    			          .type(SecurityScheme.Type.HTTP)
    			          .scheme("bearer")
    			          .bearerFormat("JWT")))
    			.info( new Info()
    					.title("Ficha Técnica API")
    					.version("1.0.0")
    					.description("API Rest para datos de ficha técnica. Desarrollado con SpringBoot 3.2.1 y SpringDocs")
    					.termsOfService("http://swagger.io/terms/")
    					.license( new License().name("Apache 2.0").url("http://springfoc.org")));
    	
    	
    }

}