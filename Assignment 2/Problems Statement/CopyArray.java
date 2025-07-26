package Arrays;
import java.util.*;
public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [] arr1=new int [5];
		int [] arr2 =new int [10];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
			//arr2[i]=arr1[i];
		}
		/*for(int i=0;i<arr1.length;i++){
			arr2[i]=arr1[i];
		}*/
		System.out.println(arr2.length);
		arr2=Arrays.copyOf(arr1,arr1.length);
		System.out.println(arr2.length);
		System.out.println(Arrays.equals(arr1, arr2));
		

	}

}
