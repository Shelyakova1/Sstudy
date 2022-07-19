public class Task4 {
    public static void main(String[] args) {
        int[][] array = {{42, 25}, {12, 15}, {89, 76}
        };

        print(array);
        System.out.println();

        int[][] arrayInv = {{0, 0}, {0, 0}, {0, 0}};

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                int indexI = (array.length - 1) - i;
                int indexJ = (array[i].length - 1) - j;

                arrayInv[indexI][indexJ] = array[i][j];
            }
        }
        print(arrayInv);
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
