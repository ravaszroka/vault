package ss.vault.model;

public class VaultException extends Exception {
	public VaultException(String message) {
		super(message);
	}
	
	public VaultException(String message, Exception cause) {
		super(message, cause);
	}
}
