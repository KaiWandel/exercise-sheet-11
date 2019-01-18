package Teststand;
/*
 * Die Klasse Engine mit ihren initialisierten Variablen
 * 
 * sie besitzt einen String mit dem Treibstofftyp
 * einen Double mit dem Effizienzkoeffizienten
 * einen Integer mit der Drehzahl
 * einen Double mit dem Treibstoffverbrauch
 * einen Double mit dem CO2-Ausstoß 
 */
public class Engine {
	private String fuelType;
	private Double efficiency;
	private Integer rpm;
	private Double fuelConsumption;
	private Double carbonEmissions;
/*
 * Konstruktor für die Objekterzeugung aus der Klasse Engine
 * 
 * Im Konstruktor wird der String mit dem Treibstofftyp, 
 * der Double mit dem Effizienzkoeffizienten,
 * der Integer mit der Drehzahl,
 * der Double mit dem Treibstoffverbrauch und
 * der Double mit dem CO2-Ausstoß gesetzt
 */
	public Engine (final String fuelType, final Double efficiency, Integer rpm, Double fuelConsumption, Double carbonEmissions) {
		this.fuelType = fuelType;
		this.efficiency = efficiency;
		this.rpm =rpm;
		this.fuelConsumption = fuelConsumption;
		this.carbonEmissions = carbonEmissions;
	}
/*
 * Methode der Klasse Engine zur Berechnung des Treibstoffverbrauchs
 * 
 * Eine Methode, welche mit Hilfe der Drehzahl und dem Effizienzkoeffizienten den Treibstoffverbrauch berechnet 
 */
/*
 * @requires rpm ist initialisiert
 * @requires efficiency ist initialisiert
 * @requires fuelConsumption ist initialisiert
 * @requires rpm darf nicht null sein
 * @requires efficiency darf nicht null sein
 * 
 * @ensures fuelConsumption hat einen neuen Wert
 * 
 */
	public Double fuelConsumptionCalc() {
		fuelConsumption = rpm * 1/efficiency / 100;
		return fuelConsumption;
	}
/*
 * Methode der Klasse Engine zur Berechnung des CO2-Ausstoßes
 * 
 * Eine Methode, welche mit Hilfe der Drehzahl und dem Effizienzkoeffizienten den CO2-Ausstoß berechnet 
 */
/*
 * @requires rpm ist initialisiert
 * @requires efficiency ist initialisiert
 * @requires fuelConsumption ist initialisiert
 * @requires rpm darf nicht null sein
 * @requires efficiency darf nicht null sein
 * 
 * @ensures fuelConsumption hat einen neuen Wert
 *
 */	
	public Double carbonEmissionsCalc() {
		carbonEmissions = rpm * (1/efficiency) / 100 * 28.5;
		return carbonEmissions;
	}
/*
 * Setter Methode für den Double Effizienzkoeffizienten
 * 
 * Setter Methode zur Initialisierung eines Werts für den Double Effizienzkoeffizienten,
 * welcher zwischen 0 und 0.99 liegen muss,
 * außerhalb dieses Grenzbereichs wird eine Exception geworfen
 */
/*
 * @requires efficiency ist initialisiert
 * @ensures efficiency hat einen neuen Wert zwischen 0-0.99
 * 
 * @param efficiency muss zwischen 0-0.99 sein
 * @throws IllegalArgumentException wenn Wert nicht zwischen 0-0.99 liegt
 * 
 */	
	public void setEfficiency(double efficiency) {
		if (efficiency > 0 && efficiency < 1) {
			this.efficiency = efficiency; 
		} else {
			throw new IllegalArgumentException( "Efficiency nur zwischen 0 und 0.99" ); 
		}
	}
/*
 * Setter Methode für den String FuelType
 * 
 * Setter Methode zur Initialisierung eines Werts für den String FuelType,
 * welcher entweder "Diesel" oder "Benzin" sein muss,
 * bei einer anderen Eingabe wird eine Exception geworfen
 */
/*
 * @requires FuelType ist initialisiert
 * @ensures FuelType enthält entweder den String "Diesel" oder "Benzin"
 * 
 * @param efficiency muss entweder "Diesel" oder "Benzin" sein
 * @throws IllegalArgumentException wenn der String nicht "Diesel" oder "Benzin" ist
 * 
 */	
	public void setFuelType(String fuelType ) {
		if (fuelType == "Diesel" ||fuelType == "Benzin") {
			this.fuelType = fuelType;
		} else {
			throw new IllegalArgumentException( "Muss entweder Benzin oder Diesel sein" ); 
		}
	}
/*
 * Getter Methode für den String Treibstofftyp, kann nur Benzin oder Diesel sein
 */
	public String getFuelType() {
		return fuelType;
	}
/*
 * Getter Methode für den Double Effizienzkoeffizienten, kann nur zwischen 0-0.99 liegen
 */
	public Double getEfficiency() {
		return efficiency;
	}
/*
 * Getter Methode für den Double Treibstoffverbrauch
 */
	public Double getFuelConsumption() {
		return fuelConsumption;
	}
/*
 * Getter Methode für den Double CO2-Ausstoß
 */	
	public Double getCarbonEmissions() {
		return carbonEmissions;
	}
/*
 * Setter Methode für den Double CO2-Ausstoß
 */
	public void setCarbonEmissions(Double carbonEmissions) {
		this.carbonEmissions = carbonEmissions;
	}
}
