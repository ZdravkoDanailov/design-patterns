package Observer;

public interface IObservable {
	public void subscribe(IObserver observer);
	public void unsubscribe(IObserver observer);
	public void notifyObservers();
	public String getUpdate();

}
