package com.ibm.iagro.entity;

public class StateMapAgricultureClimate {
	private String agriculturalDrought;
	private String needReplacementRain;
	private String accumulatedPrecipitation;
	private String potentialEvapotranspiration;
	private String absoluteMinimumTemperature;
	private String absoluteMaximumTemperature;
	private String drought;
	private String availabilityWaterSoil;
	private String precipitationLast5Days;
	private String phytosanitaryTreatmentConditions;
	private String conditionsLandManagement;
	private String needIrrigation;
	private String harvestConditions;
	private String precipitationToday;
	private String forecastAgriculturalDamageFrost;

	public String getAgriculturalDrought() {
		return agriculturalDrought;
	}

	public void setAgriculturalDrought(String agriculturalDrought) {
		this.agriculturalDrought = agriculturalDrought;
	}

	public String getNeedReplacementRain() {
		return needReplacementRain;
	}

	public void setNeedReplacementRain(String needReplacementRain) {
		this.needReplacementRain = needReplacementRain;
	}

	public String getAccumulatedPrecipitation() {
		return accumulatedPrecipitation;
	}

	public void setAccumulatedPrecipitation(String accumulatedPrecipitation) {
		this.accumulatedPrecipitation = accumulatedPrecipitation;
	}

	public String getPotentialEvapotranspiration() {
		return potentialEvapotranspiration;
	}

	public void setPotentialEvapotranspiration(String potentialEvapotranspiration) {
		this.potentialEvapotranspiration = potentialEvapotranspiration;
	}

	public String getAbsoluteMinimumTemperature() {
		return absoluteMinimumTemperature;
	}

	public void setAbsoluteMinimumTemperature(String absoluteMinimumTemperature) {
		this.absoluteMinimumTemperature = absoluteMinimumTemperature;
	}

	public String getAbsoluteMaximumTemperature() {
		return absoluteMaximumTemperature;
	}

	public void setAbsoluteMaximumTemperature(String absoluteMaximumTemperature) {
		this.absoluteMaximumTemperature = absoluteMaximumTemperature;
	}

	public String getDrought() {
		return drought;
	}

	public void setDrought(String drought) {
		this.drought = drought;
	}

	public String getAvailabilityWaterSoil() {
		return availabilityWaterSoil;
	}

	public void setAvailabilityWaterSoil(String availabilityWaterSoil) {
		this.availabilityWaterSoil = availabilityWaterSoil;
	}

	public String getPrecipitationLast5Days() {
		return precipitationLast5Days;
	}

	public void setPrecipitationLast5Days(String precipitationLast5Days) {
		this.precipitationLast5Days = precipitationLast5Days;
	}

	public String getPhytosanitaryTreatmentConditions() {
		return phytosanitaryTreatmentConditions;
	}

	public void setPhytosanitaryTreatmentConditions(String phytosanitaryTreatmentConditions) {
		this.phytosanitaryTreatmentConditions = phytosanitaryTreatmentConditions;
	}

	public String getConditionsLandManagement() {
		return conditionsLandManagement;
	}

	public void setConditionsLandManagement(String conditionsLandManagement) {
		this.conditionsLandManagement = conditionsLandManagement;
	}

	public String getNeedIrrigation() {
		return needIrrigation;
	}

	public void setNeedIrrigation(String needIrrigation) {
		this.needIrrigation = needIrrigation;
	}

	public String getHarvestConditions() {
		return harvestConditions;
	}

	public void setHarvestConditions(String harvestConditions) {
		this.harvestConditions = harvestConditions;
	}

	public String getPrecipitationToday() {
		return precipitationToday;
	}

	public void setPrecipitationToday(String precipitationToday) {
		this.precipitationToday = precipitationToday;
	}

	public String getForecastAgriculturalDamageFrost() {
		return forecastAgriculturalDamageFrost;
	}

	public void setForecastAgriculturalDamageFrost(String forecastAgriculturalDamageFrost) {
		this.forecastAgriculturalDamageFrost = forecastAgriculturalDamageFrost;
	}

	public StateMapAgricultureClimate(String agriculturalDrought, String needReplacementRain,
			String accumulatedPrecipitation, String potentialEvapotranspiration, String absoluteMinimumTemperature,
			String absoluteMaximumTemperature, String drought, String availabilityWaterSoil,
			String precipitationLast5Days, String phytosanitaryTreatmentConditions, String conditionsLandManagement,
			String needIrrigation, String harvestConditions, String precipitationToday,
			String forecastAgriculturalDamageFrost) {
		this.setAgriculturalDrought(agriculturalDrought);
		this.setNeedReplacementRain(needReplacementRain);
		this.setAccumulatedPrecipitation(accumulatedPrecipitation);
		this.setPotentialEvapotranspiration(potentialEvapotranspiration);
		this.setAbsoluteMinimumTemperature(absoluteMinimumTemperature);
		this.setAbsoluteMaximumTemperature(absoluteMaximumTemperature);
		this.setDrought(drought);
		this.setAvailabilityWaterSoil(availabilityWaterSoil);
		this.setPrecipitationLast5Days(precipitationLast5Days);
		this.setPhytosanitaryTreatmentConditions(phytosanitaryTreatmentConditions);
		this.setConditionsLandManagement(conditionsLandManagement);
		this.setNeedIrrigation(needIrrigation);
		this.setHarvestConditions(harvestConditions);
		this.setPrecipitationToday(precipitationToday);
		this.setForecastAgriculturalDamageFrost(forecastAgriculturalDamageFrost);

	}
}
