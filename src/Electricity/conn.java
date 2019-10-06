package Electricity;

import java.sql.*;

class conn {
    Connection c;
    Statement s;
    conn()
    {
        try{
            String url = "jdbc:sqlite:D:/IdeaProjects/Electricity/database/test.db";
            // create a connection to the database
            c = DriverManager.getConnection(url);
            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}
