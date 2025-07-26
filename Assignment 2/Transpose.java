package MultiArr;
import java.util.*;
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows in Matrix: ");
		int r1=sc.nextInt();
		System.out.println("Enter no.of cols in Matrix : ");
		int c1=sc.nextInt();
		int [][] arr=new int [r1][c1];
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int num[]:arr){
			for(int k:num ){
				System.out.print(k+" ");
			}
			System.out.println();
		}
		if(r1==c1){
		int [][] res=new int[r1][c1];
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				if(i==j){
					res[i][j]=arr[i][j];
				}
				else{
					res[j][i]=arr[i][j];
				}
			}
		}
		System.out.println("Transpose:");
		for(int num[]:res){
			for(int k:num ){
				System.out.print(k+" ");
			}
			System.out.println();
		}
		}
		System.out.println("Rows and columns must be equal");
	}

}
