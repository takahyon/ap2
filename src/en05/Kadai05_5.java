/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author takamasa
 */
public class Kadai05_5 {
     public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
        String driverUrl="jdbc:derby://localhost/twitter";
        Connection con = DriverManager.getConnection(driverUrl, "db", "db");
                
        String sql = "select * from T_TWEET where tweetdate> ? ";
        Calendar cal = Calendar.getInstance();
        Timestamp tm =new Timestamp(cal.getTimeInMillis());
        
        PreparedStatement ps =con.prepareStatement(sql);
        
        int count =0;
        ps.setTimestamp(1, tm);
        count += ps.executeUpdate();
        
}
     private Date tweetTime;
     
     public void setTime(String tm){
         try{
             SimpleDateFormat sdf = new SimpleDateFormat();
             Date date = sdf.parse(tm);
             this.tweetTime = date;
         }catch (ParseException e ){
             e.printStackTrace();
         }
     }
     public Date getTime(){
         
     return tweetTime;
     }
}

