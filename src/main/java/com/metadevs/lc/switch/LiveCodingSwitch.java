s
import java.util.Scanner;

public class LiveCodingSwitch {

    final static int FIRST_DECLEMINATION = 1;
    final static int SECOND_DECLEMINATION = 2;
    final static int THIERD_DECLEMINATION = 3;
    final static int FOURT_DECLEMINATION = 4;
    static Scanner scanAge = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число.");
        int k = scanAge.nextInt();
        int x;
        x = k % 10;
        switch (x) {
            case FIRST_DECLEMINATION:
                switch (k) {
                    case 11:
                        System.out.println("Мне " + k + " лет");
                        break;
                    default:
                        System.out.println("Мне " + k + " год");
                        break;
                }
                break;
            case SECOND_DECLEMINATION:
                switch (k) {
                    case 12:
                        System.out.println("Мне " + k + " лет");
                        break;
                    default:
                        System.out.println("Мне " + k + " года");
                        break;
                }
                break;
            case THIERD_DECLEMINATION:
                switch (k) {
                    case 13:
                        System.out.println("Мне " + k + " лет");
                        break;
                    default:
                        System.out.println("Мне " + k + " года");
                        break;
                }
                break;
            case FOURT_DECLEMINATION:
                switch (k) {
                    case 14:
                        System.out.println("Мне " + k + " лет");
                        break;
                    default:
                        System.out.println("Мне " + k + " года");
                        break;
                }
                break;
            default:
                System.out.println("Мне" + k + " лет");
                break;
        }
    }
}
