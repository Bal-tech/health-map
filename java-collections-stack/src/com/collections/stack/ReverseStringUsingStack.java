package com.collections.stack;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        System.out.println("This is in a new branch!");

        //using Stack to Reverse a given string
        String myCourse = "Java Programming"; // a string variable
        char [] alphabet = myCourse.toCharArray(); // converting to a character array
        Stack<Character> courseName = new Stack(); // create a Stack Object
        System.out.println("Original String: ");
        for(char letter: alphabet) // iterate through for each loop
        {
            // print the alphabets in a given string
            System.out.print(courseName.push(letter));
        }
        System.out.println("\n");

        System.out.println("Reversed String: ");
        // Reverse the given string
        for(char letter: alphabet) // iterate through for each loop
        {
            // print the alphabets in a given string
            System.out.print(courseName.pop());
        }
        System.out.println("\n");

   }

}
