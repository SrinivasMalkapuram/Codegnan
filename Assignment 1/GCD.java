package Assignments.looping;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<b){
			int temp=a;
			a=b;
			b=temp;
		}
		if(b==0){
			System.out.println(a);
			}
		else{
			while(b>0){
				int temp=b;
				b=a%b;
				a=temp;
			}
			System.out.println(a);
		}
		
	}

}
