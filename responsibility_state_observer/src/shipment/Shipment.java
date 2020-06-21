package shipment;

public class Shipment {

	private String name;
	private int location;
	
	public Shipment(String name, int location) {
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return this.name;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

}
