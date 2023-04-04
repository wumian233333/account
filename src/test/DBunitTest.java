package test;

import unit.DBunit;

import java.sql.SQLException;

public class DBunitTest {
    public static void main(String[] args) throws SQLException {
         System.out.println(DBunit.getConnection());

    }
}
