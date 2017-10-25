package Mattu;

// skal indeholde minimum 5 ting, der illustrerer det, du har lært i september,
// f.eks. if, for, while, Random, Date, enum, Scanner, String eller andet, vi har snakket om.
// Skriv kommentar, der viser din forståelse af koden.

import java.io.FileNotFoundException;

public class MineMetoder {

    public void Stuff(){
        // Declare and initialiase 'file' variable
        java.io.File file = new java.io.File("Students.txt");

        // If the file already exists print out a message and stop the process
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
        // If the file doesn't exist it will create a new one using the PrintWriter Class.
        try (
                // Create a file
                java.io.PrintWriter output = new java.io.PrintWriter(file);
        ) {
            // Write formatted output to the file
            output.print("Dolan ");
            output.println(60);
            output.print("Goofy ");
            output.println(58);
        }
        // If the file can't be found it this will come into play.
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
