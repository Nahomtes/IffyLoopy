import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//       Part One: Loopy
        String fiveWordsString = "";
        int numOfWord = 5;
        for (int i= 0; i < numOfWord; i++){
            System.out.println("Enter Random Word: ");
            fiveWordsString += scanner.next();
        }
        System.out.printf("Your Random Words as one word: %s\n", fiveWordsString);

//       Part Two: Iffy
        String tryAgain = "n";
        do {
            boolean redEyes = false;

            System.out.println("Are your eyes red?");
            String redEyesAns = scanner.next();
            redEyesAns = redEyesAns.toLowerCase();

            // if redEyesAns was y/Y or yes/YES
            redEyes = (redEyesAns.charAt(0) == 'y');

            if (redEyes){
                System.out.println("\tGet some sleep!\n");
            } else {
                System.out.println("\tYou look great!\n");
            }

            System.out.println("Do you want to try again?");
            tryAgain = scanner.next();
        } while (!tryAgain.equals("n"));

        scanner.close();

    }
}
