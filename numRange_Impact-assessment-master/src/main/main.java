package main;

import java.util.Collection;
import java.util.Iterator;
import main.numberrangesummarizer.cdListNumbers;

public class main {
    public main() {
    }

    public static void main(String[] args) {
        cdListNumbers summarize = new cdListNumbers();
        String sampleInput = "1,3,6,7,8,12,13,14,15,21,22,23,24,31,32";
        System.out.println(summarize.collect(sampleInput));
        System.out.println();
        Iterator var4 = summarize.collect(sampleInput).iterator();

        while(var4.hasNext()) {
            Integer num = (Integer)var4.next();
            System.out.println(num + 2);
        }

        System.out.println();
        Collection<Integer> sampleColl = summarize.collect(sampleInput);
        System.out.println(summarize.summarizeCollection(sampleColl));
    }
}