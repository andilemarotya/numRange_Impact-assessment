package numberrangesummarizer;

import java.util.*;
import java.util.stream.Collectors;

public class cdListNumbers implements NumberRangeSummarizer {

    @Override
    public Collection<Integer> collect(String input) {
        //Checking if the input string is not null , empty or not in the required form
        try {
            if ( input == null) {
                throw new IllegalArgumentException("The input string is null please enter comma separated values (e.g.) '1,2,3,4,6,8'");
            } else if (input.isEmpty()) {
                throw new IllegalArgumentException("The input is empty please enter comma separated values (e.g.) '1,2,3,4,6,8'");
            }
        }catch (Exception e){
            throw new IllegalArgumentException(e);
        }
        //Converting the comma delimited numbers to an Arraylist<String>
        List<String> cdListStr = Arrays.asList(input.split("\\s*,\\s*"));

        //The line below converts the String Arraylist to an Integer Arraylist then returns it.
        return cdListStr.stream().map(Integer::parseInt).collect(Collectors.toList());
    } // O(1) space complexity, O(1) Time

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        //First we check  if "input is empty, null or incorrect input format" using try and catch
        try {
            if (input == null) {
                throw new IllegalArgumentException("The input Collection is null, please input a Collection of Integers!");
            } else if (input.isEmpty()) {
                throw new IllegalArgumentException("The input Collection is empty , please input a Collection of Integers!");
            }
        }catch (Exception e){
            throw new IllegalArgumentException(e);
        }

        // Declare the list from input collection and sort it in ascending order

        List<Integer> colList = new ArrayList<>(input);         //O(1) space
        Collections.sort(colList);
        List<String> StrList = new ArrayList<>();               //O(n) space   , we add to this List

        int start = colList.get(0);
        int end = colList.get(0);
        for (int i=1; i<colList.size();i++){

            if (colList.get(i) == end + 1) {
                end = colList.get(i);

            } else {
                //Append the current range to the string 'returnedStr'
                if (start == end) {
                    StrList.add(Integer.toString(start));
                } else {
                    StrList.add(Integer.toString(start)+"-"+Integer.toString(end));
                }

                start = colList.get(i);
                end = colList.get(i);

            }

        }if (start == end) {
            StrList.add(Integer.toString(start));
        } else {
            StrList.add(Integer.toString(start)+"-"+Integer.toString(end));
        }
        return  String.join(", ",StrList);

    }// O(n) space, O(n) time


    /* Overall Time & Space Complexity - of both methods
     *  O(1) + O(n) = O(n+1) => O(n) space complexity
     *  O(1) + O(n) = O(1+n) => O(n) time complexity
     *   */
}
