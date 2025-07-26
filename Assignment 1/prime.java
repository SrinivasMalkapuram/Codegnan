package Assignments.looping;
import java.util.Scanner;
public class prime {
	public boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if(n%i==0){
				return false;
			}
		}return true;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		prime p=new prime();
		for(int i=2;i<n;i++){
		//System.out.print(p.isPrime(i)? i+"prime " : i+"Not prime " );
			if(p.isPrime(i)){
				sum+=i;
				System.out.println(i+" is Prime");
			}else{
				System.out.println(i+" is Not Prime");
			}
		}	
		System.out.println("sum of all prime numbers from 1 to "+n+"="+sum);
	}
}
