package ba.bitcamp.benjamin.server;

import java.sql.*;

import org.sqlite.SQLiteConnection;

public class SQLiteJDBC
{
  public static void main( String args[] )
  {
    org.sqlite.SQLiteConnection c = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = (SQLiteConnection) DriverManager.getConnection("jdbc:sqlite:test.db");
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Opened database successfully");
  }
}