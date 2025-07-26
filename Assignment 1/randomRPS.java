package Assignments.looping;
import java.util.*;
public class randomRPS {
	public static void main(String[] args) {
		Random r =new Random();
		Scanner sc=new Scanner(System.in);
		String [] arr={"rock","paper","scissor"};
		System.out.println("Enter valid Input: ");
		String person=sc.next().toLowerCase();
		while(!person.equals("rock")&& !person.equals("paper")&& !person.equals("scissor")){
			System.out.println("invalid input");
			System.out.println("Enter valid Input: ");
			person=sc.next();
		}
		System.out.print("Computer option: ");
		String computer=arr[r.nextInt(3)];
		System.out.println(computer);
		if(person.equals(computer)){
			System.out.println("Draw");
		}else if((person.equals("rock") && computer.equals("scissor"))||(person.equals("scissor") && computer.equals("paper"))|| (person.equals("paper") && computer.equals("rock"))){
		System.out.println("person Wins");
		}else{
			System.out.println("Computer wins");
		}
	}
}
