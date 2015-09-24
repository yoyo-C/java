import java.util.Scanner;
public class PrintOutPositiveIntegers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = new String();
		input = in.next();
		int lngth = input.length();
		for (int i = 0; i < lngth; i++){
			char temp = input.charAt(i);
			switch(temp){
			case '-':System.out.print("fu");break;
			case '1':System.out.print("yi");break;
			case '2':System.out.print("er");break;
			case '3':System.out.print("san");break;
			case '4':System.out.print("si");break;
			case '5':System.out.print("wu");break;
			case '6':System.out.print("liu");break;
			case '7':System.out.print("qi");break;
			case '8':System.out.print("ba");break;
			case '9':System.out.print("jiu");break;
			case '0':System.out.print("ling");break;
			}
			if (i < lngth - 1){
				System.out.print(" ");
			}
		}	
	}

}
