package client;

import java.util.ArrayList;
import java.util.List;

import employee.Employee;
import interfaces.Observable;
import interfaces.Observer;
import shipment.Shipment;

public class Client implements Observable {

	private List<Observer> employees = new ArrayList<Observer>();
	private Shipment shipment;
	private String name;

	public void sendShipment(Shipment shipment) {
		System.out.println(shipment.getName() + " is waiting for processing!");
		this.setShipment(shipment);
		notifyObservers();
	}

	@Override
	public void subscribe(Observer employee) {
		this.employees.add(employee);
		employee.setClient(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.employees.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : employees) {
			observer.update();
		}
	}

	@Override
	public Shipment getUpdate() {
		return this.shipment;
	}

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
