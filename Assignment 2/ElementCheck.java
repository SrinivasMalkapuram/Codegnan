package Arrays;

import java.util.Scanner;

public class ElementCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter key:");
		int key=sc.nextInt();
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min]) min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		int i=0,j=n-1;
		int mid;
		int result=-1;
		while(i<j){
			mid=(i+j)/2;
			if(arr[mid]==key){
				result=mid;
				break;
			}else if(key>arr[mid]){
				i=mid+1;
			}else{
				j=mid-1;
			}
		}
		System.out.println("element at "+result);
	}

}
