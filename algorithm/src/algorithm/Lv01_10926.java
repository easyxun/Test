package algorithm;

import java.util.*;

public class Lv01_10926 {

	public static void main(String[] args) {
		// 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다. 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.
		// 예제1 joonas, 예제2 baekjoon
		
		String name = new String();
		String id01 = "joonas";
		String id02 = "baekjoon";
		
		int finish = 0;

		while(finish==0) {
				
			Scanner sc = new Scanner(System.in);
			System.out.println("아이디를 입력하세요:");
			name = sc.nextLine();
				
			if (name.compareToIgnoreCase(id01) == 0){
				System.out.printf("??!%n"); continue;
				}else if (name.compareToIgnoreCase(id02) == 0){
				System.out.printf("??!%n"); continue;
				}else {
				System.out.printf("아이디가 설정되었습니다."); finish++; break;
				}
			
			}
		
		}
	
	}
