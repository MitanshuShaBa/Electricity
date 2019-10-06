package Electricity;

import java.sql.ResultSet;

public class test_con {
    public static void main(String[] args) {
        try{
            conn c1 = new conn();
            String a  = "admin";
            String b  = "12345";
            String q  = "select * from login where username = '"+a+"' and password = '"+b+"'";
            ResultSet rs = c1.s.executeQuery(q);
            if (rs.next())
                System.out.println(rs.getString(1)+rs.getString(2));
        }catch(Exception e){
            System.out.println("error: "+e);
        }
    }
}
