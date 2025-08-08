// Problem-2.java
import java.util.Scanner;

public class OddSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

    
        int number = 1;
        for (int i = 1; i <= a; i++) {
            System.out.print(number);
            if (i != a) {
                System.out.print(", ");
            }
            number += 2;
        }
    }
}

