package Arrays;
import java.util.*;
public class RepeatingElements {
	public static void main(String[] args) {
		int [] arr={2,3,1,2,3};
		Arrays.sort(arr);
		int rep=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j] && arr[i]!=rep){
					count++;
				}
			}
			if(count>1){
				rep=arr[i];
				System.out.print(arr[i]+" ");
			}
		}
	}
}
