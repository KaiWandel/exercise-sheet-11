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
/**
 * @requires rpm ist initialisiert
 * @requires efficiency ist initialisiert
 * @requires fuelConsumption ist initialisiert
 * @requires rpm != 0
 * @requires efficiency != 0
 * 
 * @ensures fuelConsumption hat einen neuen Wert
 * @return
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
/**
 * @requires rpm ist initialisiert
 * @requires efficiency ist initialisiert
 * @requires fuelConsumption ist initialisiert
 * @requires rpm != 0
 * @requires efficiency != 0
 * 
 * @ensures fuelConsumption hat einen neuen Wert
 * @return
 */	
	public Double carbonEmissionsCalc() {
		carbonEmissions = rpm * (1/efficiency) / 100 * 28.5;
		return carbonEmissions;
	}
/*
 * Setter Methode für den Double efficiency
 * 
 * Setter Methode zur Initialisierung eines Werts für den Double efficiency,
 * welcher zwischen 
 */
/**
 * @requires rpm ist initialisiert
 * @requires efficiency ist initialisiert
 * @requires fuelConsumption ist initialisiert
 * @requires rpm != 0
 * @requires efficiency != 0
 * 
 * @ensures fuelConsumption hat einen neuen Wert
 * @return
 */	
	public void setEfficiency(double efficiency) {
		if (efficiency > 0 && efficiency < 1) {
			this.efficiency = efficiency; 
		} else {
			throw new IllegalArgumentException( "Efficiency nur zwischen 0 und 0.99" ); 
		}
	}
	public void setFuelType(String fuelType ) {
		if (fuelType == "Diesel" ||fuelType == "Benzin") {
			this.fuelType = fuelType;
		} else {
			throw new IllegalArgumentException( "Muss entweder Benzin oder Diesel sein" ); 
		}
	}
	public String getFuelType() {
		return fuelType;
	}
	public Double getEfficiency() {
		return efficiency;
	}
		public Double getFuelConsumption() {
		return fuelConsumption;
	}
	
	public Double getCarbonEmissions() {
		return carbonEmissions;
	}
	public void setCarbonEmissions(Double carbonEmissions) {
		this.carbonEmissions = carbonEmissions;
	}
}
