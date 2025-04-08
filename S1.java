import java.util.Scanner;

public class S1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("First Number: ");
            String a = sc.nextLine();

            System.out.print("Second Number: ");
            String b = sc.nextLine();

            StringBuilder r = new StringBuilder();
            int i = a.length() - 1, j = b.length() - 1, c = 0;

            while (i >= 0 || j >= 0 || c > 0) {
                int x;
                if (i >= 0) x = a.charAt(i--) - '0';
                else x = 0;
                int y;
                if (j >= 0) y = b.charAt(j--) - '0';
                else y = 0;
                int s = x + y + c;
                r.append(s % 10);
                c = s / 10;
            }

            System.out.println("Sum: " + r.reverse());
            sc.close();
        }
    }
