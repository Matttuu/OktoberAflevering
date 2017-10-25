package Mattu;
// opret dig selv og nogle klassekammerater som objekter af typen Studerende.



public class Studerende {

    //Two datafields containing an integer and the String class.
    String name;
    int age;

    //A no-arg constructor that creates a default student
    private Studerende() {
        this.name = "Magnus";
        this.age = 18;
    }

    //  A constructor that creates a student with the specified name and age.
    public Studerende(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // User can configure the age of the student.
    private void setName(String name) {
        this.name = name;
        System.out.println("Students name has been succesfully changed to :" + name);
    }
    // User can configure the name of the student.
    private void SetAge(int age){
        this.age = age;
        System.out.println("Students age has been successfully changed to :" + age);
    }
    // Return name
    private String getName() {
        return name;
    }
    // Return age
    private int getAge(){
        return age;
    }






}
