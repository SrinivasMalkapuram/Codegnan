package Arrays;

import java.util.Scanner;

public class allPositiveNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int i=0,count=0;
		for(int j=0;j<n;j++){
			if(arr[j]<0){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				count++;
			}
		}
		int l=count;
		for(int k=count;k<n;k++){
			if(arr[k]==0){
				int temp=arr[l];
				arr[l]=arr[k];
				arr[k]=temp;
				l++;
			}
		}
		for(int num:arr){
			System.out.print(num+" ");
		}
	}

}
