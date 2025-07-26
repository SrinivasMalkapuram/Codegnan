package Arrays;
import java.util.*;
public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int max=0;
		int min=arr[0];
		for(int j:arr){
			if(j>max){
				max=j;
			}else if(j<min){
				min=j;
			}
			
		}
		System.out.println("maximum element: "+max);
		System.out.println("minimum element: "+min);
	}

}
