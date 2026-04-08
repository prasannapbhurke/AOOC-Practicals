import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\PRASANNA\\Desktop\\AOOC-Practicals-4th sem\\exp7\\sample.txt");

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}