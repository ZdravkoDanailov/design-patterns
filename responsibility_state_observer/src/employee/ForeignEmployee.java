package employee;

import client.Client;
import shipment.Shipment;

public class ForeignEmployee extends Employee {

	public ForeignEmployee() {
		this.location = Employee.FOREIGN;
		this.setName("Foreign Employee");
	}

	@Override
	public Shipment getUpdate() {
		return ((Client) this.client).getShipment();
	}

}
