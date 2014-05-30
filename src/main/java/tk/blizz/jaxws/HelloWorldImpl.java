package tk.blizz.jaxws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@WebService(endpointInterface = "tk.blizz.jaxws.HelloWorld", serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	private List<User> users = new ArrayList<User>();

	{
		this.users.add(new UserImpl("User1", new Date()));
		this.users.add(new UserImpl("User2", new Date()));
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
		for (User u : this.users) {
			if (u.getName().equals(name))
				return u;
		}
		return null;
	}

	@XmlElementWrapper(name="users")
	@XmlElement(name="user")
	@Override
	public List<User> getUsers() {
		System.out.println("getUsers called");
		if (this.users != null)
			throw new NullPointerException();
		return this.users;
	}
}
