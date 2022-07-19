import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите название месяца.");
        Scanner scannMonth = new Scanner(System.in);
        String month = scannMonth.nextLine();
        month = month.toLowerCase();
        switch (month) {
            case "январь":
                System.out.println("Зима");
                break;
            case "февраль":
                System.out.println("Зима");
                break;
            case "март":
                System.out.println("Весна");
                break;
            case "апрель":
                System.out.println("Весна");
                break;
            case "май":
                System.out.println("Весна");
                break;
            case "июнь":
                System.out.println("Лето");
                break;
            case "июль":
                System.out.println("Лето");
                break;
            case "август":
                System.out.println("Лето");
                break;
            case "сентябрь":
                System.out.println("Осень");
                break;
            case "октябрь":
                System.out.println("Осень");
                break;
            case "ноябрь":
                System.out.println("Осень");
                break;
            case "декабрь":
                System.out.println("Зима");
                break;
            default:
                System.out.println("Введены некорректные данные");
        }
    }
}
