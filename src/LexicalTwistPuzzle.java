import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        // Validation
        if (word1.contains(" ")) {
            System.out.println(word1 + " is an invalid word");
            return;
        }

        if (word2.contains(" ")) {
            System.out.println(word2 + " is an invalid word");
            return;
        }

        // Reverse relationship check
        String reversedWord = new StringBuilder(word1).reverse().toString();

        if (reversedWord.equalsIgnoreCase(word2)) {

            String transformed = reversedWord
                    .toLowerCase()
                    .replaceAll("[aeiou]", "@");

            System.out.println(transformed);

        } else {

            System.out.println("The words are not reverse of each other.");

        }
    }
}
