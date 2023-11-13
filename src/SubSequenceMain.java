import java.util.Scanner;

public class SubSequenceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word that you think is subsequence of the other(Which is shorter)");
        String firstWord = scanner.nextLine();
        System.out.println("Enter the second word that you think has the first word in it(Which is suppose to be longer)");
        String secondWord = scanner.nextLine();
        System.out.println(SubSequence.isSubsequence(firstWord,secondWord));
    }
}
