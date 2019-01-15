package Teststand;

public abstract class Producer {
	
	private String vehicleType;
	private String producerName;
	
	public String getProducerName() {
		return producerName;
	}
	
	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
}
