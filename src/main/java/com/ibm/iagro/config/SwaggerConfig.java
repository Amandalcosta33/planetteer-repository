package com.ibm.iagro.config;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        tags = {
                @Tag(name = "team", description = "The Planeteers"),
        },
        info = @Info(
                title = "The Planeteers",
                version = "1.0.0",
                contact = @Contact(
                        name = "avg-c2o-internal-call-for-code-2021",
                        url = "https://ibm-cio.slack.com/archives/C021LTH2AH4",
                        email = "gmorales@br.ibm.com;pedro.pereira@ibm.com;amanda.lcosta@ibm.com;rivaldo.rodrigues@ibm.com;trsilva@br.ibm.com"),
                
                license = @License(
                        name = "C2O Internal Call for Code 2021",
                        url = "https://w3.ibm.com/w3publisher/config2order-internal-call-for-code-2021"))
)
public class SwaggerConfig extends Application {

}