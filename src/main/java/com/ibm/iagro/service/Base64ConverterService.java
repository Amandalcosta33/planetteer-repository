package com.ibm.iagro.service;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ibm.iagro.entity.CountryMapAgricultureClimate;
import com.ibm.iagro.entity.StateMapAgricultureClimate;
import com.ibm.iagro.util.Base64Converter;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/api/v1/map")
public class Base64ConverterService {

	@GET
	@Path("/country")
	@Produces(MediaType.APPLICATION_JSON)
	@Operation(summary = "Brazil: Get PNG image, from specific subject and return image in the base64.", description = "Take a specific type of map such as: agricultural drought, need for replacement by rain, accumulated precipitation, potential evapotranspiration, minimum absolute temperature, maximum absolute temperature, drought, soil water availability, phytosanitary treatment conditions, conditions for water management Soil, Need for irrigation, Harvest conditions and prediction of agricultural damage - frost at the Brazilian level or specific state.")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "Map found or available", content = @Content(mediaType = "application/json")),
			@APIResponse(responseCode = "404", description = "Map not found or not available", content = @Content(mediaType = "application/json")) })
	public CountryMapAgricultureClimate getBetterPlantingForecast() {
		Base64Converter base64Converter = new Base64Converter();
		String urlHost = "http://www.agritempo.gov.br/agritempo/mapas/pais/BR.";
		String[] mapTypes = { "PCTA", "IRRI", "MANE", "FITO", "COLH" };
		try {
			CountryMapAgricultureClimate countryMapAgricultureClimate = new CountryMapAgricultureClimate(
					base64Converter.getByteArrayFromImageURL(urlHost + mapTypes[0] + ".png"),
					base64Converter.getByteArrayFromImageURL(urlHost + mapTypes[1] + ".png"),
					base64Converter.getByteArrayFromImageURL(urlHost + mapTypes[2] + ".png"),
					base64Converter.getByteArrayFromImageURL(urlHost + mapTypes[3] + ".png"),
					base64Converter.getByteArrayFromImageURL(urlHost + mapTypes[4] + ".png"));

			return countryMapAgricultureClimate;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			return null;
		}
	}

	@GET
	@Path("/state/{state}")
	@Produces(MediaType.APPLICATION_JSON)
	@Operation(summary = "State: Get PNG image, from specific subject and return image in the base64.", description = "Take a specific type of map such as: agricultural drought, need for replacement by rain, accumulated precipitation, potential evapotranspiration, minimum absolute temperature, maximum absolute temperature, drought, soil water availability, phytosanitary treatment conditions, conditions for water management Soil, Need for irrigation, Harvest conditions and prediction of agricultural damage - frost at the Brazilian level or specific state.")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "Map found or available", content = @Content(mediaType = "aapplication/json")),
			@APIResponse(responseCode = "404", description = "Map not found or not available", content = @Content(mediaType = "application/json")) })
	public StateMapAgricultureClimate getBetterPlantingForecastState(@PathParam String state) {
		String urlHost = "http://www.agritempo.gov.br/agritempo/mapas/uf/";
		String[] mapTypes = { "ESTA", "PRTA", "PREA", "ETP", "TMIA", "TMAA", "ESTC", "PCTA", "PREC", "FITO", "MANE",
				"IRRI", "COLH", "PRECH", "GEADABC" };

		Base64Converter base64Converter = new Base64Converter();

		try {
			StateMapAgricultureClimate stateMapAgricultureClimate = new StateMapAgricultureClimate(
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[0] + ".png"),
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[1] + ".png"),
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[2] + ".png"),
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[3] + ".png"),
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[4] + ".png"),
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[5] + ".png"),
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[6] + ".png"),
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[7] + ".png"),
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[8] + ".png"),
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[9] + ".png"),
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[10] + ".png"),
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[11] + ".png"),
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[12] + ".png"),
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[13] + ".png"),
					base64Converter.getByteArrayFromImageURLState(urlHost + state + "." + mapTypes[14] + ".png"));
			return stateMapAgricultureClimate;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			return null;
		}
	}

}