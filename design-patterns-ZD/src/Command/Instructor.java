package Command;

public class Instructor {

	private Command command;	

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void ChangeTraining() {
		System.out.println("Instructor changed training");
		this.command.execute();
	}
}
