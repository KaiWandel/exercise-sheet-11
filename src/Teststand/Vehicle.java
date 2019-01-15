package Teststand;

public class Vehicle extends Producer {

	private String color;
	private String engineType;
	private Integer fuelConsumption;
	
	public Vehicle(final String vehicleType,final String producerName,final String color,final String engineType,final Integer fuelConsumption) {
		super();
		this.color = color;
		this.engineType = engineType;
		this.fuelConsumption = fuelConsumption;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public Integer getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(Integer fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	//CO2Ausstoﬂ
	//Teststand
	//Verbrauch Messen
	//CO2 Ausstoﬂ messen
	//bekommt drehzahl von teststand
	
}
