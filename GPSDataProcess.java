import java.util.Scanner;

public class GPSDataProcess {
    public static String timeTransfer(int t) {
        String temp = new String();
        if (t < 10) {
            temp = "0" + t;
        } else {
            temp = Integer.toString(t);
        }
        return temp;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String sentence = new String();
        int h = 0, m = 0, s = 0;
        sentence = in.nextLine();
        while (!sentence.equals("END")) {
            String charsForCount = sentence.substring(1, sentence.indexOf('*'));
            String checkCode = sentence.substring(sentence.indexOf('*') + 1);
            int code = Integer.parseInt(checkCode, 16);
            int temp = (int) charsForCount.charAt(0);
            for (int i = 1; i < charsForCount.length(); i++) {
                temp = temp ^ (int) charsForCount.charAt(i);
            }
            if (temp % 65536 == code) {
                String a = charsForCount.split(",")[2];
                if (a.equals("A")) {
                    String time = (charsForCount.split(",")[1]);
                    h = Integer.parseInt(time.substring(0, 2)) + 8;
                    if (h > 23) {
                        h -= 24;
                    }
                    m = Integer.parseInt(time.substring(2, 4));
                    s = Integer.parseInt(time.substring(4, 6));
                }
            }
            sentence = in.nextLine();
        }
        System.out.print(timeTransfer(h) + ":" + timeTransfer(m) + ":" + timeTransfer(s));
    }
}