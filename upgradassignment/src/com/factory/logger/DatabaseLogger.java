package com.factory.logger;
public class DatabaseLogger implements Logger {

  @Override
  public void log(String message) {
    System.out.println("Logging to database: " + message);
  }

}