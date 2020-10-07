package p1007;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=1;
		for(int i=0;i<10;i++){
			System.out.print("1 * ");
			sum=sum*(i+1);
			for(int j=2;j<=i;j++){
				System.out.print("j");
				System.out.print(" * ");
			}
			System.out.print(i+1);
			System.out.print(" ="+sum);
			System.out.print("\n");
	}

}
}
