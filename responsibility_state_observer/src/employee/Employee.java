package employee;

import java.util.ArrayList;
import java.util.List;

import interfaces.Observable;
import interfaces.Observer;
import interfaces.EmployeeObservable;
import interfaces.EmployeeObserver;
import shipment.Shipment;
import storage.StorageWorker;

public abstract class Employee implements Observer, EmployeeObservable {

	public static int LOCAL = 1;
	public static int COUNTRY = 2;
	public static int FOREIGN = 3;

	public static int READY_STATUS = 4;
	public static int PROCESSING_STATUS = 5;

	protected int status;
	protected Employee nextEmployee;
	protected Observable client;
	protected EmployeeObserver storageWorker = new StorageWorker();
	private String name;
	protected int location;

	public void setNextEmployee(Employee nextEmployee) {
		this.nextEmployee = nextEmployee;
	}

	public void recieveShipment(Shipment shipment) {
		if (shipment.getLocation() == this.location) {

			System.out.println(this.getName() + " will be processing your shipment (" + shipment.getName() + ").");
			this.setStatus(PROCESSING_STATUS);
		}

		if (this.nextEmployee != null) {
			this.nextEmployee.recieveShipment(shipment);
		}
	}

	@Override
	public void setClient(Observable client) {
		this.client = client;
	}

	@Override
	public void update() {
		if (client == null) {
			System.out.println("No client");
			return;
		}

		Shipment shipment = client.getUpdate();

		recieveShipment(shipment);
	}

	public void setStatus(int status) {
		this.status = status;

		if (this.status == PROCESSING_STATUS)
			this.notifyObservers();
	}

	@Override
	public void notifyObservers() {
		storageWorker.setEmployee(this);
		this.storageWorker.update();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
