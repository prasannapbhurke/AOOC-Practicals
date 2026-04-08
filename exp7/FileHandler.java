import java.io.*;
import java.util.Scanner;

public class FileHandler {
    public static void main(String[] args) {

        // Check command-line argument
        if (args.length == 0) {
            System.out.println("Please provide file name as argument!");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        Scanner sc = new Scanner(System.in);

        try {
            // ----------- If file exists -----------
            if (file.exists()) {
                System.out.println("\nFile exists. Reading content:\n");

                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;

                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();

                // Ask user to append
                System.out.print("\nDo you want to add data to the end of the file? (Yes/No): ");
                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("Yes")) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

                    System.out.println("Enter data (type 'exit' to stop):");

                    while (true) {
                        String input = sc.nextLine();
                        if (input.equalsIgnoreCase("exit"))
                            break;

                        bw.write(input);
                        bw.newLine();
                    }

                    bw.close();
                    System.out.println("Data appended successfully!");
                }

            }
            // ----------- If file does NOT exist -----------
            else {
                System.out.println("\nFile does not exist. Creating new file...");

                BufferedWriter bw = new BufferedWriter(new FileWriter(file));

                System.out.println("Enter data (type 'exit' to stop):");

                while (true) {
                    String input = sc.nextLine();
                    if (input.equalsIgnoreCase("exit"))
                        break;

                    bw.write(input);
                    bw.newLine();
                }

                bw.close();
                System.out.println("File created and data written successfully!");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}