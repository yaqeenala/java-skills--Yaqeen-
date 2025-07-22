import java.lang.classfile.instruction.StackInstruction;
import java.util.Random;

public class TextProcessor {

    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        int wordsCounter = words.length;
        return wordsCounter;
    }

    public static String replaceWord(String text, String oldWord, String newWord) {
        String newText = text.replace(oldWord, newWord);
        return newText;
    }

    public static void main(String[] args) {
        String testText = "Java is fun and Java is powerful";

        int wordCount = countWords(testText);
        System.out.println("Number of words: " + wordCount);

        String replacedText = replaceWord(testText, "Java", "Programming");
        System.out.println("Replaced text: " + replacedText);
    }
}

