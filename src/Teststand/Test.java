package Teststand;
/*
 * Die Klasse Test, welche von der Oberklasse Teststand erbt
 */
public class Test extends Teststand {
/*
 * Methode der Klasse Test zur vergabe von einer Drehzahl und der anschließenden Berechnung des CO2-Ausstoßes
 * 
 * Eine Methode, welche mit Hilfe einer gesetzten Drehzahl und der Methode zur Berechnung des CO2-Ausstoßes der Klasse Engine
 * den CO2-Ausstoß berechent udn diesen ausgibt
 */	
	public Double CO2Test() {
		for (Integer rpm : TestDrehzahlen) {
			double Ergebnis = Engine.carbonEmissionsCalc();
			return Ergebnis;
		}
	}
}