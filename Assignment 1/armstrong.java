package Assignments.looping;
import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int temp=n;
		int rem,sum=0;
		while(n>0){
			n=n/10;
			count+=1;
		}
		n=temp;
		while(temp>0){
			rem=temp%10;
			sum+=Math.pow(rem,count);
			temp/=10;
		}
		if(n==sum){
			System.out.println("armstrong number");
		}else{
			System.out.println("not an armstrong number");
		}
	}
}