package Arrays;

import java.util.Scanner;

public class SumEvenPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("Enter length of an array: ");
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if((i+1)%2==0){
				sum+=arr[i];
			}
		}
		System.out.println("Sum of elements at even position: "+sum);
		

	}

}
