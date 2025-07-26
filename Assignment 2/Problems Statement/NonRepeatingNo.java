package Arrays;

import java.util.Scanner;

public class NonRepeatingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++){
			count=0;
			for(int j=0;j<n;j++){
				if(arr[i]==arr[j]&& i!=j){
					count++;
				}
			}
			if(count==0){
				System.out.println(arr[i]);
				return;
			}
		}
	}

}
