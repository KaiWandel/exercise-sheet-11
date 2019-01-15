package Teststand;

public class M6 extends Vehicle {

	public M6(final String color,final String engineType,final Integer fuelConsumption) {
		super();
		this.color =  color;
		this.engineType = engineType;
		this.fuelConsumption = fuelConsumption;
		this.vehicleType = "M6";
		this.producerName = "SMW";		
	}
	public static void main(String[] args) {
		Vehicle Vehicle1 = new M6( "Blue", "Benzin", 3 );
		Vehicle Vehicle2 = new Tennis("Red", "Diesel", 4);
		System.out.print(Vehicle1.getColor());
		System.out.print(Vehicle1.getEngineType());
		System.out.print(Vehicle1.getVehicleType());
		System.out.print(Vehicle1.getProducerName());
		System.out.print(Vehicle1.getFuelConsumption());
		System.out.print(Vehicle2.getColor());
		System.out.print(Vehicle2.getEngineType());
		System.out.print(Vehicle2.getVehicleType());
		System.out.print(Vehicle2.getProducerName());
		System.out.print(Vehicle2.getFuelConsumption());
		
	}
}
