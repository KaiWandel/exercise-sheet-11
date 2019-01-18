package Teststand;

public class Test extends Teststand {
	
	public static void main(String[] args) {
		// Testfahrzeug erstellen
		
		// Motor erzeugen
		// Fahrzeug einen Test zuordnen
		// Motor über Fahrzeug die Inputdaten des Teststands empfangen lassen
		// Motor Inoutdaten verarbeiten lassen und CO2 Wert an das Fahrzeug weiterleiten
		// Fahrzeug übermittelt CO2 Wert an teststand
		// neues Fahrzeug oder Inputdaten erstellen
		Vehicle Vehicle1 = new M6( "Blue", "BENZIN" , 3.4 );
		Engine Engine1 = new Engine("BENZIN" , 0.8 , 0, 0.0, 0.0 );
	}
	public Double CO2Test() {
		for (Integer rpm : TestDrehzahlen) {
			double Ergebnis = Engine.carbonEmissionsCalc();
			return Ergebnis;
		}
	}
}