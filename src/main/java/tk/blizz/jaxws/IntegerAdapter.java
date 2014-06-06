package tk.blizz.jaxws;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class IntegerAdapter extends XmlAdapter<String, Integer> {

	@Override
	public String marshal(Integer i) throws Exception {
		return i == null ? null : i.toString();
	}

	@Override
	public Integer unmarshal(String s) throws Exception {
		return Integer.parseInt(s);
	}

}
