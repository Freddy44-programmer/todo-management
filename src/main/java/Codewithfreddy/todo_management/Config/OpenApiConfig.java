package Codewithfreddy.todo_management.Config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info (
                contact = @Contact(
                        name = "Freddy",
                        email = "rangataft@gmail.com"
                ),
                description = "OpenApi documentation for Todo web application",
                title = "OpenApi specification - Freddy",
                version = "1.0"
             ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url= "http://localhost:8080"
                ),

                @Server(
                        description = "Prod ENV",
                        url= "Still to come"
                )
        }
)
public class OpenApiConfig {
}
