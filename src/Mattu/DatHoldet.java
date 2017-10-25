package Mattu;
// Denne klasse skal indeholde nogle klasse-variabler, constructors og
 // klasse-metoder, som kan beskrive datamatikerstuderende på dit hold.

public class DatHoldet {


    // Creating a few students
    Studerende Donald = new Studerende("Dolan", 60);
    Studerende Goofy = new Studerende("Goofy", 58);


    // This prints out the students when it's initialised
    public void printNames(){
              System.out.println(Donald.name);
        System.out.println(Goofy.name);
    }
}
