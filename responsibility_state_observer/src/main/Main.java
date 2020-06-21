package main;

import client.Client;
import employee.CountryEmployee;
import employee.Employee;
import employee.ForeignEmployee;
import employee.LocalEmployee;
import shipment.Shipment;

public class Main {
	
	public static Employee getAvailableEmployees() {
		Employee localEmp = new LocalEmployee();
		Employee countryEmp = new CountryEmployee();
		Employee foreignEmp = new ForeignEmployee();
		
		foreignEmp.setNextEmployee(countryEmp);
		countryEmp.setNextEmployee(localEmp);
		return foreignEmp;
	}

	public static void main(String[] args) {

		Client client = new Client();
		Shipment localShipment = new Shipment("Local shipment", 1);
		Shipment countryShipment = new Shipment("Country shipment", 2);
		Shipment foreignShipment = new Shipment("Foreign shipment", 3);

		client.subscribe(getAvailableEmployees());
		
		client.sendShipment(localShipment);
		client.sendShipment(countryShipment);
		client.sendShipment(foreignShipment);
	}

}
