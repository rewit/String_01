package com.biz.str;

public class String_11 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		String s1 = "";
		
		//strNation에 담긴 문자열의 12번째(0부터) 위치부터 잘라서 s1에 담아라
		s1 = strNation.substring(12);
		System.out.println(s1);
		//12번째부터 15번째 앞까지 잘라서 s1에 담아라
		s1 = strNation.substring(12,15);
		System.out.println(s1);

		//12번째 "문자열"을 추출하여 "문자"로 변환시켜 담아라
		char c = strNation.charAt(12);
		System.out.println(c);
	}

}
