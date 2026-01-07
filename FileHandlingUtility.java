import java.io.*;

public class FileHandlingUtility {

    public static void main(String[] args) {

        String fileName = "codtech_file.txt";

        try {

            FileWriter writer = new FileWriter(fileName);
            writer.write("CODTECH Internship - Java Programming\n");
            writer.write("Task 1: File Handling Utility\n");
            writer.close();

            System.out.println("File written successfully.\n");

            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("Reading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            FileWriter modifier = new FileWriter(fileName, true);
            modifier.write("\nThis file has been modified successfully.");
            modifier.close();

            System.out.println("\nFile modified successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
