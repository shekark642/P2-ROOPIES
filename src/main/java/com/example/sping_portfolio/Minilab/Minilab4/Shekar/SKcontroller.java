package com.example.sping_portfolio.Minilab.Minilab4.Shekar;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.*;
import java.util.*;
import java.awt.Desktop;
import java.net.URI;

//imports

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


class NFT {


    public String name;
    public String description;
    public int rating;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}


@Controller
public class SKcontroller {

    @PostMapping("/addNFT")
    public String processForm(NFT nft ) throws ClassNotFoundException, URISyntaxException, IOException {

        System.out.println(nft.name);
        System.out.println(nft.rating);


        String connection_string = "jdbc:mysql://127.0.0.1:3306/";
        Class.forName("com.mysql.jdbc.Driver");
        String query = "insert into sys.reviews(name, description, rating) values('" + nft.name + "','" + nft.description + "'," + nft.rating + ')';
        System.out.println(query);

        try {
            Connection conn = DriverManager.getConnection(connection_string, "root", "252796md");
             PreparedStatement ps = conn.prepareStatement(query);
             ps.executeUpdate();
        } catch (SQLException e) {
            // handle the exception
            System.out.println(e);
        }
        return "Minilab/return_nft_home";
    }


        @GetMapping("/backend")
    //@RequestParam pulls data from frontend
    public String backend(Model model) throws ClassNotFoundException {


        ArrayList reviews = new ArrayList();


        String connection_string = "jdbc:mysql://127.0.0.1:3306/";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(connection_string, "root", "252796md");
             PreparedStatement ps = conn.prepareStatement("select * from sys.reviews");
             ResultSet rs = ps.executeQuery()) {
            System.out.println(rs);
            NFT nft = new NFT();

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
            model.addAttribute("nft", nft );
        } catch (SQLException e) {
            // handle the exception
            System.out.println(e);
        }
        return "Minilab/ratingsource";
    }
}