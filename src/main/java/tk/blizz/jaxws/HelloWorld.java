package tk.blizz.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public interface HelloWorld {
	@WebMethod
	String hello();

	@WebMethod
	String sayHello(String text);

	@WebMethod
	String sayWorld(String text);

	@WebMethod
	User getUserByName(String name);

	@WebMethod()
	User[] getUsers();
}
