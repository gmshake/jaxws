package tk.blizz.jaxws;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
	String sayHello(String text);

	String sayWorld(String text);

	List<User> getUsers();
}
