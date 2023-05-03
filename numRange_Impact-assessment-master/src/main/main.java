package main;

import java.util.Collection;

import main.numberrangesummarizer.cdListNumbers;

public class main {
    public static void main(String[] args) {
        cdListNumbers summarize = new cdListNumbers();

        /* "collect" method tests start here*/
        String sampleInput = "1,3,6,7,8,12,13,14,15,21,22,23,24,31,32";

        //Testing if the method "collect" returns a List / Arraylist
        System.out.println(summarize.collect(sampleInput));
        System.out.println();

        //Testing if the values of the returned Arraylist are really Integers instead of string data types
        for (Integer num : summarize.collect(sampleInput)
        ) {
            System.out.println(num + 2);
        }
        System.out.println();
        /* "collect" method tests end here*/



        /* "summarizeCollection" method tests start here*/

        //Declaring sample collection from the string sample input
        Collection<Integer> sampleColl = summarize.collect(sampleInput);
        System.out.println(summarize.summarizeCollection( sampleColl)); //

    }

}
