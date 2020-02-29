package com.encryption;

public class BlowfishEncrytionStrategy implements EncryptionStrategy {

	@Override
	public void encryptData(String plainText) {
		System.out.println("Blowfish Encrytion Strategy");
	}

}
