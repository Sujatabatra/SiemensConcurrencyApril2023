package com.sujata.demo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		
//		Function<String, Integer> convert=(str)->Integer.parseInt(str);
		//Method Reference
		Function<String, Integer> convert=Integer::parseInt;
		
		Integer i=convert.apply("10");
		
		
		String str="sujata";
//		System.out.println(str.replace("suj", "SUJ"));
		
		
//		BiFunction<String, String, String> replaceString=(str1,str2)->str.replace(str1, str2);
		
		BiFunction<String, String, String> replaceString=str::replace;

		System.out.println(replaceString.apply("ata", "ATA"));
		
		
//		BiFunction<String, String, Integer> compareStrings=(str1,str2)->str1.compareTo(str2);
		BiFunction<String, String, Integer> compareStrings=String::compareTo;
		
		
		System.out.println(compareStrings.apply("Sujata", "Batra"));
	}

}
