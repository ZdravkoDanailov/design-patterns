package MediatorAndFactoryTask;

public abstract class Factory {
	protected UserFactory userFactory;
	protected BotFactory botFactory;
	
	public User createUser(String name)
	{
		return userFactory.createUser(name);		
	}
	public Bot createBot()
	{
		return botFactory.createBot();
	}

}
