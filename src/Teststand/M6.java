package Teststand;
/*
 * Die Klasse M6 welche von ihrer Oberklasse Vehicle erbt,
 * 
 * sie erbt folgende Attribute von Vehicle: 
 * einen String mit der Farbe
 * einen String mit dem Motortyp, kann entweder Benzin oder Diesel sein
 * 
 * Variablen der Klasse Tennis sind:
 * einen String mit dem Fahrzeugtyp, welcher mit dem String "M6" gesetzt ist
 * einen String mit dem Herstellername, welcher mit dem String "SMW" gesetzt ist
 */
public class M6 extends Vehicle {
/*
 * Konstruktor für die Objekterzeugung aus der Klasse M6
 * 
 * Im Konstruktor wird der String mit der Farbe, 
 * der String mit dem Motortyp,
 * der String mit dem Fahrzeugtyp, welcher mit dem String "M6" gesetzt ist,
 * der String mit dem Herstellername, welcher mit dem String "SMW" gesetzt ist
 */
	public M6(final String color,final String engineType,final Double fuelConsumption) {
		super();
		this.color =  color;
		this.fuelConsumption = fuelConsumption;
		this.engineType = engineType;
		this.vehicleType = "M6";
		this.producerName = "SMW";		
	}
}
