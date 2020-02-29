package com.factory;

public class OracleConnection implements Connection {

	@Override
	public void connect() {
		 System.out.println("Connecting to oracle...");
	}

}
