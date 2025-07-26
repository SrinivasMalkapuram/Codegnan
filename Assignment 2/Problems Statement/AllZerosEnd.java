package Arrays;
import java.util.*;
public class AllZerosEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int i=0;
		for(int j=0;j<arr.length;j++){
			if(arr[j]!=0){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}

		for(int k:arr){
			System.out.print(k+" ");
		}
	}

}
