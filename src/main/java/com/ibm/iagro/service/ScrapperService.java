package com.ibm.iagro.service;

import java.io.IOException;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.ibm.iagro.entity.InternalAndInternationalMarket;
import com.ibm.iagro.entity.PlantingForecastBetter;
import com.ibm.iagro.util.Base64Converter;
import com.ibm.iagro.util.Scrapper;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@ApplicationScoped
@Path("/api/v1/scrapping")
public class ScrapperService {

	@GET
	@Path("/internalandinternationalmarket")
	//@Produces(MediaType.APPLICATION_JSON)
	@Produces("application/json")
	@Operation(summary = "Get financial informations from Internal and International Market", description = "List informations about Product, Market, Entrance, Unity, Day Price, and Variations by several periods")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Success",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = InternalAndInternationalMarket.class))),
            @APIResponse(responseCode = "404", description="table origin not found",
                    content = @Content(mediaType = "application/json"))
    })
	public Response getInternalAndInternationalMarket() {
		Scrapper scrapper = new Scrapper();
		return Response.ok(scrapper.scrappingInternalAndInternationalMarket()).build();
	}
	
	@GET
	@Path("/plantingforecastbetter/{state}/{city}")
	//@Produces(MediaType.APPLICATION_JSON)
	@Produces("application/json")
	@Operation(summary = "Gets agricultural culture by state and city", description = "The indicated period is calculated so that the planting or sowing carried out on that date has 80%\n"
			+ "of chance of success, avoiding losses due to extreme weather events (drought, frost, rain at harvest),\n"
			+ "depending on the season (summer, autumn, winter, spring).")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Success",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = PlantingForecastBetter.class))),
            @APIResponse(responseCode = "404", description="City or State not found",
                    content = @Content(mediaType = "application/json"))
    })	public Response getPlantingForecastBetter(@PathParam String state, @PathParam String city) {
		Scrapper scrapper = new Scrapper();
		return Response.ok(scrapper.scrappingClimateRiskZone(state, city)).build();
	}
	
	@GET
	@Path("/weatherforecast/{city}")
	//@Produces(MediaType.APPLICATION_JSON)
	@Produces("application/json")
	@Operation(summary = "Gets weather forecast by city", description = "List informations about weather forecast by city")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Success",
                    content = @Content(mediaType = "application/json")),
            @APIResponse(responseCode = "404", description="City or State not found",
                    content = @Content(mediaType = "application/json"))
    })	public Response getClimateRiskZone(@PathParam String city) throws IOException {
		Base64Converter base64 = new Base64Converter();
		return Response.ok(base64.getStringJSONFromURLWeather(city)).build();
	}

}