package com.encryption;

public class Application {

	public static void main(String[] args) {

		EncryptionStrategy aesEncryptionStrategy = new AesEncryptionStrategy();
		Encryptor aesEncryptor = new Encryptor(aesEncryptionStrategy);
		
		aesEncryptor.setPlainText("This is plain text");
		aesEncryptor.encrypt();
	}

}
