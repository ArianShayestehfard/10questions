import java.util.Scanner;
import java.util.Arrays;
public class S10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Candidate_count = 5, Voters_count = 25, j , i;
        String[] Candidates = {"Arian", "Hamid", "Ahmad", "Radin", "Ali"};
        int[] Score = {0, 0, 0, 0, 0};

        System.out.println("Candidates: Arian -> Hamid -> Ahmad -> Radin -> Ali ");

        for  (i = 0; i < Voters_count; i++) {
            for (j = 0; j < Candidate_count; j++) {
                String place = switch (j) {
                    case 0 -> "First";
                    case 1 -> "Second";
                    case 2 -> "Third";
                    case 3 -> "Fourth";
                    case 4 -> "Fifth";
                    default -> "";
                };
                System.out.print("Enter your " + place + " vote: ");
                String B = sc.nextLine().trim();
                int indices = Arrays.asList(Candidates).indexOf(B);


                switch (indices) {
                    case 0:
                        Score[0]++;
                        break;
                    case 1:
                        Score[1]++;
                        break;
                    case 2:
                        Score[2]++;
                        break;
                    case 3:
                        Score[3]++;
                        break;
                    case 4:
                        Score[4]++;
                        break;
                    default:
                        System.out.println("Invalid name: " + B);
                }
            }
        }
        int max = 0;
        String winner = "";
        for (int a = 0; a < 5; a++) {
            if (Score[a] > max) {
                max = Score[a];
                winner = Candidates[a];
            }
        }
        System.out.println("Winner: " + winner);
    }
}
