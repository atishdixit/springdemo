package com.factory;

public class MainFactory {

	public static void main(String[] args) {
		ConnectionFactory factory = new ConnectionFactory();
		
		Connection mysqlConnection = factory.getConnection("MYSQL"); 
		mysqlConnection.connect();
		
		Connection postgreConnection = factory.getConnection("POSTGRE"); 
		postgreConnection.connect();
		
		Connection oracleConnection = factory.getConnection("ORACLE"); 
		oracleConnection.connect();
				
	}

}
