package p1007;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String num;
		System.out.println("exit을 입력하면 종료합니다.");
		do{
			System.out.print(">>");
			num=s.next();
			if(num.equals("exit"))
			break;
		}while(true);
		System.out.println("종료합니다....");

	}

}
