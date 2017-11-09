package Model;

import java.util.ArrayList;

public class LogActivity {
	private ArrayList<LogList> list;
	
	public LogActivity() {
		list = new ArrayList<>();
	}
	
	public boolean addLogList(LogList log) {
		return list.add(log);
	}
	
	public LogList getLogById(String id) {
		return null;
	}
	
	public ArrayList<LogList> getAllLog(){
		return list;
	}
	
}
