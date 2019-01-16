package Teststand;

public class Test extends Teststand {
	private Integer rpm;
	private Double efficiency;
	private Double fuelConsumption;
	private Integer carbonEmission;
	
	public Test(Integer rpm, Double efficiency, Double fuelConsumption, Integer carbonEmission) {
		super();
		this.rpm = rpm;
		this.efficiency = efficiency;
		this.fuelConsumption = fuelConsumption;
		this.carbonEmission = carbonEmission;
	}

	public Integer getRpm() {
		return rpm;
	}

	public void setRpm(Integer rpm) {
		this.rpm = rpm;
	}

	public Double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(Double efficiency) {
		this.efficiency = efficiency;
	}

	public Double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(Double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public Integer getCarbonEmission() {
		return carbonEmission;
	}

	public void setCarbonEmission(Integer carbonEmission) {
		this.carbonEmission = carbonEmission;
	}
	
	
}
