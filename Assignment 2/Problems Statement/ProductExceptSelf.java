package Arrays;

import java.util.Scanner;

public class ProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int [] res=new int[n];
		int prod;
		for(int i=0;i<n;i++){
			prod=1;
			for(int j=0;j<n;j++){
				if(i!=j){
					prod*=arr[j];
				}
			}
			res[i]=prod;
		}
		for(int num:res){
			System.out.print(num+" ");
		}
	}

}
