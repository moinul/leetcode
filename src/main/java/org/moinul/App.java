package org.moinul;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        MyRunner runner = null;
        //Nearby Duplicate
        //runner = new NearbyDuplicate();
        //Test
        //runner = new MyTest();
        // Tow Sum
        //runner = new TwoSum();
        //Reverse Integer
        //runner = new ReverseInteger();
        //Remove duplicate from sorted array
        //runner = new RemoveDuplicate();
        //generate parenthesis
        //runner = new GenerateParenthesis();
        //find median
        //runner = new MedianOfSortedArray();
        //Reshape The Matrix
        //runner = new ReshapeTheMatrix();
        //Pascal Triangle
        //runner = new PascalTriangle();
        //First Unique Character In a String
        //runner= new FirstUniqueCharacterInString();
        //RansomNote
        //runner = new RansomNote();
        //Valid Anagram
        //runner = new ValidAnagram();
        // Remove duplicate
        runner = new RemoveDuplicatesFromSortedList();

        runner.run();

    }
}
