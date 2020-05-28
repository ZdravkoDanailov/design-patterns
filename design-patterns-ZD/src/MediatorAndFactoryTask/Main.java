package MediatorAndFactoryTask;

public class Main {

	public static void main(String[] args) {
		Factory factory = new MainFactory();
		User firstUser = factory.createUser("Gosho");
		User secondUser = factory.createUser("Ivan");
		User thirdUser = factory.createUser("Pesho");
		User anotherUser = factory.createUser("Penka");

		ChatRoom.AddUser(firstUser);
		ChatRoom.AddUser(secondUser);
		ChatRoom.AddUser(thirdUser);
		
		firstUser.sendMessage("My name is Gosho!");
		secondUser.sendMessage("Hi Gosho!");
		thirdUser.sendMessage("Hi Gosho!");

		anotherUser.sendMessage("Hi!");
		
		//No bot is added so users can use the cat word
		firstUser.sendMessage("Do u guys love cats?");
		secondUser.sendMessage("addBot");
		//No more cats says Bot!
		thirdUser.sendMessage("Yeah cats are great, I have a cat at home!");
		//Pesho not in chat anymore
		thirdUser.sendMessage("another message!");




	}

}
