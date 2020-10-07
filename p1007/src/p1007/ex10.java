package p1007;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0,num=0;
		System.out.println("1부터 n까지 의 합 중에서 5000을 넘지 않는 가장 큰 합은: ");
		for(i=0;i<=5000;i++){
			num +=i;
				if(num>5000){
					num-=i;
					i=i-1;
					break;
				}
		}
		System.out.print("1부터 "+i+"까지의 합이"+num+"입니다.");
	}

}
