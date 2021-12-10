package com.example.sping_portfolio.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LightController {
    @GetMapping("/kian/light")
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
        //hello
        return "lightkian"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/rohan/light")
    public String LightSequence1(Model model) {

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

        return "lightrohan"; // returns HTML VIEW (greeting)
    }
    @GetMapping("/abhijay/light")
    public String LightSequence2(Model model) {

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

        return "lightabhijay"; // returns HTML VIEW (greeting)
    }
    @GetMapping("/justin/light")
    public String LightSequence3(Model model) {

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

        return "lightjustin"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/shekar/light")
    public String LightSequence4(Model model) {

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

        return "lightshekar"; // returns HTML VIEW (greeting)
    }
}
