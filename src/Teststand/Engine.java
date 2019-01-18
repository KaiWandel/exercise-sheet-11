package Teststand;

public class Engine {
	private String fuelType;
	private Double efficiency;
	private Integer rpm;
	private Double fuelConsumption;
	private Double carbonEmissions;
	
	public Engine (final String fuelType, final Double efficiency, Integer rpm, Double fuelConsumption, Double carbonEmissions) {
		this.fuelType = fuelType;
		this.efficiency = efficiency;
		this.rpm =rpm;
		this.fuelConsumption = fuelConsumption;
		this.carbonEmissions = carbonEmissions;
	}
	public Double fuelConsumptionCalc() {
		fuelConsumption = (rpm * efficiency) / 100;
		return fuelConsumption;
	}
	
	public Double carbonEmissionsCalc() {
		if (fuelType == "Diesel") {
			carbonEmissions = fuelConsumption * 26.5;
		}
		else if (fuelType == "Benzin") {
			carbonEmissions = fuelConsumption * 23.8;
		} else {
			throw new throw new IllegalArgumentException ("Muss entweder Benzin oder Diesel sein");
		}
		return carbonEmissions;
	}
	public void setEfficiency(double efficiency) {
		if (efficiency > 0 && efficiency < 1) {
			this.efficiency = efficiency; 
		} else {
			throw new IllegalArgumentException( "Efficiency nur zwischen 0 und 0.99" ); 
		}
	}
	public void setFuelType(String fuelType ) {
		if (fuelType == "Diesel" ||fuelType == "Benzin") {
			this.fuelType = fuelType;
		} else {
			throw new IllegalArgumentException( "Muss entweder Benzin oder Diesel sein" ); 
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
	public Double getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(double fuelConsumption) {
		if (rpm == 1000) {
			this.fuelConsumption = fuelConsumption;
		} else if (rpm == 2000) {
			this.fuelConsumption = fuelConsumption;
		} else if (rpm == 4000) {
			this.fuelConsumption = fuelConsumption;
		}
	}
	public Double getCarbonEmissions() {
		return carbonEmissions;
	}
	public void setCarbonEmissions(Double carbonEmissions) {
		this.carbonEmissions = carbonEmissions;
	}
}
