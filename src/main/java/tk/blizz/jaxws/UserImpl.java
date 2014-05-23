package tk.blizz.jaxws;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "User")
public class UserImpl implements User {
	private String name;
	private Date birthday;

	public UserImpl() {
	}

	public UserImpl(User u) {
		this.name = u.getName();
		this.birthday = u.getBirthday();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Date getBirthday() {
		return this.birthday;
	}

}
