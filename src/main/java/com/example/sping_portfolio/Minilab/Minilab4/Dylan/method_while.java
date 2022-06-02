package com.example.sping_portfolio.Minilab.Minilab4.Dylan;
import java.util.ArrayList;
import java.util.Random;

public class method_while extends gcf{
    //variables
    private int x;
    private int num1;
    private String num3;

    //constructor
    public method_while(int num1) {
        this.num1 = num1;
        this.num3 = findgcf();
    }

    //required findgcf method from parent
    @Override
    public String findgcf() {

        Random rand = new Random();
        int y=0;
        String num3 = "";
        while (y < num1){

            int asciiindex = rand.nextInt(74) + 48;
            if ( (asciiindex >57 && asciiindex <64) || (asciiindex >91 && asciiindex <96)){
                y = y - 1;
            }
            else{
                char x = (char) asciiindex;
                num3 = (num3 + x);
            }
            y = y + 1;
        }

        return num3;
    }

    @Override
    public String getMethod(){
        return "alphanumeric";
    }
}
