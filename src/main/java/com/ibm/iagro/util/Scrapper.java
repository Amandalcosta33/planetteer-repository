package com.ibm.iagro.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.ibm.iagro.entity.ClimateRiskZone;
import com.ibm.iagro.entity.InternalAndInternationalMarket;
import com.ibm.iagro.entity.PlantingForecastBetter;

@ApplicationScoped
public class Scrapper {

	private static String getCultureLine = "<td rowspan=\"3\" bgcolor=\"#0074A1\"> <b><font face=\"ARIAL\" size=\"-1\" color=\"#ffffff\"></font></b><font></font><p align=\"CENTER\"><font><b>";
	private static String getCicleLine = "<td rowspan=\"3\" bgcolor=\"#0074A1\"><font face=\"ARIAL\" color=\"#FFFFFF\" size=\"-1\">";
	private static String getGroundLine = "<td bgcolor=\"#0074A1\"><font face=\"ARIAL\" color=\"#FFFFFF\" size=\"-1\">";

	public String scrappingTable(String state, String city) {

		try {
			String url = "http://www.agritempo.gov.br/zoneamento/tabelas/" + state.toUpperCase() + "/"
					+ city.replace(" ", "_").toUpperCase() + "_G.HTML";
			Document doc;
			doc = Jsoup.connect(url).get();
			// String title = doc.title();
			Elements DIVinputElements = doc.select("div.telaAtiva");
			Elements inputElements = DIVinputElements.select("table");
			return inputElements.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return e.toString();
		}
	}

	public List<InternalAndInternationalMarket> scrappingInternalAndInternationalMarket() {
		List<InternalAndInternationalMarket> internalAndInternationalMarketList = new ArrayList<InternalAndInternationalMarket>();

		try {
			String url = "http://ciagri.iea.sp.gov.br/precosdiarios/Variacoes.aspx";
			Document doc;
			doc = Jsoup.connect(url).get();
			Elements inputElements = doc.select("table#ctl00_ContentPlaceHolder1_gridInternacional");

			for (Element row : inputElements.select("tr")) {
				Elements tds = row.select("td");
				InternalAndInternationalMarket internalAndInternationalMarket = new InternalAndInternationalMarket(tds);
				internalAndInternationalMarketList.add(internalAndInternationalMarket);
			}
			return internalAndInternationalMarketList;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return internalAndInternationalMarketList;
		}
	}

