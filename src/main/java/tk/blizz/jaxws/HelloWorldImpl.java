package tk.blizz.jaxws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "tk.blizz.jaxws.HelloWorld", serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	private List<User> users = new ArrayList<User>();

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
	public List<User> getUsers() {
		System.out.println("getUsers called");
		return this.users;
	}

}
