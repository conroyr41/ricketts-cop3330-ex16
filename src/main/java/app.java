/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        String output;
        int age;

        System.out.println("Enter your age:");
        scan = new Scanner(System.in);
        age = Integer.parseInt(scan.next());

        output = age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(output);
    }
}