package tk.blizz.jaxws.client;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import tk.blizz.jaxws.HelloWorld;
import tk.blizz.jaxws.User;

public class Client {
	private static final QName SERVICE_NAME = new QName("http://jaxws.blizz.tk/", "HelloWorld");
	private static final QName PORT_NAME = new QName("http://jaxws.blizz.tk/", "HelloWorldPort");

	private Client() {
	};

	public static void main(String[] args) {
		String endpointAddress = "http://localhost:8080/jaxws/services/hello_world";

		Service service = Service.create(SERVICE_NAME);
		service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, endpointAddress);

		HelloWorld hw = service.getPort(HelloWorld.class);

		//System.out.println(hw.hello());

		//System.out.println(hw.sayHello("Text1"));

		//System.out.println(hw.sayWorld("Text2"));

		//System.out.println(hw.getUserByName("User2"));

		for (User u : hw.getUsers()) {
			System.out.println(u);
		}

	}
}
