package no.itfakultetet.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Pg {

    private String tableName, fieldNames, sql;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(String fieldNames) {
        this.fieldNames = fieldNames;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public void makeTable() {

    Connection c = null;
    Statement stmt = null;
      try {
        Class.forName("org.postgresql.Driver");
        c = DriverManager
                .getConnection("jdbc:postgresql://noderia.com:5432/terje",
                        "terje", "terry432a");
        System.out.println("Opened database successfully");

        stmt = c.createStatement();
        String sql = "CREATE TABLE "+tableName+ " " +
                "("+fieldNames+")";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    } catch ( Exception e ) {
        System.err.println( e.getClass().getName()+": "+ e.getMessage() );
        System.exit(0);
    }
      System.out.println("Table created successfully");
    } // end makeTable
}
