package interfaces;

import shipment.Shipment;

public interface EmployeeObservable {
	
	public void notifyObservers();
	
	public Shipment getUpdate();
	
}
