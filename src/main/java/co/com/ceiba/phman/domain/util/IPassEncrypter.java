package co.com.ceiba.phman.domain.util;

public interface IPassEncrypter {
	
	public String encrypt(String password);
	
	public String decrypt(String hash);
}
