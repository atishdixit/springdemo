package com.encryption;

public class Encryptor {
	private EncryptionStrategy strategy;
	private String plainText;

	public Encryptor(EncryptionStrategy strategy) {
		this.strategy = strategy;
	}

	public void encrypt() {
		this.strategy.encryptData(plainText);
	}
	
	public EncryptionStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(EncryptionStrategy strategy) {
		this.strategy = strategy;
	}

	public String getPlainText() {
		return plainText;
	}

	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}	
}
