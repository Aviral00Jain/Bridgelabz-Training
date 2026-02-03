package src.com.markerinterface.sensitivedata;

public class EncryptionService {
	public static void encrypt(Object obj) {
		if (obj instanceof SensitiveData) {
			System.out.println("🔒 Sensitive data encrypted");
			// encryption logic here
		} else {
			System.out.println("ℹ️ No encryption required");
		}
	}
}