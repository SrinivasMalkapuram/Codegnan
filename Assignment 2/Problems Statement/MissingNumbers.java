package Arrays;
import java.util.*;
public class MissingNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		boolean result=true;
		for(int i=1;i<=100;i++){
			result=true;
			for(int j=0;j<n;j++){
				if(i==arr[j]){
					result=false;
					break;
				}
			}
			if(result) System.out.print(i+" ");
		}
	}

}
