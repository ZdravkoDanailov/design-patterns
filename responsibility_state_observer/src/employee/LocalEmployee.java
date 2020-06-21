package employee;

import client.Client;
import shipment.Shipment;

public class LocalEmployee extends Employee {

	public LocalEmployee() {
		this.location = Employee.LOCAL;
		this.setName("Local Employee");
	}

	@Override
	public Shipment getUpdate() {
		return ((Client) this.client).getShipment();
	}

}
