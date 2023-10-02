package org.nkhApp;

public class MySimpleApp{
	public static void main(String... args){
		Person person1 = new Person();
		UserInteraction ui = new UserInteraction();
		ui.runUI(person1);
		person1.printDetails();
	}
}
