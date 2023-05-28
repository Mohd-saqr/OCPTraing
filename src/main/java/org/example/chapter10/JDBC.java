package org.example.chapter10;

import java.sql.*;

public class JDBC {
  static   Connection connection;
  static final String URL="jdbc:postgresql://localhost:5432/mydb";
  static final String USERNAME="postgres";
  static final String PASSWORD="javatest";
   static  {
       try{
           connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
       }catch (SQLException e){
           System.out.println(e.getMessage());
       }

    }

    public static void main(String[] args) {
       JDBC jdbc = new JDBC();
      // jdbc.executeQuery("insert into accounts values(3,'mohammed3','pass3','email3','2023-03-01 10:10:20')");
     //   jdbc.executeQuery("delete from accounts where user_id =3;");

        jdbc.executeQuery("select * from accounts");

    }

    /** ResultSet type
     * ResultSet_Type_Forward_ONLY // NO BACKWARD AND DONT SEE LAST DATA AND SUPPORTED MOST DRIVE
     * ResultSet_Type_iNSINSATIVE // GO BACKWARD AND DONT SEE LAST DATA AND SUPPORTED MOST DRIVE
     *  ResultSet_Type_SINSATIVE  // GO BACKWARD AND SEE LAST DATA NOT SUPPORTED MOTDRIVE
     */
    <T> T executeQuery(String query)   {
        Statement statement;
        try {
             statement =connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            boolean isResultSet=statement.execute(query);

             if (isResultSet){
                 ResultSet resultSet =statement.getResultSet();
                 resultSet.next();
                 resultSet.next();
                 resultSet.previous();
                 resultSet.afterLast();
                 resultSet.beforeFirst();
                 resultSet.last();
                 System.out.println(resultSet.getString(2));

             }
            System.out.println(statement.getUpdateCount());


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    return null;
    }

}
