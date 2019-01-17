package Teststand;

/*
 * Abstrakte Klasse Producer
 * Oberklasse von Vehicle
 * 
 * KLasse die Getter Methode besitzt und einen Fahrzeug Typ und einen Hersteller namen als String enth�lt
 */
public abstract class Producer {
	
	protected String vehicleType;
	protected String producerName;
	/*
	 * getter Methode f�r den String des Herstellernamen
	 */
	public String getProducerName() {
		return producerName;
	}
	/*
	 * getter Methode f�r den String des Fahrzeug Typen
	 */
	public String getVehicleType() {
		return vehicleType;
	}
}