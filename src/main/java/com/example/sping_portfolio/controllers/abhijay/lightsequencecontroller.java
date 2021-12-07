package com.example.sping_portfolio.controllers.abhijay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class lightsequencecontroller {

    @GetMapping("/kevin/unit2")
    public String displayFRQ(Model model) {

        // declarations for later parts
        String oldSeq = "1000 1100 1110";
        String resultSeq;
        String segment = "1110";

        // PART (a)
        lightsequence gradShow = new lightsequence("0101 0101 0101");
        String parta = gradShow.getSeq();

        // PART (b)
        gradShow.display();

        // PART (c)
        gradShow.changeSequence("0011 0011 0011");
        String newGradShow = gradShow.getSeq();

        // PART (d)
        resultSeq = gradShow.insertSegment("1111 1111", 4);

        // PART (e)
        int index = oldSeq.indexOf(segment);
        String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index + segment.length());

        // PART (f)
        int a = 3;
        int b = 4;
        double partf = Math.sqrt(a*a + b*b);

        model.addAttribute("oldSeq", oldSeq);
        model.addAttribute("segment", segment);
        model.addAttribute("gradShow", parta);
        model.addAttribute("newGradShow", newGradShow);
        model.addAttribute("resultSeq", resultSeq);
        model.addAttribute("newSeq", newSeq);
        model.addAttribute("partf", partf);

        return "templates/abhijay/unit2";
    }
}