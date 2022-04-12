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
	    
	    public static void mobile() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("\nEnter Mobile Number With Country Code(space between code and number)");
	        String m = sc.nextLine();
	        if (Pattern.matches("^[1-9]{2}\\s{1}[1-9]{1}[0-9]{9}$", m) == true)
	            System.out.println("Valid Mobile");
	        else
	            System.out.println("Invalid Mobile");
	    }
	    // Rule4 Should have one special character
	    public static void password() {
	        Scanner sc  = new Scanner(System.in);
	        System.out.println("\nEnter the Password");
	        String p = sc.nextLine();
	        if (Pattern.matches("^(?=.*[a-z])\"+\"(?=.*[A-Z])\"+\"(?=.*[@#$%^&+=]){8,}$", p) == true)
	            System.out.println("Valid Password");
	        else
	            System.out.println("Invalid Password");
	    }
	    public static void main(String[] args) {
	        firstName();
	        lastName();
	        email();
	        mobile();
	        password();
	    }
	}