package numberrangesummarizer;

import java.util.*;
import java.util.stream.Collectors;

public class cdListNumbers implements NumberRangeSummarizer {

    @Override
    public Collection<Integer> collect(String input) {
        // Try to use the algorithm and catch any exceptions
        try {
            //Converting the comma delimited numbers to an Arraylist<String>
            List<String> cdListStr = Arrays.asList(input.split("\\s*,\\s*"));

            //The line below converts the String Arraylist to an Integer Arraylist then returns it.
            return cdListStr.stream().map(Integer::parseInt).collect(Collectors.toList());
        }catch (Exception e){
            if ( input == null || input.isEmpty()) {
                throw new IllegalArgumentException("The input string is null / Empty please enter comma separated values (e.g.) '1,2,3,4,6,8'");
            } else {
                throw new IllegalArgumentException("Please enter valid comma separated string input, (e.g.) '1,2,3,4,6,8' ");
            }
        }

    } // O(1) space complexity, O(1) Time

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        // Try to use the algorithm and catch any exceptions
        try {
            // Declare the list from input collection and sort it in ascending order

            List<Integer> colList = new ArrayList<>(input);         //O(1) space
            Collections.sort(colList);
            List<String> StrList = new ArrayList<>();               //O(n) space   , we add to this List

            //Initialize starting and ending numbers of the range
            int start = colList.get(0);
            int end = colList.get(0);
            for (int i=1; i<colList.size();i++){

                if (colList.get(i) == end + 1) {   //Checks if the difference between current number and the next is 1
                    end = colList.get(i);          //Update end

                } else {
                    //Adding the current range to StrList
                    if (start == end) {
                        StrList.add(Integer.toString(start));
                    } else {
                        StrList.add(Integer.toString(start)+"-"+Integer.toString(end));
                    }

                    start = colList.get(i);
                    end = colList.get(i);
                }

            }
            //Add the last range or number to the StrList
            if (start == end) {
                StrList.add(Integer.toString(start));
            } else {
                StrList.add(Integer.toString(start)+"-"+Integer.toString(end));
            }
            return  String.join(", ",StrList);

        }catch (Exception e){
            if (input == null || input.isEmpty()) {
                throw new IllegalArgumentException("The input Collection is null/empty, please input a Collection of Integers!");
            } else {
                throw new IllegalArgumentException("Please input a Collection of Integer type ,'Collection<Integer>' is required!");
            }
        }

    }// O(n) space, O(n) time


    /* Overall Time & Space Complexity - of both methods
     *  O(1) + O(n) = O(n+1) => O(n) space complexity
     *  O(1) + O(n) = O(1+n) => O(n) time complexity
     *   */
}
