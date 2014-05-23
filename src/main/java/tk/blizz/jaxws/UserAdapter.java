package tk.blizz.jaxws;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class UserAdapter extends XmlAdapter<UserImpl, User> {

	@Override
	public UserImpl marshal(User v) throws Exception {
		if (v instanceof UserImpl)
			return (UserImpl)v;
		else
			return new UserImpl(v);
	}

	@Override
	public User unmarshal(UserImpl v) throws Exception {
		return v;
	}

}
