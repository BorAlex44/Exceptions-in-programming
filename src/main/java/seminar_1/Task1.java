package seminar_1;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //randomArray();
        //printArray(randomArray());
        isSquareMatrix(randomArray());


    }
    private static int[][] randomArray(){
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int num1 = in.nextInt();
        System.out.print("Введите размерность матрицы: ");
        int num2 = in.nextInt();
        int[][] matrix = new int[num1][num2];
        for (int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix[i].length; j ++){
                matrix[i][j] = rnd.nextInt(2);
            }
        }
        return matrix;
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isSquareMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                throw new RuntimeException("матрица не квадратная");
                //System.out.println("-");
                //return false;
            }
        }
        System.out.println("Все ок матрица квадратная");
        return true;
    }
}
