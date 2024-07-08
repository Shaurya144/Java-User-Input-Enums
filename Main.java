
// Java User Input
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Username: ");

        String User_Name = myObj.nextLine(); // this reads the user's input which is on the next line
        System.out.println("So, your name is ... " + User_Name + ". Nice to meet you!");
    }
}

// Enums are a special class used to define a group of constants (final
// variables)
enum Grades {
    Below_Expected,
    Expected,
    Above_Expected
}

// They can be created inside classes and are usually used in switch cases
