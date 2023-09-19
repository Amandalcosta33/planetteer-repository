package com.ibm.iagro.entity;

public class CountryMapAgricultureClimate {
	private String PCTA;
	private String IRRI;
	private String MANE;
	private String FITO;
	private String COLH;

	public String getPCTA() {
		return PCTA;
	}

	public void setPCTA(String pCTA) {
		PCTA = pCTA;
	}

	public String getIRRI() {
		return IRRI;
	}

	public void setIRRI(String iRRI) {
		IRRI = iRRI;
	}

	public String getMANE() {
		return MANE;
	}

	public void setMANE(String mANE) {
		MANE = mANE;
	}

	public String getFITO() {
		return FITO;
	}

	public void setFITO(String fITO) {
		FITO = fITO;
	}

	public String getCOLH() {
		return COLH;
	}

	public void setCOLH(String cOLH) {
		COLH = cOLH;
	}

	public CountryMapAgricultureClimate(String PCTA, String IRRI, String MANE, String FITO, String COLH) {
		this.setPCTA(PCTA);
		this.setIRRI(IRRI);
		this.setMANE(MANE);
		this.setFITO(FITO);
		this.setCOLH(COLH);
	}

}
