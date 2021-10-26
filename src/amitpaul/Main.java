/* Name:Amit Paul
  ID    : 2012020164
  Section : D
  email : cse_2012020164@lus.ac.bd
  Date  : 15-10-2021
 */ 
package amitpaul;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        AdvancedArithmetic advancedArithmetic = new MyCalculator();

        System.out.print("Enter a number to find divisor of sum: ");
        int num1 = input.nextInt();
        advancedArithmetic.divisorSum(num1);

        System.out.print("Enter a number to find factorial: ");
        int num2 = input.nextInt();
        advancedArithmetic.findFactorial(num2);
    }
}
