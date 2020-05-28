package Command;

public class StaniCommand implements Command{
	private Trainee trainee;
	
	public StaniCommand(Trainee trainee) {
		this.trainee = trainee;
	}
	@Override
	public void execute() {
		trainee.setTraining("Stani");
	}
}
