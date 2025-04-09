import java.util.Random;
public class S4 {
    public static void main(String[] args) {

                int totalTosses = 1000;
                int headsCount = 0;
                int tailsCount = 0;

                Random random = new Random();

                for (int i = 0; i < totalTosses; i++) {

                    int result = random.nextInt(2);

                    if (result == 0) {
                        headsCount++;
                    } else {
                        tailsCount++;
                    }
                }
                double headsPercentage = (headsCount * 100.0) / totalTosses;
                double tailsPercentage = (tailsCount * 100.0) / totalTosses;

                System.out.println("Results :"  +totalTosses + " heads : % " + headsPercentage + " tails : %" +tailsPercentage);

    }
}
