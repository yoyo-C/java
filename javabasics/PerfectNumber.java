package javabasics;
import java.util.Scanner;
public class PerfectNumber {	
	public static boolean isPerfect(int num){
		int amount = 0;
		for (int i = 1; i < num; i++){
			if (num % i == 0){
				amount += i;
			}
		}
		if (amount == num){
			return true;
		}
		return false;
	}	
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.close();
        int index = 0;
        int[] resultSetOfPerfectNum = new int[1000];
        for (int i = n; i <= m; i++){
        	if (i == 1){
        		continue;
        	}
        	if (isPerfect(i)){
        		resultSetOfPerfectNum[index] = i;
        		index++;
        	}
        }
        if (resultSetOfPerfectNum[0] == 0){
        	System.out.println();
        }
        else{
        	System.out.print(resultSetOfPerfectNum[0]);
        	for ( int i = 1; i <= 1000; i++){
        		if (resultSetOfPerfectNum[i] == 0){
        			return;
        		}
        		else{
        			System.out.print(" " + resultSetOfPerfectNum[i]);
        		}
        	}      	
        }
   
    }
}
