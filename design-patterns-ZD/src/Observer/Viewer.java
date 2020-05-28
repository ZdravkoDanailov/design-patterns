package Observer;
public class Viewer implements IObserver {
	private String training;
	private IObservable trainee;
	
	public Viewer() {
	}

	@Override
	public void update() {
		if(trainee == null) {
			System.out.println("No trainee");
			return;
		}
		
		training = trainee.getUpdate();
		System.out.println("Viewer changed training to "+ this.training);
		
	}

	@Override
	public void setTrainee(IObservable trainee) {
		this.trainee = trainee;
	}
	
	public String getTraining() {
		return this.training;
	}

	public void setTraining(String training) {
		this.training = training;
	}


}
