package Teststand;

public class Engine {
	private String fuelType;
	private Double efficiency;
	private Integer rpm;
	private Integer fuelConsumption;
	private Double carbonEmissions;
	
	public Engine (final String fuelType, final Double efficiency, Integer rpm, Integer fuelConsumption, Double carbonEmissions) {
		this.fuelType = fuelType;
		this.efficiency = efficiency;
		this.rpm =rpm;
		this.fuelConsumption = fuelConsumption;
		this.carbonEmissions = carbonEmissions;
	}
	public Double carbonEmissionsCalc() {
		if (fuelType == "Diesel") {
			carbonEmissions = fuelConsumption * 26.5;
		}
		else {
			carbonEmissions = fuelConsumption * 23.8;
		}
		return carbonEmissions;
	}
	public void setEfficiency(double efficiency) {
		if (efficiency > 0 || efficiency < 1) {
			this.efficiency = efficiency; 
		} else {
			throw new IllegalArgumentException( "Efficiency nur zwischen 0 und 0.99" ); 
		}
	}
	public void setFuelType(String fuelType ) {
		if (fuelType == "Diesel" ||fuelType == "Petrol") {
			this.fuelType = fuelType;
		} else {
			throw new IllegalArgumentException( "Muss entweder Petrol oder Diesel sein" ); 
		}
	}
	public String getFuelType() {
		return fuelType;
	}
	public Double getEfficiency() {
		return efficiency;
	}
	public Integer getRpm() {
		return rpm;
	}
	public void setRpm(Integer rpm) {
		this.rpm = rpm;
	}
	public Integer getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(Integer fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	public Double getCarbonEmissions() {
		return carbonEmissions;
	}
	public void setCarbonEmissions(Double carbonEmissions) {
		this.carbonEmissions = carbonEmissions;
	}
}
