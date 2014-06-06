package tk.blizz.jaxws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@WebService(endpointInterface = "tk.blizz.jaxws.HelloWorld", serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	private final List<User> users = new ArrayList<User>();

	{
		UserImpl user1 = new UserImpl(1, "User1", new Date(), null);
		UserImpl user2 = new UserImpl(2, "User2", new Date(), null);
		user2.setNext(user1);
		user1.setNext(user2);
		this.users.add(user1);
		this.users.add(user2);
	}

	@Override
	public String hello() {
		System.out.println("hello called");
		return "2货岱是岱2货";
	}

	@Override
	public String sayHello(String text) {
		System.out.println("sayHello called");
		return "Hello " + text;
	}

	@Override
	public String sayWorld(String text) {
		System.out.println("sayWorld called");
		return "World " + text;
	}

	@Override
	public User getUserByName(String name) {
		System.out.println("getUserByName called: name -> " + name);
		for (User u : this.users) {
			if (u.getName().equals(name))
				return u;
		}
		return null;
	}

	@XmlElementWrapper(name = "users")
	@XmlElement(name = "user")
	@Override
	public User[] getUsers() {
		System.out.println("getUsers called");
		return this.users.toArray(new User[this.users.size()]);
	}

}
