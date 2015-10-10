package javabasics;
import java.util.Scanner;


public class SumOfOddandEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int input;
		int numOfEven = 0, numOfOdd = 0;
		boolean flag = true;
		while (flag){
			input = in.nextInt();
			if (input == -1){
				break;
			}
			if (input % 2 == 0){
				numOfEven++;
			}
			else{
				numOfOdd++;
			}
		}
		System.out.println(numOfEven+" "+ numOfOdd);	
		 in.close();
	}

}
