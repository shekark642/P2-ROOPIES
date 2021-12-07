package com.example.sping_portfolio.controllers.abhijay;

// UNIT 2 FRQ


public class lightsequence {

    // instance variable seq
    private String seq;

    public lightsequence(String seq) {
        this.seq = seq;
    }

    public String insertSegment(String segment, int ind) {
        String newString = seq.substring(0, ind) + segment + seq.substring(ind+segment.length());
        return newString;
    }
    public void changeSequence(String seq) {
        this.seq = seq;
    }

    public void display() {
        System.out.println(seq);
    }

    public String getSeq() {
        return seq;
    }


}