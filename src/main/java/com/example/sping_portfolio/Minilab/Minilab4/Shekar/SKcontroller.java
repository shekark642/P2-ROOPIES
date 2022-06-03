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
    public String processForm(NFT nft, Model model ) throws ClassNotFoundException, URISyntaxException, IOException {

        System.out.println(nft.name);
        System.out.println(nft.rating);
        System.out.println(nft.description);


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

        this.add_nft(model);
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
                String description = rs.getString("description");
                String name = rs.getString("name");
                int rating = rs.getInt("rating");


                HashMap mMap = new HashMap();

                mMap.put("description", description);
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

    @GetMapping("/addNeft")
    //@RequestParam pulls data from frontend
    public void add_nft(Model model) throws ClassNotFoundException {


        System.out.println("trying to add coutn of submission");
        String connection_string = "jdbc:mysql://127.0.0.1:3306/";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(connection_string, "root", "252796md");
             PreparedStatement ps = conn.prepareStatement("select submission_count from sys.submissions");
             ResultSet rs = ps.executeQuery()) {
            System.out.println(rs);

            while (rs.next()) {
                int submission_count = rs.getInt("submission_count");
                model.addAttribute("submission_count", submission_count);

                System.out.println("submission count is " + submission_count);
                String query = "update sys.submissions set submission_count = submission_count + 1";
                System.out.println(query);


                try {
                    PreparedStatement ps2 = conn.prepareStatement(query);
                    ps2.executeUpdate();
                } catch (SQLException e) {
                    // handle the exception
                    System.out.println(e);
                }

            }

        } catch (SQLException e) {
            // handle the exception
            System.out.println(e);
        }
        System.out.println("submission count returned ");
    }
}