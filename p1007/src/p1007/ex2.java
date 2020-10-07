package p1007;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String num;
		System.out.print("학점을 입력하세요.(A~D,F):");
		num=s.next();
		if(num.equals("A")||num.equals("B")){
			System.out.println("참 잘했어요");
	}else if(num.equals("C")||num.equals("D")){
		System.out.println("좀 더 노력하세요 .");
	}else if(num.equals("F")){
		System.out.println("다음학기에 다시 수강하세요.");
	}else{
		System.out.println("잘못된 학점입니다.");
	}

}
}
