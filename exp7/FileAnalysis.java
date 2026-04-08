import java.io.*;
import java.util.*;

public class FileAnalysis {
    public static void main(String[] args) {

        int vowelCount = 0;
        int wordCount = 0;
        int aCount = 0;

        try {
            File file = new File("sample2.txt"); // change path if needed
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Convert line to lowercase for easy checking
                line = line.toLowerCase();

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);

                    // Count vowels
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    }

                    // Count 'a'
                    if (ch == 'a') {
                        aCount++;
                    }
                }
            }

            sc.close();

            // Display results
            System.out.println("Total vowels: " + vowelCount);
            System.out.println("Total words: " + wordCount);
            System.out.println("Occurrences of 'a': " + aCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}