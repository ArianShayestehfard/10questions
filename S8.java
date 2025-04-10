import java.util.Scanner;
import java.util.Arrays;
public class S8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array Length:");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        System.out.println("Enter " + length + " numbers:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            if(count > 1){
                System.out.println("Count for " + arr[i] + " is: " + count);
            }
            else {
                System.out.println("No Repeats of digit :" + arr[i]);}
        }
    }
}