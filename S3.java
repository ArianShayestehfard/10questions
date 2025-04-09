import java.util.Scanner;
public class S3 {
    public static void main(String[] args) {
                System.out.print("Enter brackets: ");
                String input = new Scanner(System.in).nextLine();

                int prantez = 0, acolad = 0, koroshe = 0;
                boolean valid = true;

                for (char c : input.toCharArray()) {
                    if (c == '(') prantez++;
                    else if (c == '{') acolad++;
                    else if (c == '[') koroshe++;
                    else if (c == ')') prantez--;
                    else if (c == '}') acolad--;
                    else if (c == ']') koroshe--;

                    if (prantez < 0 || acolad < 0 || koroshe < 0) {
                        valid = false;
                        break;
                    }
                }
                if (valid && prantez == 0 && acolad == 0 && koroshe == 0) {
                    System.out.println("Valid");
                }
                else {
                    System.out.println("Invalid");
                }
            }
        }
