package org.nkhApp;

import java.util.Scanner;

import static java.lang.System.*;

public class UserInteraction {
    Scanner sc = new Scanner(in);

    public void runUI(Person person){
        out.println("Welcome to Application");
        printCommandOptions();
        String command = sc.nextLine();
        while (!command.equals("exit")){
            readAndImplementCommand(command, person);
            command = printAndReadOutput("Enter the command, you would like to implement: ");
        }

    }
    public void readAndImplementCommand(String command, Person person){
        switch (command) {
            case "1":
                person.setFirstName(printAndReadOutput("Enter your first name:"));
                break;
            case "2":
                person.setLastName(printAndReadOutput("Enter your last name:"));
                break;
            case "3":
                person.setAge(Integer.parseInt(printAndReadOutput("Enter your age:")));
                break;
            case "4":
                person.setGender(printAndReadOutput("Enter your gender - f or m:"));
                break;
            case "exit":
                break;
            default:
                out.println("Command is not defined.");
                printCommandOptions();
        }
    }

    public String printAndReadOutput(String message){
        out.println(message);
        String userInput = sc.nextLine();;
        return userInput;
    }

    public void printCommandOptions(){
        out.println("Select command you would like to implement from following:");
        out.println("1 - enter/modify your first name");
        out.println("2 - enter/modify your last name");
        out.println("3 - enter/modify your age");
        out.println("4 - enter/modify your gender");
        out.println("exit - exit the application");
    }
}
