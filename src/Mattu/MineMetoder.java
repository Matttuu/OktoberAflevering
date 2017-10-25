package Mattu;

// skal indeholde minimum 5 ting, der illustrerer det, du har lært i september,
// f.eks. if, for, while, Random, Date, enum, Scanner, String eller andet, vi har snakket om.
// Skriv kommentar, der viser din forståelse af koden.

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MineMetoder {

    public void Stuff(){

    //Declaring an integer with the name teacher, and make use of Math.random.
        int teacher = (int)((Math.random() * 3) +1);

        // Which teacher
        switch (teacher)
        {
            case 1:
                System.out.println("Todays teacher will be: Andras"); break;
            case 2:
                System.out.println("Todays teacher will be: Karsten"); break;
            case 3:
                System.out.println("Todays teacher will be: Douglas");
        }

        System.out.println("_________________________");
        System.out.println(" ");

     // By using the java utility Random instead of Math.random we avoid the result to be in doubles, so by using Random we get integers.
        System.out.println("Generating 10 random integers in range 0-99:");
        // Creating a Random object
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
        for (int i = 0; i < 2; i++)     // The for loop goes to a maximum of 2 since the array only has 2 indexes.
        {
            System.out.println("Student " + (i + 1) + ": " + students[i].name + " |  Age:  " + students[i].age);
            System.out.println(" ");
        }

                System.out.println("_________________________");
        System.out.println("");

        // Making a use of the Scanner utility.
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours do you spend at home programming each day? ");
        // Declaring an hours hours variable that prompts the user with an integer.
        int hours = input.nextInt();
        // If hours is more or equal to 5 it'll print this.
        if (hours >= 5){
            System.out.println("You are fucking awesome");
        }
        // If hours is less than 5, it'll print this.
        else {
            System.out.println("Perhaps you should put some more hours into it....");
        }

        System.out.println("_________________________");
        System.out.println("");

    // Declare and initialiase 'file' variable
        java.io.File file = new java.io.File("Students.txt");


        // If the file already exists print out a message and stop the process
        if (file.exists()) {
            // Making use of the java utility class called Date
            // As well as the method called java.io.File.lastModified(), which returns the last modified time of the file.
            System.out.println("File already exists, last time modified: " + new java.util.Date(file.lastModified()));

            System.exit(0);

        }
        // If the file doesn't exist it will create a new one using the PrintWriter Class.
        try (
                // Create a file
                java.io.PrintWriter output = new java.io.PrintWriter(file)

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
