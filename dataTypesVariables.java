// Ryan Kelley, 09/13/21, Data Types and Variables v1.5

public class Main // This is a CLASS declaration.  
{
// Difference between println and print 
    public static void main(String[] args) { // This is a METHOD declaration.
        System.out.println("What will print on the screen?");
        System.out.print("What will print on the screen?");
        System.out.print("  This is what will print on the screen.");


        // PRIMITIVE Data Types & Variables 
        // Java has STATIC TYPING: you must declare variables before use.
        double time;  // This is a FLOATING POINT VALUE (has decimal). 
        double avgGrade = 54.5; // Value ASSIGNED.  

        boolean lightsOn; // This is a BOOLEAN VALUE, True or False.  
        boolean isRaining = false; // Value ASSIGNED. 

        int ageInYears; // This is an INTEGER (whole numbers, pos/neg.)
        int speedLimit = 11222525; // Value ASSIGNED. 

        String userName;  // This is a STRING (collection of characters.)
        String streetName = "123 Sesamstraße"; // Value ASSIGNED. 

        final int speedOfLight = 3000000; // Prevents variable from changing. 

    }

}