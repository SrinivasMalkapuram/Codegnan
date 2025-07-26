package Arrays;
import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of an array: ");
		int n=sc.nextInt();
		int sum=0;
		float avg;
		int [] arr=new int [n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of Elements in array: "+sum);
		avg=(float)sum/n;
		System.out.println("Average of Elements in array: "+avg);
	}

}
