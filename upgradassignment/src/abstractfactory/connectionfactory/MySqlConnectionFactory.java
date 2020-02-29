package abstractfactory.connectionfactory;

import abstractfactory.Connection;
import abstractfactory.MySqlConnection;

public class MySqlConnectionFactory implements ConnectionFactory {

  @Override
  public Connection getConnection() {
    return new MySqlConnection();
  }
}