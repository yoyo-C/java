package javabasics;
import java.util.Scanner;
public class TicTacToe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[][] spot = new int[num][num];
		for (int i = 0; i<num;i++){
			for (int j = 0; j< num; j++){
				spot[i][j] = in.nextInt();
			}
		}
		int amount[] = new int[2 * num + 2];
		for (int i = 0; i < num; i++){
			for (int j = 0; j< num; j++){
				amount[i] += spot[i][j];
				amount[num+i] += spot[j][i];
			}
		}
		for (int i = 0; i < num; i++){
			amount[num * 2] += spot[i][i];
			amount[num*2 + 1] += spot[i][num-i-1];
		}
		int zero = 0;
		int one = 0;
		for (int i = 0; i < num*2 + 2; i++){
			if (amount[i] == 4){
				one++;				
			}
			else if (amount[i] == 0){
				zero++;
			}
		}
		if (zero > one){
			System.out.print("O");
		}
		else if (zero < one){
			System.out.print("X");
		}
		else{
			System.out.print("NIL");
		}
		in.close();
	}
}
