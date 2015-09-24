import java.util.Scanner;


public class TranslateTimeFromBJTToUTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int BJT, UTC;
		BJT = in.nextInt();
		if (BJT / 100 >= 8){
			UTC = BJT - 800;
		}
		else {
			UTC = BJT - 800 + 2400;
		}
		
		if (UTC / 10 >= 1){
			System.out.println(UTC);
		}
		else{
			System.out.println("0"+UTC);
		}
	}

}
