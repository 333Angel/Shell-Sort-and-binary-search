import java.util.*;

public class MainFile
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many scores will you be enter?");
        int size = input.nextInt();

        int[] scoreList = new int[size];

        // collects the scores
        System.out.println("Enter " + size + " scores:"); 
        for (int i = 0; i < size; i++) {
            scoreList[i] = input.nextInt();
        }

        ArrayUtils.shellSort(scoreList);

        System.out.println("\nSorted scores:");
        for (int s: scoreList) {
            System.out.print(s + " ");
        }
        System.out.println();
        
        // repeats the binary search
        boolean searching = true;
        
        while (searching) {
            System.out.println("\nEnter a score to search for:");
            
            int target = input.nextInt();
            int index = ArrayUtils.binarySearch(scoreList, target);
            
            if (index != -1) {
                System.out.println("Score " + target + " was found at position " + index + ".");
            } else {
                System.out.println("Score " + target + " not found.");
            }
            
            System.out.println("Would you like to search again? (y/n): ");
            char playAgain = input.next().toLowerCase().charAt(0);
            
            if (playAgain != 'y'){ searching = false;}
            
            System.out.println("\nProgram finished.");
        }
    }
}
