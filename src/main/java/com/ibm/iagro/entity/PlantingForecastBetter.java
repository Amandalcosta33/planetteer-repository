package com.ibm.iagro.entity;

import java.util.ArrayList;
import java.util.List;

public class PlantingForecastBetter {
	private String culture;
	private String cicle;
	private String soil;
	private List<Months> months;

	public String getCulture() {
		return culture;
	}

	public void setCulture(String culture) {
		this.culture = culture;
	}

	public String getCicle() {
		return cicle;
	}

	public void setCicle(String cicle) {
		this.cicle = cicle;
	}

	public String getSoil() {
		return soil;
	}

	public void setSoil(String soil) {
		this.soil = soil;
	}

	public List<Months> getMonths() {
		return months;
	}

	public void setMonths(List<Months> months) {
		this.months = months;
	}

	public PlantingForecastBetter(ClimateRiskZone climateRiskZone) {
		this.setCulture(climateRiskZone.getCulture());
		this.setCicle(climateRiskZone.getCicle());
		this.setSoil(climateRiskZone.getGround());

		List<Months> tmpMonths = new ArrayList<Months>();

		/*January */
		if ((climateRiskZone.getJan01().equals("S")) || (climateRiskZone.getJan02().equals("S"))
				|| (climateRiskZone.getJan03().equals("S"))) {
			List<String> tmpPeriod = new ArrayList<String>();
			if (climateRiskZone.getJan01().equals("S")) {
				tmpPeriod.add("01-10");
			}
			if (climateRiskZone.getJan02().equals("S")) {
				tmpPeriod.add("11-20");
			}
			if (climateRiskZone.getJan03().equals("S")) {
				tmpPeriod.add("21-30");
			}
			Months tmp = new Months("January",tmpPeriod);
			tmpMonths.add(tmp);
		}
		
		/*February */
		if ((climateRiskZone.getFev01().equals("S")) || (climateRiskZone.getFev02().equals("S"))
				|| (climateRiskZone.getFev03().equals("S"))) {
			List<String> tmpPeriod = new ArrayList<String>();
			if (climateRiskZone.getFev01().equals("S")) {
				tmpPeriod.add("01-10");
			}
			if (climateRiskZone.getFev02().equals("S")) {
				tmpPeriod.add("11-20");
			}
			if (climateRiskZone.getFev03().equals("S")) {
				tmpPeriod.add("21-28");
			}
			Months tmp = new Months("February",tmpPeriod);
			tmpMonths.add(tmp);
		}
		
		/*March */
		if ((climateRiskZone.getMar01().equals("S")) || (climateRiskZone.getMar02().equals("S"))
				|| (climateRiskZone.getMar03().equals("S"))) {
			List<String> tmpPeriod = new ArrayList<String>();
			if (climateRiskZone.getMar01().equals("S")) {
				tmpPeriod.add("01-10");
			}
			if (climateRiskZone.getMar02().equals("S")) {
				tmpPeriod.add("11-20");
			}
			if (climateRiskZone.getMar03().equals("S")) {
				tmpPeriod.add("21-30");
			}
			Months tmp = new Months("March",tmpPeriod);
			tmpMonths.add(tmp);
		}

		/*March */
		if ((climateRiskZone.getMar01().equals("S")) || (climateRiskZone.getMar02().equals("S"))
				|| (climateRiskZone.getMar03().equals("S"))) {
			List<String> tmpPeriod = new ArrayList<String>();
			if (climateRiskZone.getMar01().equals("S")) {
				tmpPeriod.add("01-10");
			}
			if (climateRiskZone.getMar02().equals("S")) {
				tmpPeriod.add("11-20");
			}
			if (climateRiskZone.getMar03().equals("S")) {
				tmpPeriod.add("21-30");
			}
			Months tmp = new Months("March",tmpPeriod);
			tmpMonths.add(tmp);
		}

		/*April */
		if ((climateRiskZone.getAbr01().equals("S")) || (climateRiskZone.getAbr02().equals("S"))
				|| (climateRiskZone.getAbr03().equals("S"))) {
			List<String> tmpPeriod = new ArrayList<String>();
			if (climateRiskZone.getAbr01().equals("S")) {
				tmpPeriod.add("01-10");
			}
			if (climateRiskZone.getAbr02().equals("S")) {
				tmpPeriod.add("11-20");
			}
			if (climateRiskZone.getAbr03().equals("S")) {
				tmpPeriod.add("21-30");
			}
			Months tmp = new Months("April",tmpPeriod);
			tmpMonths.add(tmp);
		}

		/*May */
		if ((climateRiskZone.getMai01().equals("S")) || (climateRiskZone.getMai02().equals("S"))
				|| (climateRiskZone.getMai03().equals("S"))) {
			List<String> tmpPeriod = new ArrayList<String>();
			if (climateRiskZone.getMai01().equals("S")) {
				tmpPeriod.add("01-10");
			}
			if (climateRiskZone.getMai02().equals("S")) {
				tmpPeriod.add("11-20");
			}
			if (climateRiskZone.getMai03().equals("S")) {
				tmpPeriod.add("21-30");
			}
			Months tmp = new Months("May",tmpPeriod);
			tmpMonths.add(tmp);
		}

		/*June */
		if ((climateRiskZone.getJun01().equals("S")) || (climateRiskZone.getJun02().equals("S"))
				|| (climateRiskZone.getJun03().equals("S"))) {
			List<String> tmpPeriod = new ArrayList<String>();
			if (climateRiskZone.getJun01().equals("S")) {
				tmpPeriod.add("01-10");
			}
			if (climateRiskZone.getJun02().equals("S")) {
				tmpPeriod.add("11-20");
			}
			if (climateRiskZone.getJun03().equals("S")) {
				tmpPeriod.add("21-30");
			}
			Months tmp = new Months("June",tmpPeriod);
			tmpMonths.add(tmp);
		}

		/*July */
		if ((climateRiskZone.getJul01().equals("S")) || (climateRiskZone.getJul02().equals("S"))
				|| (climateRiskZone.getJul03().equals("S"))) {
			List<String> tmpPeriod = new ArrayList<String>();
			if (climateRiskZone.getJul01().equals("S")) {
				tmpPeriod.add("01-10");
			}
			if (climateRiskZone.getJul02().equals("S")) {
				tmpPeriod.add("11-20");
			}
			if (climateRiskZone.getJul03().equals("S")) {
				tmpPeriod.add("21-30");
			}
			Months tmp = new Months("July",tmpPeriod);
			tmpMonths.add(tmp);
		}

		/*August */
		if ((climateRiskZone.getAgo01().equals("S")) || (climateRiskZone.getAgo02().equals("S"))
				|| (climateRiskZone.getAgo03().equals("S"))) {
			List<String> tmpPeriod = new ArrayList<String>();
			if (climateRiskZone.getAgo01().equals("S")) {
				tmpPeriod.add("01-10");
			}
			if (climateRiskZone.getAgo02().equals("S")) {
				tmpPeriod.add("11-20");
			}
			if (climateRiskZone.getAgo03().equals("S")) {
				tmpPeriod.add("21-30");
			}
			Months tmp = new Months("August",tmpPeriod);
			tmpMonths.add(tmp);
		}

		/*September */
		if ((climateRiskZone.getSet01().equals("S")) || (climateRiskZone.getSet02().equals("S"))
				|| (climateRiskZone.getSet03().equals("S"))) {
			List<String> tmpPeriod = new ArrayList<String>();
			if (climateRiskZone.getSet01().equals("S")) {
				tmpPeriod.add("01-10");
			}
			if (climateRiskZone.getSet02().equals("S")) {
				tmpPeriod.add("11-20");
			}
			if (climateRiskZone.getSet03().equals("S")) {
				tmpPeriod.add("21-30");
			}
			Months tmp = new Months("September",tmpPeriod);
			tmpMonths.add(tmp);
		}

		/*October */
		if ((climateRiskZone.getOut01().equals("S")) || (climateRiskZone.getOut02().equals("S"))
				|| (climateRiskZone.getOut03().equals("S"))) {
			List<String> tmpPeriod = new ArrayList<String>();
			if (climateRiskZone.getOut01().equals("S")) {
				tmpPeriod.add("01-10");
			}
			if (climateRiskZone.getOut02().equals("S")) {
				tmpPeriod.add("11-20");
			}
			if (climateRiskZone.getOut03().equals("S")) {
				tmpPeriod.add("21-30");
			}
			Months tmp = new Months("October",tmpPeriod);
			tmpMonths.add(tmp);
		}

		/*November */
		if ((climateRiskZone.getNov01().equals("S")) || (climateRiskZone.getNov02().equals("S"))
				|| (climateRiskZone.getNov03().equals("S"))) {
			List<String> tmpPeriod = new ArrayList<String>();
			if (climateRiskZone.getNov01().equals("S")) {
				tmpPeriod.add("01-10");
			}
			if (climateRiskZone.getNov02().equals("S")) {
				tmpPeriod.add("11-20");
			}
			if (climateRiskZone.getNov03().equals("S")) {
				tmpPeriod.add("21-30");
			}
			Months tmp = new Months("November",tmpPeriod);
			tmpMonths.add(tmp);
		}

		/*December */
		if ((climateRiskZone.getDez01().equals("S")) || (climateRiskZone.getDez02().equals("S"))
				|| (climateRiskZone.getDez03().equals("S"))) {
			List<String> tmpPeriod = new ArrayList<String>();
			if (climateRiskZone.getDez01().equals("S")) {
				tmpPeriod.add("01-10");
			}
			if (climateRiskZone.getDez02().equals("S")) {
				tmpPeriod.add("11-20");
			}
			if (climateRiskZone.getDez03().equals("S")) {
				tmpPeriod.add("21-30");
			}
			Months tmp = new Months("December",tmpPeriod);
			tmpMonths.add(tmp);
		}
		this.setMonths(tmpMonths);

	}

}
