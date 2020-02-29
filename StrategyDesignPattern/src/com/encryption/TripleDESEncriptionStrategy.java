package com.encryption;

public class TripleDESEncriptionStrategy implements EncryptionStrategy {

	@Override
	public void encryptData(String plainText) {
		System.out.println("TripleDES Encription Strategy");
	}

}
