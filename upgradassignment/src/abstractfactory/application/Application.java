package abstractfactory.application;

import abstractfactory.Connection;
import abstractfactory.connectionfactory.ConnectionFactory;

public class Application {

  private final ConnectionFactory connectionFactory;

  public Application(ConnectionFactory connectionFactory) {
    this.connectionFactory = connectionFactory;
  }

  public void start() {
    Connection connection = connectionFactory.getConnection();
    connection.connect();
  }

}