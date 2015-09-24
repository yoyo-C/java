import java.util.Scanner;


public class FeatureOfOddandEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n, m;
		n = in.nextInt();
		m = in.nextInt();
		int amount = 0;
		int count = 1;
		if (n == 1){
		amount += 2;
		}
		else{
		for (int i = 3;count < m; i++){
			boolean flag = true;
			for (int j = 2;j < i; j++){
				if (i % j == 0){
		    			flag = false;
		    			break; 
		    		}   
		    	}
		    	if (flag){
		    		count++;
		    		if (count >= n){
		    		amount+=i;
		    		}
		    	}
		    }
		}
	}
}
