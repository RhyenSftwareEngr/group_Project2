package prog2.pregroup;

import java.util.Scanner;
public class Matrices {
    private static int[][] matrix1;
    private static int[][] matrix2;
    static int r, c, i, j;

    //Method responsible for changing the sizes of the matrices
    public static void initializeMatrix() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows of matrix 1: ");
        r = scan.nextInt();
        System.out.print("Enter the number of columns of matrix 1: ");
        c = scan.nextInt();
        matrix1 = new int[r][c];

        System.out.print("Enter the number of rows of matrix 2: ");
        r = scan.nextInt();
        System.out.print("Enter the number of columns of matrix 2: ");
        c = scan.nextInt();
        matrix2 = new int[r][c];
    }

    //Shows both of the matrices and its current values
    public static void showMatrices() {
        showMatrix("1", matrix1);
        showMatrix("2", matrix2);
    }

    //Shows the value of a given matrix
    private static void showMatrix(String mName, int[][] matrix) {
        System.out.println("Matrix " + mName +": " + matrix.length + " x " + matrix[0].length);
        System.out.print("[");
        for (int x=0; x<matrix.length; x++) {
            System.out.print("[");
            for (int y=0; y<matrix[x].length; y++) {
                if (y == 0) {
                    System.out.print(matrix[x][y]);
                } else {
                    System.out.print(", " + matrix[x][y]);
                }
            }
            if (x == matrix.length-1) {
                System.out.print("]");
            } else {
                System.out.print("],\n");
            }
        }
        System.out.print("]\n");
    }

    //Method for changing the value of matrix 1
    public static void changeMatrix1Value() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values of matrix 1 from(left to right) first row column 1 " +
                "until the last row-last column format");
        for (i = 0; i < matrix1.length; i++) {
            for (j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
    }

    //Method for changing the value of matrix 2
    public static void changeMatrix2Value() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values of matrix 2 from(left to right) first row column 1 " +
                "until the last row-last column format");
        for (i = 0; i < matrix2.length; i++) {
            for (j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }
    }

    //Adds matrix 1 and 2 and prints the result
    public static void addMatrices() {
        if (!(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length)) {
            System.out.println("The two matrices should have the same size.");
            return;
        }

        int[][] res = new int[matrix1.length][matrix1[0].length];
        for (i = 0; i < matrix1.length; i++) {
            for (j = 0; j < matrix1[0].length; j++) {
                res[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The sum is: ");
        showMatrix("Result", res);
    }

    //Subtracts matrix 1 and 2 and prints the result
    public static void subtractMatrices() {
        if (!(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length)) {
            System.out.println("The two matrices should have the same size.");
            return;
        }

        int[][] res = new int[matrix1.length][matrix1[0].length];
        for (i = 0; i < matrix1.length; i++) {
            for (j = 0; j < matrix1[0].length; j++) {
                res[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("The difference is: ");
        showMatrix("Result", res);
    }
}


// MAIN CLASS
