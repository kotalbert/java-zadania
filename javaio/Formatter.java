package javaio;


public class Formatter {

    /**
     * 10.1
     */
    public static void fraction() {
        float fract = 4/(float) 7;
        System.out.printf("%.4f", fract);
    }
    
    /**
     * 10.2
     */
    public static void mathConstants() {
    
        System.out.printf("PI:\t%.10f\n", Math.PI);
        System.out.printf("E:\t%.10f\n", Math.E);
        float fib = (1+(float)Math.sqrt(5))/ 2;
        System.out.printf("Fib:\t%.10f\n",fib);
        
    }
    
    /**
     * 10.3
     */
    public static void printNumbers() {
        int[] nums = {2,3,5,7,11,13,17};
        
        for (int i : nums) {
            System.out.printf("%d\t%.8g\t%.8g\n",i, Math.sqrt(i), Math.pow(i, 1/(float)3));
        }
    }
    
    /**
     * 10.4
     */
    public static void printRootsOfFive() {
    
        for (int root=2;root<=10;root++) {
            System.out.printf("%d\t%.6f\n", root, Math.pow(5, 1/(float)root));
        }
       
    }
    
    /**
     * 10.5
     */
    public static void charFormat() {
        char[] LETTERS = "ABCDEFGHIJKLMNOPRSTQUWYZ".toCharArray();
        for (char c: LETTERS) {
            System.out.printf("%c\t%o\t%d\t%x\n",c, (int) c, (int) c, (int) c);
        }
        
    }
    

    
}
