package MediatorAndFactoryTask;

public class UserFactory {
	public User createUser(String name)
	{
		return new User(name);
	}
}
