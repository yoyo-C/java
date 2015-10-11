package javabasics;
import java.util.Scanner;


public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int C, F;
		F = in.nextInt();
		C = (int)((F-32)*5/9);
		System.out.println(C);
		 in.close();
	}

}
