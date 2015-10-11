package javabasics;
import java.util.Scanner;
public class PrimeFactors {	
	public static void primeFactors(int product, int minFactor, int[] resultSetOfPrimeFactors, int index){
		if (product == minFactor){
			resultSetOfPrimeFactors[index] = product;
			return;
		}
		else{
			if (product % minFactor == 0){
				product = product / minFactor;
				resultSetOfPrimeFactors[index] = minFactor;
				index++;
				primeFactors(product, minFactor, resultSetOfPrimeFactors, index);
			}
			else{
				minFactor++;
				primeFactors(product, minFactor, resultSetOfPrimeFactors, index);
			}
		}		
	}
	
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        in.close();
        int[] resultSetOfPrimeFactors = new int[20];
        primeFactors(input,2,resultSetOfPrimeFactors,0);
        System.out.print(input+"="+ resultSetOfPrimeFactors[0]);
        for ( int i = 1; i <= 20; i++){
        	if (resultSetOfPrimeFactors[i] == 0){
        		return;
        	}
        	else{
        		System.out.print("x"+resultSetOfPrimeFactors[i]);
        	}
        }
              
    }
}
