package Assignments.looping;
import java.util.*;
public class Reverse {
	public static int Reverse(int n){
		int rem;
		int rev=0;
		while(n>0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
	return rev;
	}
	public static int sum(int n){
		int rem;
		int add=0;
		while(n>0){
			rem=n%10;
			add+=rem;
			n=n/10;
	}
	return add;
	}
	public static int count(int n){
		int count=0;
		while(n>0){
			count+=1;
			n=n/10;
	}
	return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=Reverse(n);
		System.out.println("reverese: "+rev);
	//plaindrome
		System.out.println(n==rev?"plaindrome" :"Not plaindrome");
		System.out.println("Sum = "+sum(n));
		System.out.println("no.of digits: "+count(n));
	}

}
