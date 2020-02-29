package abstractfactory.connectionfactory;

import abstractfactory.Connection;
import abstractfactory.PostgreSqlConnection;

public class PostgreSqlConnectionFactory implements ConnectionFactory {

  @Override
  public Connection getConnection() {
    return new PostgreSqlConnection();
  }

}