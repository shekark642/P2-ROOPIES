package com.example.sping_portfolio.Minilab.Minilab4.Shekar;
import java.sql.*;
import java.util.*;

//imports

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class SKcontroller {

    public String description = "Matteo Pinto";
    @GetMapping("/backend")
    //@RequestParam pulls data from frontend
    public String backend (Model model) throws ClassNotFoundException {


        ArrayList reviews = new ArrayList();


        String connection_string = "jdbc:mysql://127.0.0.1:3306/";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(connection_string, "root", "252796md");
             PreparedStatement ps = conn.prepareStatement("select * from sys.reviews");
             ResultSet rs = ps.executeQuery()) {
            System.out.println(rs);

            while (rs.next()) {
                String desription = rs.getString("description");
                String name = rs.getString("name");
                int rating = rs.getInt("rating");


                System.out.println(name);

                HashMap mMap = new HashMap();

                mMap.put("description", desription);
                mMap.put("rating", rating);
                mMap.put("name", name);

                reviews.add(mMap);

            }
            model.addAttribute("reviews", reviews);
        } catch (SQLException e) {
            // handle the exception
            System.out.println(e);
        }



        return "Minilab/ratingsource";
    }



}
