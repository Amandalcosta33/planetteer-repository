package com.ibm.iagro;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

@Path("/informations")
public class GreetingResource {

    @GET
	@Produces(MediaType.APPLICATION_JSON)
	@Operation(summary = "Check if the Backend is works.", description = "Verify if app backend is up or down.")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Backend works",
                    content = @Content(mediaType = "application/json")),
            @APIResponse(responseCode = "404", description="Backend don't works",
                    content = @Content(mediaType = "application/json"))
    })
    public String hello() {    	
        return "{\"Backend\": \"Rest API's Works\"}";
    }
}