package com.ibm.iagro.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;


public class Base64Converter {

	public String getByteArrayFromImageURL(String imageURL) throws IOException {
	    java.net.URL url = new java.net.URL(imageURL); 
	    InputStream is = url.openStream();  
	    byte[] bytes = org.apache.commons.io.IOUtils.toByteArray(is); 
	    return Base64.getEncoder().encodeToString(bytes);

	}
	
	public String getByteArrayFromImageURLState(String urlStr) throws IOException {
	    java.net.URL url = new java.net.URL(urlStr); 
	    InputStream is = url.openStream();  
	    byte[] bytes = org.apache.commons.io.IOUtils.toByteArray(is); 
	    return Base64.getEncoder().encodeToString(bytes);

	}
	
	public String getStringJSONFromURLWeather(String urlStr) throws IOException {
		Geocode geo = new Geocode();
		String code = geo.getGeoCode(urlStr);
		System.out.println("code "+  code);
		if (code!=null)
		{
		    java.net.URL url = new java.net.URL("https://apiprevmet3.inmet.gov.br/previsao/"+code); 
		    InputStream is = url.openStream();  
		    byte[] bytes = org.apache.commons.io.IOUtils.toByteArray(is); 
		    return new String(bytes, StandardCharsets.UTF_8);
		}else
		{
			return "{\"warning\": \"city not found\"}";
		}

	}

}
