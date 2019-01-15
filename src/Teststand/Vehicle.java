package Teststand;

public class Vehicle extends Producer {

	private String vehicleType;
	private String producerName;
	private String color;
	private Integer Verbrauch;
	private String engineType;
	private Integer fuelconsumption;
	
	public Vehicle(String vehicleType, String producerName, String color) {
		super();
		this.color = color; 
		this.vehicleType = vehicleType;
		this.producerName = producerName;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Integer getVerbrauch() {
		return Verbrauch;
	}

	public void setVerbrauch(Integer verbrauch) {
		Verbrauch = verbrauch;
	}

	//Motor
	//Verbrauch
	//CO2Ausstoﬂ
	//Teststand
	//Verbrauch Messen
	//CO2 Ausstoﬂ messen
	//bekommt drehzahl von teststand
	
}
