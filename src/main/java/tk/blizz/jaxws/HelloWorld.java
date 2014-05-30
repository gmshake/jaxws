package tk.blizz.jaxws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@WebService
public interface HelloWorld {
	@WebMethod
	String hello();

	@WebMethod
	String sayHello(String text);

	@WebMethod
	String sayWorld(String text);

	@WebMethod
	@XmlJavaTypeAdapter(UserAdapter.class)
	User getUserByName(String name);

	@WebMethod
	List<User> getUsers();
}
