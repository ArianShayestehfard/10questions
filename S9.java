import java.util.Scanner;

public class S9 {
    public static void main(String[] args) {
        String[] candidates = {"Ali", "Arian", "Ahmad", "Radin", "Hamid"};
        int[] scores = {0, 0, 0, 0, 0};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 25; i++) {
            System.out.println("\nEnter the candidate number to vote");
            System.out.println("Ali : (1) ");
            System.out.println("Arian : (2) ");
            System.out.println("Ahmad : (3) ");
            System.out.println("Radin : (4) ");
            System.out.println("Hamid : (5) ");
            System.out.println("No vote : (6)");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scores[0]++;
                    break;
                case 2:
                    scores[1]++;
                    break;
                case 3:
                    scores[2]++;
                    break;
                case 4:
                    scores[3]++;
                    break;
                case 5:
                    scores[4]++;
                    break;
                case 6:
                    System.out.println("No Vote");
                    break;
                default:
            }
        }

        int maxVotes = scores[0];
        int winnerIndex = 0;

        for (int j = 1; j < scores.length; j++) {
            if (scores[j] > maxVotes) {
                maxVotes = scores[j];
                winnerIndex = j;
            }
        }

        System.out.println("\nThe winner is " + candidates[winnerIndex] +
                " with " + maxVotes + " votes!");

        scanner.close();
    }
}