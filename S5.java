import java.util.Scanner;
public class S5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String num = sc.next();

        if (num.length() % 2 != 0) {
            System.out.println("Need even digits");
            return;
        }

        int half = num.length() / 2;
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < half; i++) {
            sum1 += Integer.parseInt(num.substring(i, i+1));
        }
        for (int i = half; i < num.length(); i++) {
            sum2 += Integer.parseInt(num.substring(i, i+1));
        }

        if (sum1 == sum2) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}