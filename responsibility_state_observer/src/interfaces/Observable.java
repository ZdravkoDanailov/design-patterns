package interfaces;

import shipment.Shipment;

public interface Observable {
	
	public void subscribe(Observer observer);
	
	public void unsubscribe(Observer observer);
	
	public void notifyObservers();
	
	public Shipment getUpdate();
	
}
