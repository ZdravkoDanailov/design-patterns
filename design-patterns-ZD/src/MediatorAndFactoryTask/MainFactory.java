package MediatorAndFactoryTask;

public class MainFactory extends Factory{
	public MainFactory() {
		botFactory = new BotFactory();
		userFactory = new UserFactory();
	}
}
