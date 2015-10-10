package javabasics;
import java.util.Scanner;


public class LenthOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		  
		String word = in.next();
		while(word.charAt(word.length() - 1) != '.'){
			System.out.print(word.length()+" ");
			word = in.next();
		}
		System.out.print(word.length() - 1); 
		in.close();
	 } 
}
