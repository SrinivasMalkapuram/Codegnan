package Arrays;
import java.util.*;
public class FisrtAndLast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of an array: ");
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("First Element: "+arr[0]);
		System.out.println("Last Element: "+arr[arr.length-1]);
	}

}