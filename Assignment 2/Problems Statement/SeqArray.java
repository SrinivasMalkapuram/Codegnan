package Arrays;

import java.util.Scanner;

public class SeqArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int num:arr){
			if(num==arr[arr.length-1]){
				System.out.println(num);
			}else{
			System.out.print(num+", ");
		}
		}
	}

}
