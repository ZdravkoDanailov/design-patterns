package employee;

import client.Client;
import shipment.Shipment;

public class CountryEmployee extends Employee {

	public CountryEmployee() {
		this.location = Employee.COUNTRY;
		this.setName("Country Employee");
	}

	@Override
	public Shipment getUpdate() {
		return ((Client) this.client).getShipment();
	}
}
