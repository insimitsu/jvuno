
import java.util.Scanner;

public class Fibonacci {
        public static void main(String args[]) {
            int f1=0, f2=1, f3, i, howManyNumbers;
            Scanner userInput = new Scanner(System.in);
            System.out.println("Fibonacci Numbers");
            System.out.println();
            System.out.print("Type in how many numbers you'd like to see(limit:30): ");
            howManyNumbers = userInput.nextInt();
            System.out.print(f1 + " " + f2 + " ");
            for (i = 2; i<=howManyNumbers-1; i++){
                f3=f1+f2;
                System.out.print(f3 + " ");
                f1=f2;
                f2=f3;
            }
            System.out.println();
        }
}
