import java.util.LinkedHashSet;
import java.util.Set;

public class LexicalAnalyzer {

    public boolean isReverse(String word1, String word2) {
        String reversed = new StringBuilder(word1).reverse().toString();
        return reversed.equalsIgnoreCase(word2);
    }

    public String transformWord(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return reversed.toLowerCase().replaceAll("[aeiou]", "@");
    }

    public void analyzeWords(String word1, String word2) {

        String combined = (word1 + word2).toUpperCase();

        int vowelCount = 0;
        int consonantCount = 0;

        Set<Character> uniqueVowels = new LinkedHashSet<>();
        Set<Character> uniqueConsonants = new LinkedHashSet<>();

        for (int i = 0; i < combined.length(); i++) {

            char ch = combined.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {

                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowelCount++;
                    uniqueVowels.add(ch);
                } else {
                    consonantCount++;
                    uniqueConsonants.add(ch);
                }
            }
        }

        if (vowelCount > consonantCount) {

            int count = 0;
            for (char v : uniqueVowels) {
                System.out.print(v);
                count++;
                if (count == 2) break;
            }

        } else if (consonantCount > vowelCount) {

            int count = 0;
            for (char c : uniqueConsonants) {
                System.out.print(c);
                count++;
                if (count == 2) break;
            }

        } else {
            System.out.println("Vowels and consonants are equal");
        }
    }
}
