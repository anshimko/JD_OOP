package by.htp.les01.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class DBResourceManager {
	
	private final static DBResourceManager instance = new DBResourceManager();
	private ResourceBundle boundle = ResourceBundle.getBundle("resources.dp", Locale.ENGLISH);
	
	public static DBResourceManager getInstance () {
		return instance;
	}
	
	public String getValue (String key) {
		return boundle.getString(key);
	}

}
