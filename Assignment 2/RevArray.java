package Arrays;

import java.util.Scanner;

public class RevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of an array: ");
		int n=sc.nextInt();
		int [] arr=new int [n];//array creation
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int k,l=n-1;									
		for(k=0;k<l;k++){								
			int temp=arr[k];							
			arr[k]=arr[l];
			arr[l]=temp;
			l-=1;
			
		}
		for(int num: arr){
			System.out.print(num+" ");
		}
		

	}

}
