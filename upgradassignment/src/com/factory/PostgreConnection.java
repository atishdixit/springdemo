package com.factory;

public class PostgreConnection implements Connection {

  @Override
  public void connect() {
    System.out.println("Connecting to PostgreSQL...");
  }

}