package Assignments.looping;
import java.util.*;
public class decimalToBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r;
		String str="";
		while(n>0){
			r=n%2;
			str=r+str;
			n/=2;
		}
		System.out.println(str);
	}
}
