package MediatorAndFactoryTask;

import java.util.ArrayList;

public class ChatRoom {
	private static ArrayList<User> users = new ArrayList();
	private static Bot bot;
	private static MainFactory factory = new MainFactory();
	
	public static void showMessage(User user, String message){
		if(!users.contains(user)){
			System.out.println("System: "+ user.getName()+ " join the chatroom first!");
			return;
		}	
		
		System.out.println("[" + user.getName()+"] "+ ": " + message);
		
		if(bot != null && message.contains("cat")){
			bot.removeUser(user);
			bot.printMessage();			
		}		
		else if(message.equalsIgnoreCase("addBot")){
			bot = factory.createBot();		
		}
	}
	public static void AddUser(User user) {
		if(user!= null) {
			users.add(user);
		}
	}
	public static void RemoveUser(User user) {
		if(user!= null && users.contains(user)) {
			users.remove(user);
			System.out.println(user.getName() + " has been removed from the chat!");
		}
	}
}