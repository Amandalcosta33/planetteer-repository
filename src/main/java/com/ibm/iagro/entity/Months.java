package com.ibm.iagro.entity;

import java.util.List;

public class Months {
	private String month;
	private List<String> period;
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public List<String> getPeriod() {
		return period;
	}
	public void setPeriod(List<String> period) {
		this.period = period;
	}
	
	public Months(String month, List<String> period) {
		this.setMonth(month);
		this.setPeriod(period);
	}
}
