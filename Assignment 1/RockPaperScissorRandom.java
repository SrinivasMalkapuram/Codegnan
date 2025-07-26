package Assignments.looping;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;
public class RockPaperScissorRandom {
	public static String winner(String person1,String person2){
		String win;
		if(person1.equals(person2)){
			win="Draw";
			System.out.println("Match Draw");
			return win;
		}else if((person1.equals("rock") && person2.equals("scissor"))||(person1.equals("scissor") && person2.equals("paper"))|| (person1.equals("paper") && person2.equals("rock"))){
			win="person";
			System.out.println("Person wins");
			return win;
		}else if((person2.equals("rock") && person1.equals("scissor"))||(person2.equals("scissor") && person1.equals("paper"))|| (person2.equals("paper") && person1.equals("rock"))){
			win="computer";
			System.out.println("computer wins");
			return win;
		}else{
			win="Invalid Input";
			System.out.println("Invalid Input");
			return win;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r=new Random();
		int person_wins=0;
		int computer_wins=0;
		int count_draw=0;
		int count=1;
		ArrayList<String> arr=new ArrayList<>();
		arr.add("rock");
		arr.add("scissor");
		arr.add("paper");
		System.out.print("Enter No of Rounds: ");
		int rounds=sc.nextInt();
		while(count<=rounds){
				System.out.println("\t Round No "+count);
				System.out.println("Enter person option:");
				String person=sc.next().toLowerCase();
				System.out.println("Enter computer option:");
				String computer=arr.get(r.nextInt(3));
				System.out.println(computer);
				String winner=winner(person,computer);
				if(!(winner.equals("Invaild Input"))){
					if(winner.equals("person")){
						person_wins++;
						count++;
					}else if(winner.equals("computer")){
						computer_wins++;	
						count++;
						}
					else if(winner.equals("Draw")){
						count_draw++;
						count++;
					 }
				}
				System.out.println("----------------------------------------------------------------");
				System.out.println("\t *******Scorecard**********");
				System.out.println("\t person1 Wins "+person_wins+" times");
				System.out.println("\t person2 wins "+computer_wins+" times");
				System.out.println("\t Draw "+count_draw+" times");
				System.out.println("----------------------------------------------------------------");
			}
			if(count_draw==rounds || person_wins==computer_wins){
				System.out.println("\t Match Draw");
			}else if(person_wins>computer_wins){
				System.out.println("\t Person 1 wins");
			}else{
				System.out.println("\t Person2 wins");
			}
		
	}
}
