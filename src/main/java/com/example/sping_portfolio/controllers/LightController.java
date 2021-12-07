package com.example.sping_portfolio.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LightController {
    @GetMapping("/light")
    public String LightSequence(Model model) {

        LightSequence gradShow = new LightSequence("0101 0101 0101");
        String s = gradShow.display();
        gradShow.changeSequence("0011 0011 0011");
        String t = gradShow.display();
        String resultSeq = gradShow.insertSegment("1111 1111", 4);
        String n = gradShow.display();
        String segment = "11";
        String oldSeq = "1100000111";
        int index = oldSeq.indexOf(segment);
        String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index + segment.length());
        double a = 5.3;
        double b = 6.4;
        double c = java.lang.Math.sqrt((a*a)+(b*b));
        model.addAttribute("s", s);
        model.addAttribute("t", t);
        model.addAttribute("n", n);
        model.addAttribute("newSeq", newSeq);
        model.addAttribute("c", c);

        return "light"; // returns HTML VIEW (greeting)
    }
}
