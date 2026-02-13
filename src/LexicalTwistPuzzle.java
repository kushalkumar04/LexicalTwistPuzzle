import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        WordValidator validator = new WordValidator();
        LexicalAnalyzer analyzer = new LexicalAnalyzer();

        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        if (!validator.isSingleWord(word1)) {
            System.out.println(word1 + " is an invalid word");
            return;
        }

        if (!validator.isSingleWord(word2)) {
            System.out.println(word2 + " is an invalid word");
            return;
        }

        if (analyzer.isReverse(word1, word2)) {
            System.out.println(analyzer.transformWord(word1));
        } else {
            analyzer.analyzeWords(word1, word2);
        }
    }
}
