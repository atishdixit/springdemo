package com.encryption;

public class AesEncryptionStrategy implements EncryptionStrategy {

	@Override
	public void encryptData(String plainText) {
		System.out.println("Aes Encryption Strategy");
	}
}
