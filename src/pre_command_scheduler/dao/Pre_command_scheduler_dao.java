/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pre_command_scheduler.dao;

import java.sql.*;
/**
 *
 * @author kazuki
 */
public class Pre_command_scheduler_dao {
    
    
    public static void testSql() throws ClassNotFoundException, SQLException{
        Connection conn = null;
        Statement statement = null;
        
        try{
            Class.forName("org.postgresql.Driver");
        }catch(ClassNotFoundException e){
         e.printStackTrace();
        }
            
//        try{
//            conn = DriverManager.getConnection("jdbc:postgresql:5432", "postgres", "password");
//            Statement stmt = conn.createStatement();
//            ResultSet rset = stme.executeQuery("select * from ")
//        }
        
}
    
    
    
    
}
