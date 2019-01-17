package Teststand;

/*
 * Abstrakte Klasse Producer
 * Oberklasse von Vehicle
 * 
 * KLasse die Getter Methode besitzt und einen Fahrzeug Typ und einen Hersteller namen als String enthält
 */
public abstract class Producer {
	
	protected String vehicleType;
	protected String producerName;
	/*
	 * getter Methode für den String des Herstellernamen
	 */
	public String getProducerName() {
		return producerName;
	}
	/*
	 * getter Methode für den String des Fahrzeug Typen
	 */
	public String getVehicleType() {
		return vehicleType;
	}
}