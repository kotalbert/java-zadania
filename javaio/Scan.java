package javaio;
import java.util.Scanner;


public class Scan {

    /**
     * 11.1
     */
    public static void printFarenheit() {
    
        System.out.println("Input temp in C:");
        System.out.print(">");
        
        Scanner input = new Scanner(System.in);
        double degC = Double.parseDouble(input.next());
        double degF = 1.8d*degC+32;
        System.out.printf("Temp in F:\t%.2g", degF);
    }
    
    /**
     * 11.3
     */
    public static void printHypotenuse(boolean useAngle) {

        double c = 0;
        
        if (!useAngle) {
            System.out.println("Input lengths of cathetus.");
            System.out.print(">");
            Scanner in = new Scanner(System.in);
            
            double a = Double.parseDouble(in.next());
            double b = Double.parseDouble(in.next());
            c = Math.sqrt(a*a + b*b);
        }
        else {
            System.out.println("Input length of cathetus and angle in degrees.");
            System.out.print(">");
            Scanner in = new Scanner(System.in);
            double a = Double.parseDouble(in.next());
            double alpha = Double.parseDouble(in.next());
            System.out.println(Math.sin(alpha));
            c = a/Math.sin(alpha);
        }
        
        System.out.printf("Hypotenuse: %.2f\n", c);
    
    }
    
    /**
     * 11.5
     */
    public static void decimalFraction() {
        System.out.println("Input numerator / denominator.");
        System.out.print(">");
        Scanner input = new Scanner(System.in).useDelimiter("/");
        
        int numerator = input.nextInt();
        int denominator = input.nextInt();
        
        System.out.printf("%d\t%d\n", numerator, denominator);
    }
    
}
