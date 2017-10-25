package Mattu;

// skal indeholde minimum 5 ting, der illustrerer det, du har lært i september,
// f.eks. if, for, while, Random, Date, enum, Scanner, String eller andet, vi har snakket om.
// Skriv kommentar, der viser din forståelse af koden.

import java.io.FileNotFoundException;
import java.util.Random;

public class MineMetoder {

    public void Stuff(){

        System.out.println("Generating 10 random integers in range 0-99.");
        Random randomThingy = new Random();
        for (int numbers = 1; numbers <= 10; numbers++){
            int randomInt = randomThingy.nextInt(100);
            System.out.println("Generated : " + randomInt);
        }
        System.out.println("Done");

        System.out.println("_________________________");
        System.out.println(" ");



        // Creating an array called "students" which has a max of 2 indexes.
        Studerende[] students = new Studerende[2];
        students[0] = new Studerende("Mattu", 24);
        students[1] = new Studerende("Mathias", 24);
        for (int i = 0; i < 2; i++)
        {
            System.out.println("Student " + (i + 1) + ": " + students[i].name + " |  Age:  " + students[i].age);
            System.out.println(" ");
        }



        System.out.println("_________________________");
        System.out.println("");




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
            System.out.println("File created.");
        }
        // If the file can't be found it this will come into play.
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }






    }

}
