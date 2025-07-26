package Arrays;

import java.util.Scanner;

public class ArrayPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		boolean result=true;
		for(int k: arr){
			result=true;
			if(k<=1)result=false;
			for(int i=2;i<(int)k*0.5+1;i++){
				if(k%i==0){
					result=false;
				}
			}
			if(result) System.out.println(k+" ");
		}
	}

}
