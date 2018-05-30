
package Fibbonacci;
import java.util.*;
class Fibbonacci{
public static void main(String args[]) {
    int f1=0, f2=1, f3, i, limit;
    Scanner insLim = new Scanner(System.in);
    System.out.println("Ciag Fibbonacciego");
    System.out.println("Wprowadz limit liczb z ciagu (od 1 do 25:");
    limit = insLim.nextInt();
    System.out.print(f1 + " " + f2 + " ");
        for (i = 2; i<=limit; i++){
            f3=f1+f2;
            System.out.print(f3 + " ");
            f1=f2;
            f2=f3;
            }
        System.out.println();
        }     
}
