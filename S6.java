import java.util.Scanner;
    public class S6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter array (put space): ");
            String[] input = sc.nextLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            System.out.print("Enter first number: ");
            int x = sc.nextInt();

            System.out.print("Enter second number: ");
            int y = sc.nextInt();

            int minDist = Integer.MAX_VALUE;
            int prev = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x || arr[i] == y) {
                    if (prev != -1 && arr[prev] != arr[i]) {
                        minDist = Math.min(minDist, i - prev)-1;
                    }
                    prev = i;
                }
            }

            if (minDist == Integer.MAX_VALUE) {
                System.out.println("Not found");
            }
            else {
                System.out.println("Minimum distance: " + minDist);
            }
            sc.close();
        }
    }
