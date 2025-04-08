import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String original = sc.nextLine();
        String result = "";

        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            if (result.indexOf(c) == -1) {
                result = result + c;
            }
        }
        System.out.println("Result: " + result);
    }
}