package algorithm;

import java.util.*;

public class Lv01_1330 {

	public static void main(String[] args) {
		// 두 정수 A와 B가 공백 한 칸으로 주어졌을때, A와 B를 비교하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요 :");
		String a = sc.next();
		String b = sc.next();
		// 형변환 : 문자열 >숫자
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		
		if(a1>b1) {
			System.out.println("a>b");
		} else if(a1<b1) {
			System.out.println("a<b");
		} else {
			System.out.println("==");
		}
		
	}

}
