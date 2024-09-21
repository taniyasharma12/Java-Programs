package Strings;

public class HackerRankRepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://www.hackerrank.com/challenges/repeated-string/problem
		
		String s = "abcac";
		
		long n =10;
		
		//n is number of total character we want in string
		System.out.println(repeatedString(s,n));
		
	}

	
	public static  long  repeatedString(String s, long n) {
		
		
		//count number of a in the given string
		
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)=='a') {
				
				count++;
			}
		}
		
		int sLength = s.length();
		
		long repeatedTimes = n/sLength;
		
		//find the length of the string left after repetitions
		
		long stringLengthLeft = n-(repeatedTimes * sLength);
		
		//count the remaining repetitions
		
		int extra =0;
		
        for(int i=0; i<stringLengthLeft; i++) {
			
			if(s.charAt(i)=='a') {
				
				extra++;
			}
		}
		
		long totalCount = (repeatedTimes*count) + extra;
		
		return totalCount;
	}
}
