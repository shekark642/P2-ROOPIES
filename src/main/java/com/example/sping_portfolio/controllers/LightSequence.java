package com.example.sping_portfolio.controllers;




public class LightSequence{

String sequence;

    public LightSequence(String seq)

    { sequence = seq;
    }



    /** Inserts the string segment in the current sequence,

     * starting at the index ind. Returns the new sequence.

     */

    public String insertSegment(String segment, int ind)

    {
        int x = ind;
        String st=segment;
        sequence = sequence.substring(0,x) + segment + sequence.substring(x, sequence.length());
        return sequence;
    }




    /** Updates the sequence to the value in seq

     */

    public void changeSequence(String seq)

    {
        sequence = seq;
    }



    /** Uses the current sequence to turn the light on and off

     * for the show

     */

    public String display()

    {
        return sequence;
    }

}
