/**
 * PatternGenerator.java
 *
 * Small utility class with static methods that print simple console patterns:
 * - stars: prints incremental lines of '*' characters
 * - triangle: prints a numeric triangle
 * - odds: prints descending odd-numbered rows
 * - eo: prints a palindromic E/O pattern
 * - pyramid: prints centered numeric pyramid
 *
 * Usage: java PatternGenerator
 *
 * Author: (your name or handle)
 * Created: 2025-11-06
 */
/**
 * Utility class containing static methods to demonstrate simple console patterns.
 */
public class PatternGenerator {
   
    /*
     * Precondition: rows >= 0
     * Postcondition: Prints a sequence of lines of '*' characters. The method prints
     *                an initial line with one '*' and then prints (rows + 1) additional
     *                lines where each subsequent line has one more '*' than the previous.
     */
    public static void stars(int rows){
            String symbol = "*";
            System.out.println(symbol);
            int i = 0;
            while (i <= rows){
                symbol += "**"; 
                System.out.println(symbol);
                i++;
            }
        }
    /*
     * Precondition: rows >= 1
     * Postcondition: Prints 'rows' lines; the n-th line contains the digit n repeated n times.
     */
    public static void triangle(int rows){
    int num = 1;
    int i = 1;
     while ( i <= rows){ 
            int x = 1;
                while ( x <= num){
                System.out.print(num);
                 x++;
                }
                System.out.println();
                num += 1;
                i++;
            }
        }
                /*
                 * Precondition: start > 0 (typically an odd positive integer)
                 * Postcondition: Prints descending blocks of repeated digits. The first line contains
                 *                'start' repeated 'start' times, the next line prints (start-2) repeated
                 *                (start-2) times, and so on until the loop terminates.
                 */
                public static void odds(int start){
                     int num2 = start ;
                 for (; start >= 1; start -= 2) { 
                for (int x = 1; x <= num2; x ++ ) {
                System.out.print(num2);
                }
                System.out.println();
                num2 -= 2;
            } 
        }
    /*
     * Precondition: maxE >= 1
     * Postcondition: Prints a symmetric (palindromic) pattern of lines containing only
     *                'E' or 'O' characters. Each line i contains i copies of the chosen
     *                character; the full pattern increases to maxE and then decreases.
     *                The mapping of parity to character depends on whether maxE is even or odd.
     */
    public static void eo(int maxE){
    if(maxE % 2 == 0){
            for (int i = 1; i <= maxE; i++) {
                if(i % 2 == 0){
                for (int x = 1; x <= i; x++){
                     System.out.print("E");
                    }
                }
                else{
                    for (int x = 1; x <= i; x++){
                     System.out.print("O");
                    }
                }
                System.out.println();
            }
              for (int i = maxE - 1; i >= 1; i--) {
                if(i % 2 == 0){
                for (int x = 1; x <= i; x++){
                     System.out.print("E");
                    }
                }
                else{
                    for (int x = 1; x <= i; x++){
                     System.out.print("O");
                    }
                }
                System.out.println();
            }
        }
        else{
           for (int i = 1; i <= maxE; i++) {
                if(i % 2 == 0){
                for (int x = 1; x <= i; x++){
                     System.out.print("O");
                    }
                }
                else{
                    for (int x = 1; x <= i; x++){
                     System.out.print("E");
                    }
                } 
                System.out.println();
        }
        for (int i = maxE - 1; i >= 1; i--) {
                if(i % 2 == 0){
                for (int x = 1; x <= i; x++){
                     System.out.print("O");
                    }
                }
                else{
                    for (int x = 1; x <= i; x++){
                     System.out.print("E");
                    }
                }
                System.out.println();
            }
    }

        }
        /*
         * Precondition: rows >= 1
         * Postcondition: Prints a centered numeric pyramid of 'rows' lines. Line i contains the
         *                digit i repeated (2*(rows-i)+1) times, preceded by leading spaces to center it.
         */
        public static void pyramid(int rows){
            int num = 1;
            int num2 = (rows * 2) - 1;
         for (int i = 1; i <= rows; i++){
            for (int z = 1; z <= num-1; z++){
             System.out.print(" ");
            }
        for (int x = 1; x <= num2  ; x++){
          System.out.print(num);
         }
         System.out.println();
         num++;
         num2 -= 2;
         }

        }

    /*
     * Precondition: none
     * Postcondition: Executes example calls to the pattern methods; prints example patterns
     *                to standard output.
     */
    public static void main(String[] args){
            //stars(5);
            //triangle(9);
            //odds(9);
            //eo(5);
            //pyramid(5);
        }
    
}