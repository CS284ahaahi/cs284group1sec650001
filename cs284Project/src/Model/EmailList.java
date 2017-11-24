package Model;

import java.util.HashMap;

public class EmailList {
	public HashMap<String, String> list;

	public EmailList() {
		this.list = new HashMap<>();
	}

	public void addEmail(String id, String email) {
		list.put(id, email);
	}
}
