package p1007;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String num;
		System.out.println("exit을 입력하면 종료합니다.");
		while(true){
			System.out.print(">>");
			num=s.next();
			if(num.equals("exit"))
				break;
			}
		System.out.println("종료 합니다....");
	}

}
