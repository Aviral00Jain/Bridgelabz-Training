package src.com.markerinterface.sensitivedata;

public class UserCredentials implements SensitiveData {
	String username;
	String password;

	public UserCredentials(String username, String password) {
		this.username = username;
		this.password = password;
	}
}