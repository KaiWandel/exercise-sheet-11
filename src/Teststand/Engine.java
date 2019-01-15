package Teststand;

public class Engine {
	private String fuel;
	private Double efficiency;
	private Integer rpm;
	private Integer fuelConsumption;
	private Double carbonEmissions;
	
	public Engine (final String fuel, final Double efficiency, Integer rpm, Integer fuelConsumption, Double carbonEmissions) {
		this.fuel = fuel;
		this.efficiency = efficiency;
		this.rpm =rpm;
		this.fuelConsumption = fuelConsumption;
		this.carbonEmissions = carbonEmissions;
	}
	public Double carbonEmissionsCalc() {
		if (fuel == diesel) {
			carbonEmissions = fuelConsumption * 26.5;
		}
		else {
			carbonEmissions = fuelConsumption * 23.8;
		}
		return carbonEmissions;
	}
	public void createDieselEngine() {
		Engine diesel = new Engine ("Diesel", 0.6, rpm, )
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public Double getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(Double efficiency) {
		this.efficiency = efficiency;
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
	public Integer getCarbonEmissions() {
		return carbonEmissions;
	}
	public void setCarbonEmissions(Integer carbonEmissions) {
		this.carbonEmissions = carbonEmissions;
	}
}
