import java.util.Scanner;

public class Task3a {
    public static void main(String[] args) {
        double numbersForCheck[] = {5, 0, -3, 2};
        for (int i = 0; i < numbersForCheck.length; i++) {
            double a = numbersForCheck[i];
            a = ((a == 2 || a == 0) ? a + 7 : a / 10);
            System.out.println(a);
        }
    }
}
