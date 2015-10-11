package javabasics;
import java.util.Scanner;


public class PolynomialFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] amount = new int[10];
		int max = 0;
		int zero = 0;
		while(zero != 2){
			int temp = in.nextInt();
			amount[temp] += in.nextInt();
			if (temp > max){
				max = temp;
			}
			if (temp == 0){
				zero++;
			}
		}
		System.out.print(amount[max]+"x" + max);
		for (max--;max >= 0;max--){ 
			if (amount[max] != 0){
				if (max > 1){    
					System.out.print("+"+amount[max]+"x"+max);
				}
				else if (max == 1){
					System.out.print("+"+amount[max]+"x");
				}
				else{
					System.out.print("+"+amount[max]);
				}
			}
		}  in.close();
	} 

}
