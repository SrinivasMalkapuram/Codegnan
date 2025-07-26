package Arrays;
import java.util.*;
public class SecondHighAndLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int max=0;
		int sec_max=0;
		for(int j=0;j<arr.length;j++){
			if(max<arr[j]){
					sec_max=max;
				    max=arr[j];
			}else if((sec_max<arr[j])&&(arr[j]<max)){
				sec_max=arr[j];
			}
		}
		System.out.println("Second largest: ");
		System.out.println("max: "+max);
		System.out.println("second max : "+sec_max);
		// second minimum number
		int min=arr[0];
		int sec_min=arr[1];
		for(int j=0;j<arr.length;j++){
			if(min>arr[j]){
				sec_min=min;
				min=arr[j];
			}else if(((sec_min>arr[j])&&(arr[j]>min))||(sec_min==min)){
				sec_min=arr[j];
			}
		}
		System.out.println("min: "+min);
		System.out.println("second min : "+sec_min);
	}

}
