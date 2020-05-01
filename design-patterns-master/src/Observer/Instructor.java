package Observer;

public class Instructor {
	Trainee trainee;
	public Instructor(Trainee trainee)
	{
		this.trainee = trainee;
	}
	public void ChangeTraining(String newTraining)
	{
		this.trainee.setTraining(newTraining);
	}
	

}
