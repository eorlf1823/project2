package p1007;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=0;
		System.out.print("점수를 입력하세요:");
		num=s.nextInt();
		if(num>=80){
			System.out.println("축하합니다! 합격입니다.");
		}else{
			System.out.println("불합격입니다.");
		}

	}

}
