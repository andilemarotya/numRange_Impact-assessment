package test;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collection;

import main.numberrangesummarizer.cdListNumbers;

public class NumberRangeSummarizerTest {
    @Test
    public void testNumberRangeSummarizer(){
        cdListNumbers summarize = new cdListNumbers();

        String sampleInput = "1,3,6,7,8,12,13,14,15,21,22,23,24,31,32";
        String expectedresult = "1, 3, 6-8, 12-15, 21-24, 31-32";
        Collection<Integer> output = summarize.collect(sampleInput);
        String result = summarize.summarizeCollection(output);

        assertEquals(expectedresult, result);
    }

    @Test
    public void testNumberRangeSummarizer() {
        cdListNumbers summarize = new cdListNumbers();
        String sampleInput = "1,3,4,6,7,8,12,13,14,15,21,22,23,24,31,32,34";
        String expectedresult = "1, 3-4, 6-8, 12-15, 21-24, 31-32, 34";
        Collection<Integer> output = summarize.collect(sampleInput);
        String result = summarize.summarizeCollection(output);
        Assert.assertEquals(expectedresult, result);
    }
}