package Teststand;

public class M6 extends Vehicle {

	public M6(final String color,final EngineType engineType,final Double fuelConsumption) {
		super();
		this.color =  color;
		this.fuelConsumption = fuelConsumption;
		this.vehicleType = "M6";
		this.producerName = "SMW";		
	}
	public static void main(String[] args) {
		Vehicle Vehicle1 = new M6( "Blue", EngineType.BENZIN, 3.4 );
		Vehicle Vehicle2 = new Tennis("Red", EngineType.DIESEL , 4.7);
		System.out.print(Vehicle1.getColor());
		//System.out.print(Vehicle1.getEngineType());
		System.out.print(Vehicle1.getVehicleType());
		System.out.print(Vehicle1.getProducerName());
		System.out.print(Vehicle1.getFuelConsumption());
		System.out.print(Vehicle2.getColor());
		//System.out.print(Vehicle2.getEngineType());
		System.out.print(Vehicle2.getVehicleType());
		System.out.print(Vehicle2.getProducerName());
		System.out.print(Vehicle2.getFuelConsumption());
		
	}
}
