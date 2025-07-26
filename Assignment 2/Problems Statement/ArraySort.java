package Arrays;

import java.util.*;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		//Ascending 
		for(int m=0;m<arr.length-1;m++){
			for(int l=0;l<arr.length-m-1;l++){
				if(arr[l]>arr[l+1]){
					int temp=arr[l];
					arr[l]=arr[l+1];
					arr[l+1]=temp;
				}
			}
		}
		System.out.println("Ascending order:");
		for(int j: arr){
			System.out.print(j+" ");
		}
		System.out.println();
		//Descending
		for(int m=0;m<arr.length-1;m++){
			for(int l=0;l<arr.length-m-1;l++){
				if(arr[l+1]>arr[l]){
					int temp=arr[l];
					arr[l]=arr[l+1];
					arr[l+1]=temp;
				}
			}
		}
		System.out.println("Descending order:");
		for(int j: arr){
			System.out.print(j+" ");
		}
	}

}
