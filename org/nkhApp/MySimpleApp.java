package org.nkhApp;

public class MySimpleApp{
	public static void main(String... args){
		System.out.println("Welcome to my simple app! My name is Natallia.");
		System.out.println("What is your name?");
		String name = System.console().readLine();
		System.out.println("Hello " + name +"!");
	}
}
