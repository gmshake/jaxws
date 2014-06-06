package tk.blizz.jaxws;

import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(UserAdapter.class)
public interface User {
	Integer getId();

	String getName();

	Date getBirthday();

	User getNext();
}
