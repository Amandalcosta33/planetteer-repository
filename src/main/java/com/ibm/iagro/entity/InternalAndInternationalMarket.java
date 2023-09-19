package com.ibm.iagro.entity;

import com.ibm.iagro.util.Utilities;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class InternalAndInternationalMarket {

	private String Product;
	private String Market;
	private String Entrance;
	private String Unity;
	private double DayPrice;
	private double PreviousDayVariation;
	private double OneWeekVariation;
	private double Variation30DaysAgo;
	private double SixMonthsVariation;
	private double OneYearVariation;

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		Product = product;
	}

	public String getMarket() {
		return Market;
	}

	public void setMarket(String market) {
		Market = market;
	}

	public String getEntrance() {
		return Entrance;
	}

	public void setEntrance(String entrance) {
		Entrance = entrance;
	}

	public String getUnity() {
		return Unity;
	}

	public void setUnity(String unity) {
		Unity = unity;
	}

	public double getDayPrice() {
		return DayPrice;
	}

	public void setDayPrice(String dayPrice) {
		
		try {
			DayPrice = new Utilities().convertStringToFloat(dayPrice);
		} catch (Exception ex) {
			DayPrice = (float) 0.0;
		}
	}

	public double getPreviousDayVariation() {
		return PreviousDayVariation;
	}

	public void setPreviousDayVariation(String previousDayVariation) {
		try {
			PreviousDayVariation = new Utilities().convertStringToFloat(previousDayVariation);
		} catch (Exception ex) {
			PreviousDayVariation = (float) 0.0;
		}

	}

	public double getOneWeekVariation() {
		return OneWeekVariation;
	}

	public void setOneWeekVariation(String oneWeekVariation) {

		try {
			OneWeekVariation = new Utilities().convertStringToFloat(oneWeekVariation);
		} catch (Exception ex) {
			OneWeekVariation = (float) 0.0;
		}
	}

	public double getVariation30DaysAgo() {
		return Variation30DaysAgo;
	}

	public void setVariation30DaysAgo(String variation30DaysAgo) {

		try {
			Variation30DaysAgo = new Utilities().convertStringToFloat(variation30DaysAgo);
		} catch (Exception ex) {
			Variation30DaysAgo = (float) 0.0;
		}
	}

	public double getSixMonthsVariation() {
		return SixMonthsVariation;
	}

	public void setSixMonthsVariation(String sixMonthsVariation) {

		try {
			SixMonthsVariation = new Utilities().convertStringToFloat(sixMonthsVariation);
		} catch (Exception ex) {
			SixMonthsVariation = (float) 0.0;
		}
	}

	public double getOneYearVariation() {
		return OneYearVariation;
	}

	public void setOneYearVariation(String oneYearVariation) {

		try {
			OneYearVariation = new Utilities().convertStringToFloat(oneYearVariation);
		} catch (Exception ex) {
			OneYearVariation = (float) 0.0;
		}
	}

	public InternalAndInternationalMarket(Elements internalAndInternationalMarket) {
		int i = 0;
		for (Element td : internalAndInternationalMarket) {
			
			i = i + 1;
			if (i == 1) {
				this.setProduct(td.text());
			}
			if (i == 2) {
				this.setMarket(td.text());
			}
			if (i == 3) {
				this.setEntrance(td.text());
			}
			if (i == 4) {
				this.setUnity(td.text());
			}
			if (i == 5) {
				this.setDayPrice(td.text());
			}
			if (i == 6) {
				this.setPreviousDayVariation(td.text());
			}
			if (i == 7) {
				this.setOneWeekVariation(td.text());
			}
			if (i == 8) {
				this.setVariation30DaysAgo(td.text());
			}
			if (i == 9) {
				this.setSixMonthsVariation(td.text());
			}
			if (i == 10) {
				this.setSixMonthsVariation(td.text());
			}
		}

	}

}
