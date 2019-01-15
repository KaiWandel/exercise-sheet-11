package Teststand;

public class Engine {
	private String fuel;
	private Integer efficiency;
	private Integer rpm;
	private Integer fuelConsumption;
	private Integer carbonEmissions;
	
	public Engine (final String fuel, final Integer efficiency, Integer rpm, Integer fuelConsumption, Integer carbonEmissions) {
	
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public Integer getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(Integer efficiency) {
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
