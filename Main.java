import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            // Create a file object
            File file = new File("example.txt");

            // Create a new file
            if (file.createNewFile()) {
                System.out.println("✅ File created: " + file.getName());
            } else {
                System.out.println("ℹ️ File already exists.");
            }

            // Display file information
            System.out.println("\n----- FILE DETAILS -----");
            System.out.println("File Name       : " + file.getName());
            System.out.println("File Path       : " + file.getAbsolutePath());
            System.out.println("Can Read        : " + file.canRead());
            System.out.println("Can Write       : " + file.canWrite());
            System.out.println("Can Execute     : " + file.canExecute());
            System.out.println("File Size       : " + file.length() + " bytes");
            System.out.println("File Exists     : " + file.exists());

            // Create a folder
            File folder = new File("StudentRecords");

            if (folder.mkdir()) {
                System.out.println("\n📁 Folder created: " + folder.getName());
            } else {
                System.out.println("\n📁 Folder already exists.");
            }

            // Rename file
            File renamedFile = new File("StudentData.txt");

            if (file.renameTo(renamedFile)) {
                System.out.println("✏️ File renamed to: " + renamedFile.getName());
            } else {
                System.out.println("❌ Unable to rename file.");
            }

            // Display current date and time
            System.out.println("\nProgram executed successfully!");
            System.out.println("Current Time: " + java.time.LocalDateTime.now());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}