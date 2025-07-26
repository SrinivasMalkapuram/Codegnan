package Assignments.looping;
import java.util.*;
public class fibonac {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int curr=0,next=1;
		for(int i=0;i<n;i++){
			System.out.println(curr);
			int temp=next;
			next=curr+next;
			curr=temp;
		}
	}
}
