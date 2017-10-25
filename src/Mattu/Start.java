package Mattu;
// Skal indeholde main() metoden, som bringer de andre 3 klasser i spil.

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {


   DatHoldet holdet1; // Declare holdet1 variable
   holdet1 = new DatHoldet(); // Initialise the variable

   holdet1.printNames(); // Prints out names of the added students.

        System.out.println("_____________________________");
        System.out.println("  ");

        MineMetoder creating = new MineMetoder();
        creating.Stuff();



    }

}
