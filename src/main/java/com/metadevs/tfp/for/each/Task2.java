import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int from = scann.nextInt();
        int to = scann.nextInt();
        printAllEven(from, to);
    }

    private static void printAllEven(int from, int to) {
        if (from > to) {
            System.out.println("Введены некорректные данные");
            return;
        }
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}