# Impact's Takehome Assessment

## Software requirements
- Java 17

## 1.Project's Title: Number Range Summarizer

## 2.Project's Description: 
- Implementing a java interface to produce a comma delimited list of numbers,
   grouping the numbers into a range when they are sequential. 
   - (e.g.) "1,2,3,4,6,8" => "1-4,6,8".
   
## 3.How to Install
Documentation: https://cli.github.com/
 - Clone this repo onto your locally PC, using github cli `gh repo clone andilemarotya/numRange_Impact-assessment`

## 4.How to run this Project:
  (i) Install IntelliJ IDE (or your favourite IDE), Java JDK version 17
  
  (ii) Download this project as zip or clone this repository
  
  (iii) Go to `src\main` and run the project, this is where the main method is located

## 4. All the instructions of the project are in "NumberRangeSummarizer.java" file, DO NOT MODIFY. 
   `cdListNumbers` class in `cdListNumbers` is the implementation of the NumberRangeSummarizer interface.
   cdListNumbers contains two methods, to collect the comma delimited string and convert it to a Collection/List.
   and the second method contains algorithm of grouping the sequential numbers into range(s)
   
   `Test.java` is where we test our Number range summarizer methods, both the from collecting the input string to collecting the Collection and returning the
   summarized string.
  
