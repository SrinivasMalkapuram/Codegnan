package Assignments.looping;
import java.util.Scanner;
public class looping2 {
	public long factorial(int n){
		if(n==1) return 1;
		else{
			return factorial(n-1)*n;
		}
	}
	public int addition(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		return sum;
	}
	public void multiplication(int n){
		for(int i=1;i<=10;i++){
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		looping2 l=new looping2();
		System.out.println("sum of n numbers:"+l.addition(n));
		System.out.println("factoial of n: "+l.factorial(n));
		l.multiplication(n);
	}

}
