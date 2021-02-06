package com.madlib;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the name of a friend:");
		String name = userInput.nextLine();
		System.out.println("Name an adverb:");
		String adverb = userInput.nextLine();
		System.out.println("Name an adjective:");
		String adjective = userInput.nextLine();
		System.out.println("Name a noun:");
		String noun = userInput.nextLine();
		System.out.println("Give me another noun:");
		String nounTwo = userInput.nextLine();
		System.out.println("What's your lucky number?");
		String number = userInput.nextLine();
		System.out.println("What is YOUR name?");
		String yourName = userInput.nextLine();
		
		System.out.printf("Here is your story: \n");
		System.out.printf("\n Dear &s,", name);
		System.out.printf("\n You are &s %s and want to be your %s!!", adverb, adjective, noun);
		System.out.printf("\n I want to go to the %s with you in % days. Counting down!!", nounTwo , number);
		System.out.printf("\n Sincerely and forever your homie, \n", yourName);
		
		
		
	}
}
