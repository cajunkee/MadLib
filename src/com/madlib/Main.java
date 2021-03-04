package com.madlib;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the name of your favorite celebrity:");
		String name = userInput.nextLine();
		System.out.println("Name an adverb:");
		String adverb = userInput.nextLine();
		System.out.println("Name an adjective:");
		String adjective = userInput.nextLine();
		System.out.println("Name a noun:");
		String noun = userInput.nextLine();
		System.out.println("Give me another noun:");
		String nounTwo = userInput.nextLine();
		System.out.println("How many siblings do you have?");
		String number = userInput.nextLine();
		System.out.println("What is your alias?");
		String yourName = userInput.nextLine();
		
		System.out.printf("Here is your story: \n");
		System.out.printf("\n Dear %s,", name);
		System.out.printf("\n You are %s %s and I want to be your %s!!", adverb, adjective, noun);
		System.out.printf("\n I want to go to the %s with you in %s days. Counting down!!", nounTwo , number);
		System.out.printf("\n Sincerely and forever your homie, \n %s \n", yourName);
		
		
		
	}
}
