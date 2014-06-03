package tk.blizz.jaxws;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "User")
public class UserImpl implements User, Serializable {
	@XmlAttribute
	private String name;
	@XmlAttribute
	private Date birthday;

	public UserImpl() {
	}

	public UserImpl(User u) {
		this.name = u.getName();
		this.birthday = u.getBirthday();
	}

	public UserImpl(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Date getBirthday() {
		return this.birthday;
	}

	@Override
	public String toString() {
		return String.format("%s@%x[name: %s, birthday: %s]", getClass().getName(), hashCode(), this.name, this.birthday == null ? "Null" : new SimpleDateFormat("yyyy-MM-dd").format(this.birthday));
	}
}
