package Riddle;

import java.util.Scanner; //imports a class that allows us to interact with user
// class body riddle starts here
public class riddle {

  static String question; //changed it to static variable for the class riddle so i can use it in other methods
  static String answer; 

 public static void printRiddle(String q,String a) // NOTE: I changed this method from the book , now its a return type void
{question=q;
answer=a;
Scanner useranswer=new Scanner(System.in); // creates a variable that will ask the user for the answer

String x;
System.out.println(question+"?"); //prints question
x=useranswer.nextLine();
if (x.equals(answer)) // check if the users answer is the same as the saved answer
{System.out.println(" You are correct !!"); // if correct
}
else {
	System.err.println(" you are wrong. the right answer is :"+ answer); //if answer to riddle is wrong
}



}
 public static String getQuestion() // another method but this one returns a string unlike previous method which doesnt return anything
{System.out.println("what is the question: ");
Scanner a =new Scanner(System.in); // creates a variable of type scanner
question=a.nextLine();// this will take string from  user and stores it in question
	return question;}
public static String getAnswer() // another method but this one returns a string 
{System.out.println(" what is the answer: ");
	Scanner a =new Scanner(System.in); // creates a variable of type scanner

answer=a.nextLine();// takes users input
	return answer;}



public static void main (String args[])  // main method at which eclipse starts
{ 
	
		 //creates a variable xyz of type riddle so we can call the methods we created
	
	String a;
	a=getQuestion();// a is the return of get question method
	String b;
	b=getAnswer();// b is the return of get Answer method
	printRiddle(a, b); // this will invoke the first riddle }
}}

