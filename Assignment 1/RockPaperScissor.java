package Assignments.looping;
import java.util.*;
public class RockPaperScissor {
	public static String winner(String person1,String person2){
		String win;
		if(person1.equals(person2)){
			win="Draw";
			System.out.println("Match Draw");
			return win;
		}else if((person1.equals("rock") && person2.equals("scissor"))||(person1.equals("scissor") && person2.equals("paper"))|| (person1.equals("paper") && person2.equals("rock"))){
			win="person1";
			System.out.println("Person 1 wins");
			return win;
		}else if((person2.equals("rock") && person1.equals("scissor"))||(person2.equals("scissor") && person1.equals("paper"))|| (person2.equals("paper") && person1.equals("rock"))){
			win="person2";
			System.out.println("Person2 wins");
			return win;
		}else{
			win="Invalid Input";
			System.out.println("Invalid Input");
			return win;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int person1_wins=0;
		int person2_wins=0;
		int count_draw=0;
		int count=1;
		System.out.print("Enter No of Rounds: ");
		int rounds=sc.nextInt();
		while(count<=rounds){
				System.out.println("\t Round No "+count);
				System.out.println("Enter person1 option:");
				String person1=sc.next().toLowerCase();
				System.out.println("Enter person2 option:");
				String person2=sc.next().toLowerCase();
				String winner=winner(person1,person2);
				if(!(winner.equals("Invaild Input"))){
					if(winner.equals("person1")){
						person1_wins++;
						count++;
					}else if(winner.equals("person2")){
						person2_wins++;	
						count++;
						}
					else if(winner.equals("Draw")){
						count_draw++;
						count++;
					 }
				}
				System.out.println("----------------------------------------------------------------");
				System.out.println("\t *******Scorecard**********");
				System.out.println("\t person1 Wins "+person1_wins+" times");
				System.out.println("\t person2 wins "+person2_wins+" times");
				System.out.println("\t Draw "+count_draw+" times");
				System.out.println("----------------------------------------------------------------");
			}
			if(count_draw==rounds || person1_wins==person2_wins){
				System.out.println("\t Match Draw");
			}else if(person1_wins>person2_wins){
				System.out.println("\t Person 1 wins");
			}else{
				System.out.println("\t Person2 wins");
			}
			
	}

}
