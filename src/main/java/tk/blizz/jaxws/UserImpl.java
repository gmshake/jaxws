package tk.blizz.jaxws;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User")
public class UserImpl implements User, Serializable {
	@XmlID
	@XmlJavaTypeAdapter(IntegerAdapter.class)
	private Integer id;

	private String name;

	private Date birthday;

	@XmlIDREF
	private User next;

	public UserImpl() {
	}

	public UserImpl(User u) {
		this.id = u.getId();
		this.name = u.getName();
		this.birthday = u.getBirthday();
		this.next = u.getNext();
	}

	public UserImpl(Integer id, String name, Date birthday, User next) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.next = next;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	public User getNext() {
		return this.next;
	}

	public void setNext(User next) {
		this.next = next;
	}

	@Override
	public String toString() {
		if (this.next != null)
			return String.format("%s@%x[id: %d, name: %s, birthday: %s, next: %s@%x]", getClass().getName(), hashCode(), this.id, this.name, this.birthday == null ? "Null" : new SimpleDateFormat("yyyy-MM-dd").format(this.birthday), this.next.getClass().getName(), this.next.hashCode());
		else
			return String.format("%s@%x[id: %d, name: %s, birthday: %s, next: null]", getClass().getName(), hashCode(), this.id, this.name, this.birthday == null ? "Null" : new SimpleDateFormat("yyyy-MM-dd").format(this.birthday));
	}
}
