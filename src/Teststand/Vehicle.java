package Teststand;
/*
 * Abstrakte Klasse die von der Klasse Producer erbt und die Oberklasse der KLassen Tennis und M6 ist
 * 
 * sie besitzt einen String mit der Farbe
 * einen Enum mit dem Motortypen
 * einen Double mit dem Treibstoffverbrauch
 */
public abstract class Vehicle extends Producer {
	
	protected String engineType;
	protected String color;
	protected Double fuelConsumption;
	/*
	 * Getter Methode f�r den String Farbe 
	 */
	public String getColor() {
		return color;
	}
	/*
	 * Getter Methode f�r den String Motortyp, kann nur Benzin oder Diesel sein
	 */ 
	public String getEngineType() {
		return engineType;
	}
	
	
	/*
	 * Getter Methode f�r den Double des Treibstoffverbrauchs
	 */
	public Double getFuelConsumption() {
		return fuelConsumption;
	}
}
