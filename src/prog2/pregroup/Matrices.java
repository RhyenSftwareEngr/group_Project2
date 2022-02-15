package prog2.pregroup;

import java.util.Arrays;
import java.util.Scanner;
public class Matrices {
    private static int[][] matrix1;
    private static int[][] matrix2;
    static int r, c, i, j;

    //Method responsible for changing the sizes of the matrices
    public static void initializeMatrix() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows of matrix 1: ");
        r = Integer.parseInt(scan.nextLine());
        System.out.print("Enter the number of columns of matrix 1: ");
        c = Integer.parseInt(scan.nextLine());
        matrix1 = new int[r][c];

        System.out.print("Enter the number of rows of matrix 2: ");
        r = Integer.parseInt(scan.nextLine());
        System.out.print("Enter the number of columns of matrix 2: ");
        c = Integer.parseInt(scan.nextLine());
        matrix2 = new int[r][c];
        //Validation
        if(matrix1.length != matrix2.length && matrix1[0].length != matrix2[0].length) {
               System.out.println("Does not have the same rows and columns! Pls input again");
             initializeMatrix();
           }




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

    //Multiply matrix 1 and 2 and prints the result
    public static void multiplyMatrices() {
        if (!(matrix1[0].length == matrix2.length)) {
            System.out.println("The columns of the first matrix should be equal to the number of rows in the second matrix");
            return;
        }

        int[][] res = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++)
        {
            for (int j = 0; j < matrix2[0].length; j++)
            {
                for (int k = 0; k < matrix2.length; k++)
                {
                    res[i][j] +=  matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("The product is: ");
        showMatrix("Result", res);
    }

    //Transposes matrix 1 and 2 and prints the result
    public static void transposeMatrices() {

        System.out.println("The transpose of Matrix A is: ");
        showMatrix("Result", transposeMatrix(matrix1));

        System.out.println("The transpose of Matrix B is: ");
        showMatrix("Result", transposeMatrix(matrix2));
    }

    //Transposes matrix
    static int[][] transposeMatrix(int[][] matrix) {

        int[][] res = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                res[j][i] =  matrix[i][j];
            }
        }
        return res;

    }

    public static void determinantOfMatrices(){
        System.out.println("Determinant of Matrix 1: " + determinantOfMatrix1(matrix1));
        System.out.println("Determinant of Matrix 2: " + determinantOfMatrix2(matrix2));
    }

    //Determinant of Matrix 1
    public static int determinantOfMatrix1 (int[][] matrix1) {
        int[][] temporary;
        int result = 0;
        if (matrix1.length == 1) {
            result = matrix1[0][0];
            return (result);
        }
        if (matrix1.length == 2) {
            result = ((matrix1[0][0] * matrix1[1][1]) - (matrix1[0][1] * matrix1[1][0]));
            return (result);
        }
        for (int i = 0; i < matrix1[0].length; i++) {
            temporary = new int[matrix1.length - 1][matrix1[0].length - 1];

            for (int j = 1; j < matrix1.length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    if (k < i) {
                        temporary[j - 1][k] = matrix1[j][k];
                    } else if (k > i) {
                        temporary[j - 1][k - 1] = matrix1[j][k];
                    }
                }
            }
            result += matrix1[0][i] * Math.pow (-1, i) * determinantOfMatrix1 (temporary);
        }
        return (result);
    }

    //Determinant of Matrix 2
    public static int determinantOfMatrix2 (int[][] matrix2) {
        int[][] temporary;
        int result = 0;
        if (matrix2.length == 1) {
            result = matrix2[0][0];
            return (result);
        }
        if (matrix2.length == 2) {
            result = ((matrix2[0][0] * matrix2[1][1]) - (matrix2[0][1] * matrix2[1][0]));
            return (result);
        }
        for (int i = 0; i < matrix2[0].length; i++) {
            temporary = new int[matrix2.length - 1][matrix2[0].length - 1];

            for (int j = 1; j < matrix2.length; j++) {
                for (int k = 0; k < matrix2[0].length; k++) {
                    if (k < i) {
                        temporary[j - 1][k] = matrix2[j][k];
                    } else if (k > i) {
                        temporary[j - 1][k - 1] = matrix2[j][k];
                    }
                }
            }
            result += matrix2[0][i] * Math.pow (-1, i) * determinantOfMatrix1 (temporary);
        }
        return (result);
    }


}


// MAIN CLASS
