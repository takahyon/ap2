/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en05;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author takamasa
 */
public class Kadai05_2 {

    public static void main(String[] args) throws SQLException {
        
        String driverUrl="jdbc:derby://localhost/twitter";
        Connection con = DriverManager.getConnection(driverUrl, "db", "db");
                
        String sql = "insert into T_TWEET"
                + "(twitter_id,tweettext,iine) values (?,?,?)";

        PreparedStatement ps =con.prepareStatement(sql);
        
        ps.setString(1, "abc");
        ps.setString(2, "美味しい！");
        ps.setInt(3, 5);
        
        
        int count = ps.executeUpdate();
    }

}
