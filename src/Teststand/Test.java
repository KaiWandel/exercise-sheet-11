package Teststand;

public class Test extends Teststand {
	private Integer rpm;
	private String testName;
	Integer[] TestDrehzahlen = new Integer[] {1000,2000,3000,4000,5000,6000};
	public Test(Integer rpm, String testName) {
		super();
		this.rpm = rpm;
		this.testName = testName;
	}


	public Integer getRpm() {
		return rpm;
	}

	public Double CO2Test() {
		
	}
}

public static void main (String[] args) {
	Vehicle Vehicle1 = new M6( "Blue", "BENZIN" , 3.4 );
	Engine Engine1 = new Engine("BENZIN" , 0.8 , 0, 0.0, 0.0 );
}