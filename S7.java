import java.util.Arrays;
import java.util.Scanner;

public class S7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array 1: ");
        int[] arr1 = new int[scanner.nextInt()];
        System.out.println("Enter elements of array 1:");
        for (int i = 0; i < arr1.length; i++) arr1[i] = scanner.nextInt();

        System.out.print("Enter size of array 2: ");
        int[] arr2 = new int[scanner.nextInt()];
        System.out.println("Enter elements of array 2:");
        for (int i = 0; i < arr2.length; i++) arr2[i] = scanner.nextInt();

        if (arr1.length != arr2.length) {
            System.out.println("Arrays are not equal");
            return;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}