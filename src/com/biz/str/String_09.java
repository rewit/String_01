package com.biz.str;

public class String_09 {

	public static void main(String[] args) {

		String strKorea = "Korea";
		
		boolean bYes = true;
		
		bYes = strKorea.equals("KOREA");
		System.out.println(strKorea + "  eq KOREA : " + bYes);

		bYes = strKorea.equalsIgnoreCase("KOREA");
		System.out.println(strKorea + "  eqIg KOREA : " + bYes);
		
		bYes = strKorea.matches("Korea");
		System.out.println(strKorea + "  ma Korea : " + bYes);

		bYes = strKorea.matches("KOREA");
		System.out.println(strKorea + "  ma KOREA : " + bYes);
		
		//문자열 내에 Ko라는 문자열이 포함되어 있는지 
		bYes = strKorea.contains("Ko");
		System.out.println(strKorea + " contaubs Ko : " + bYes);

		bYes = strKorea.contains("KO");
		System.out.println(strKorea + " contaubs KO : " + bYes);

		

	}

}
