package src.com.markerinterface.sensitivedata;

public class EncryptionTest {
	public static void main(String[] args) {
		UserCredentials creds = new UserCredentials("anuj", "password123");

		UserProfile profile = new UserProfile("Anuj", "anuj@gmail.com");

		EncryptionService.encrypt(creds);
		EncryptionService.encrypt(profile);
	}
}