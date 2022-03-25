package com.collections.stack;

public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {
        // write your code here
        System.out.println("This is a new branch!");

        //using String builder to Reverse a given string
        StringBuilder builder = new StringBuilder("Java Developer");
        System.out.println("String Before Reverse: "+ builder);
        //builder.reverse(); // method to reverse a string
        System.out.println("String After Reverse: " + builder.reverse());


    }
}
