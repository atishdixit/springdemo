package com.factory;


public class ConnectionFactory {
	private final String CONNECTION_MYSQL="MYSQL";
	private final String CONNECTION_POSTGRE="POSTGRE";
	private final String CONNECTION_ORACLE="ORACLE";
	
	public Connection getConnection(String connectionType) {
		
		if(CONNECTION_MYSQL.equals(connectionType)) {
			return new MySqlConnection();
			
		}else if(CONNECTION_POSTGRE.equals(connectionType)) {
			return new PostgreConnection();
			
		} else if(CONNECTION_ORACLE.equals(connectionType)) {
			return new OracleConnection();
		}
		
		return null;
	}
	
}
