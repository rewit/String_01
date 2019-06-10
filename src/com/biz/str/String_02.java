package com.biz.str;

public class String_02 {

	public static void main(String[] args) {

		
		String strNation = "Republic of Korea";
		
		int intNationLength = 0;
		
		
		//length : 길이, 크기와 관련된 keyword
		//배열.length : 배열의 전체 개수
		//배열에서 length = 변수, 문자열에서 length = 메서드(method)
		//배열.length = 맴버변수
		//문자열.length() = 문자열의 개수를 알려주는 메서드
		intNationLength = strNation.length();
		
		System.out.println("Nation 개수 : " + intNationLength);
		
		/*
		 * 배열의 개수를 알 수 있는 배열.length는 맴버변수이고
		 * 문자열의 개수를 알 수 있는 문자열.length()는 메서드(method)이다
		 * 따라서 배열의 개수를 알 수 있는 맴버변수의 값을 읽는것보다
		 * 문자열의 개수를 읽는 method를 실행하는 시간이 더 걸릴것이다 
		 */
	}

}