	public List<PlantingForecastBetter> scrappingClimateRiskZone(String state, String city) {
		List<PlantingForecastBetter> plantingForecastBetterList = new ArrayList<PlantingForecastBetter>();

		try {
			String culture = "";
			String cicle = "";
			String ground = "";
			String Ago01 = "";
			String Ago02 = ""; 
			String Ago03 = "";
			String Set01 = ""; 
			String Set02 = "";
			String Set03 = "";
			String Out01 = "";
			String Out02 = "";
			String Out03 = "";
			String Nov01 = "";
			String Nov02 = "";
			String Nov03 = "";
			String Dez01 = "";
			String Dez02 = ""; 
			String Dez03 = "";
			String Jan01 = "";
			String Jan02 = ""; 
			String Jan03 = ""; 
			String Fev01 = ""; 
			String Fev02 = ""; 
			String Fev03 = "";
			String Mar01 = ""; 
			String Mar02 = ""; 
			String Mar03 = ""; 
			String Abr01 = ""; 
			String Abr02 = ""; 
			String Abr03 = ""; 
			String Mai01 = ""; 
			String Mai02 = "";
			String Mai03 = ""; 
			String Jun01 = ""; 
			String Jun02 = ""; 
			String Jun03 = ""; 
			String Jul01 = ""; 
			String Jul02 = ""; 
			String Jul03 = "";
			String url = "http://www.agritempo.gov.br/zoneamento/tabelas/" + state.toUpperCase() + "/"
					+ city.replace(" ", "_").toUpperCase() + "_G.HTML";
			Document doc;
			doc = Jsoup.connect(url).get();
			// String title = doc.title();
			Elements DIVinputElements = doc.select("div.telaAtiva");
			Elements inputElements = DIVinputElements.select("table");

			for (Element row : inputElements.select("tr")) {
				Elements tds = row.select("td");
				int i = 0;
				for (Element td : tds) {
					String strTemp = td.toString();
					if (strTemp.contains(getCultureLine)) {
						i = 0;
						culture = td.text();
					} else {

						if (strTemp.contains(getCicleLine)) {
							cicle = td.text();
						} else {
							if (strTemp.contains(getGroundLine)) {
								 ground = td.text();
							} else {
								if (td.text().equals("S") || td.text().equals("N")) {
									i = i + 1;
									switch (i) {
									case 1:
										 Ago01 = td.text();
										break;
									case 2:
										 Ago02 = td.text();
										break;
									case 3:
										 Ago03 = td.text();
										break;
									case 4:
										 Set01 = td.text();
										break;
									case 5:
										 Set02 = td.text();
										break;
									case 6:
										 Set03 = td.text();
										break;
									case 7:
										 Out01 = td.text();
										break;
									case 8:
										 Out02 = td.text();
										break;
									case 9:
										 Out03 = td.text();
										break;
									case 10:
										 Nov01 = td.text();
										break;
									case 11:
										 Nov02 = td.text();
										break;
									case 12:
										 Nov03 = td.text();
										break;
									case 13:
										 Dez01 = td.text();
										break;
									case 14:
										 Dez02 = td.text();
										break;
									case 15:
										 Dez03 = td.text();
										break;
									case 16:
										 Jan01 = td.text();
										break;
									case 17:
										 Jan02 = td.text();
										break;
									case 18:
										 Jan03 = td.text();
										break;
									case 19:
										 Fev01 = td.text();
										break;
									case 20:
										 Fev02 = td.text();
										break;
									case 21:
										 Fev03 = td.text();
										break;
									case 22:
										 Mar01 = td.text();
										break;
									case 23:
										 Mar02 = td.text();
										break;
									case 24:
										 Mar03 = td.text();
										break;
									case 25:
										 Abr01 = td.text();
										break;
									case 26:
										 Abr02 = td.text();
										break;
									case 27:
										 Abr03 = td.text();
										break;
									case 28:
										 Mai01 = td.text();
										break;
									case 29:
										 Mai02 = td.text();
										break;
									case 30:
										 Mai03 = td.text();
										break;
									case 31:
										 Jun01 = td.text();
										break;
									case 32:
										 Jun02 = td.text();
										break;
									case 33:
										 Jun03 = td.text();
										break;
									case 34:
										 Jul01 = td.text();
										break;
									case 35:
										 Jul02 = td.text();
										break;
									case 36:
										 Jul03 = td.text();
										break;
									default:
										// code block
									}
								}
							}
						}
					}
					
					if((!culture.equals("")) && (!cicle.equals("")) && (!ground.equals("")))
					{
						ClimateRiskZone climateRiskZone = new ClimateRiskZone(culture, cicle, ground, Ago01, Ago02, Ago03,
								Set01, Set02, Set03, Out01, Out02, Out03, Nov01, Nov02, Nov03, Dez01, Dez02, Dez03, Jan01,
								Jan02, Jan03, Fev01, Fev02, Fev03, Mar01, Mar02, Mar03, Abr01, Abr02, Abr03, Mai01, Mai02,
								Mai03, Jun01, Jun02, Jun03, Jul01, Jul02, Jul03);
						PlantingForecastBetter plantingForecastBetter = new PlantingForecastBetter(climateRiskZone);
						
						plantingForecastBetterList.add(plantingForecastBetter);
					}
				}
			}
			System.out.println("Records: "+plantingForecastBetterList.size());
			return plantingForecastBetterList;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}

}
