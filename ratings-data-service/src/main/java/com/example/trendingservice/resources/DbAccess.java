package com.example.trendingservice.resources;
import com.example.trendingservice.models.Rating;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbAccess {

    static java.sql.Connection con = null ;
    static Statement st ;
    static ResultSet rs;

    public static void init_connection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","movie_user","12345678*Movie");
        st = con.createStatement();

    }
    public void close_connection() throws SQLException {
        con.close();
    }
    public List<Rating> getUserRatings(String userId){
        List<Rating> ratings = new ArrayList();
        try{
            init_connection();
            rs = st.executeQuery("Select * from ratings Where user_id ="+userId+";");
            while(rs.next()) {
                ratings.add(new Rating(rs.getString("movie_id"),rs.getInt("rate")));
            }
            con.close();
        }catch(Exception e){ System.out.println(e);}
        return ratings;
    }

}