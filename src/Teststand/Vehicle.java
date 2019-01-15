package Teststand;

public abstract class Vehicle extends Producer {

	protected String color;
	protected String engineType;
	protected Integer fuelConsumption;
	
	public String getColor() {
		return color;
	}
	
	public String getEngineType() {
		return engineType;
	}

	public Integer getFuelConsumption() {
		return fuelConsumption;
	}
}
