package tk.blizz.jaxws;

import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(UserAdapter.class)
public interface User {
	String getName();

	Date getBirthday();
}
