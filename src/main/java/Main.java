import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int length, min = 100;
        System.out.print("Введите размерность матрицы: ");
        try {
            length = sc.nextInt();
            int[][] matrix = new int[length][length];
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    matrix[i][j] = rand.nextInt(100);
                }
            }
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < length; i++) {
                if((matrix[i][(length-1) - i] < min) && (i != (length-1) - i)){
                    min = matrix[i][(length-1) - i];
                }
            }

            System.out.println("Наименьшее число по диагонали (не считая центрального): " + min);
        }
        catch(Exception e){
            System.out.println("Введено значение несоответствующего типа!");
        }
    }
}
