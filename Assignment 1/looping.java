package Assignments.looping;

public class looping {
	public static void main(String[] args) {
		//numbers from 1 to 10
		System.out.print("numbers from 1 to 10: ");
		for(int i=1;i<=10;i++){
			System.out.print(i+" ");
		}
		System.out.println();
		// even numbers from 1 to 50
		System.out.print("even numbers from 1 to 50: ");
		for(int i=1;i<=50;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		// odd numbers from 1 to 50
			System.out.print("odd numbers from 1 to 50: ");
			for(int j=1;j<=50;j++){
				if(j%2!=0){
					System.out.print(j+" ");
				}
		}
		
	}

}

