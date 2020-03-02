import java.util.Scanner;

public class Swap {

public static void main(String[]args) {


     int x, y, z;

    Scanner input = new Scanner (System.in) ;
       // write a program to swap two variables
    System.out.println( "Input the first number: " );
    x = input.nextInt();
    System.out.println( "Input the second number: " );
    y = input.nextInt();

    // Swap the value:

    z = x;
    x = y;
    y = z;
    System.out.println( "Swapped values are 2:"+ x + "and"+ y );










}

}
