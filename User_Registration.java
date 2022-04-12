package com.bridge;


import java.util.Scanner;
import java.util.regex.Pattern;

public class User_Registration {
	 static Scanner sc = new Scanner(System.in);

	    public static void firstName() {
	        System.out.println("Enter First Name");
	        String fN = sc.nextLine();
	        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fN) == true)
	            System.out.println("Valid First Name");
	        else
	            System.out.println("Invalid First Name");
	    }

	    
	    public static void lastName() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("\nEnter Last Name");
	        String lN = sc.nextLine();
	        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lN) == true)
	            System.out.println("Valid Last Name");
	        else
	            System.out.println("Invalid Last Name");
	    }
	    public static void email() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("\nEnter EMail");
	        String email = sc.nextLine();
	        if (Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$", email) == true)
	            System.out.println("Valid Email");
	        else
	            System.out.println("Invalid Email");
	    }
	    public static void main(String[] args) {
	        firstName();
	        lastName();
	        email();
	    }
	}