package MultiArr;
import java.util.*;
public class AddArr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows in Matrix 1: ");
		int r1=sc.nextInt();
		System.out.println("Enter no.of cols in Matrix 1: ");
		int c1=sc.nextInt();
		int [][] arr1=new int [r1][c1];
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter no.of rows in Matrix 2: ");
		int r2=sc.nextInt();
		System.out.println("Enter no.of cols in Matrix 2: ");
		int c2=sc.nextInt();
		if(r1==r2 &&c1==c2){
		int [][] arr2=new int [r2][c2];
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				arr2[i][j]=sc.nextInt();
			}
		}
		int [][] arr3=new int [r1][c1];
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for(int num[]: arr3){
			for(int k: num){
			System.out.print(k+" ");
			}
			System.out.println();
		}
		}else{
			System.out.println("rows and colummns of two matrix should be equal");
		}
	}
}
