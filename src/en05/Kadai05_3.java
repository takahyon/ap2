/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author takamasa
 */
public class Kadai05_3 {
    public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
         String driverUrl="jdbc:derby://localhost/twitter";
        Connection con = DriverManager.getConnection(driverUrl, "db", "db");
                
        String sql = "insert into T_TWEET"
                + "(twitter_id,tweettext,iine) values (?,?,?)";
        
        PreparedStatement ps =con.prepareStatement(sql);
        
        BufferedReader br =new BufferedReader
        (new FileReader(new File("tweet53.csv")));
        
        String line;
        int count=0;
        while((line = br.readLine())!=null){
            
            String[] word = line.split(",");
            
            ps.setString(1, word[0]);
            ps.setString(2,(word[1]));
            ps.setInt(3, Integer.parseInt(word[2]));
            
            count += ps.executeUpdate();
        }
        
    }
    
}
