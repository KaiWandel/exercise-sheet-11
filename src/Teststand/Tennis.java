package Teststand;

public class Tennis extends Vehicle{
/*
 * Die Klasse Tennis welche von ihrer Oberklasse Vehicle erbt,
 * 
 * sie erbt folgende Attribute von Vehicle: 
 * einen String mit der Farbe
 * einen String mit dem Motortyp, kann entweder Benzin oder Diesel sein
 * 
 * Variablen der Klasse Tennis sind:
 * einen String mit dem Fahrzeugtyp, welcher mit dem String "Tennis" gesetzt ist
 * einen String mit dem Herstellername, welcher mit dem String "IW" gesetzt ist
 */
	public Tennis(final String color,final String engineType ,final Double fuelConsumption) {
		super();
		this.color =  color;
		this.fuelConsumption = fuelConsumption;
		this.engineType = engineType;
		this.vehicleType = "Tennis";
		this.producerName = "IW";

	}
}
