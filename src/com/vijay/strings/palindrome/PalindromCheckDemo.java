/**
 * 
 */
package com.vijay.strings.palindrome;

import java.util.Scanner;

/**
 * @author vkonduru3
 *
 */
public class PalindromCheckDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string:: ");
		String str = scanner.next();
		boolean isPalindrome = true;
		if(null != str && !"".equals(str)){
			int lowerIndex = 0;int upperIndex = str.length()-1;
			while(lowerIndex < upperIndex){
				if(str.charAt(lowerIndex) != str.charAt(upperIndex)){
					isPalindrome = false;
					break;
					//return;
				}
				lowerIndex++;
				upperIndex--;
			}
		}
		if(isPalindrome){
			System.out.println("The given string ## " + str + " ## is a palindrom");
		}else{
			System.out.println("The given string ## " + str + " ## is not a palindrom");
		}
		scanner.close();
	}

}