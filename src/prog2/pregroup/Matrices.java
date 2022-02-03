package prog2.pregroup;

import java.util.Scanner;
public class Matrices {
   static int r, c, i, j;
     public static void addMatrices() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Adding matrices\n Enter the size of the matrix");
        System.out.println(" Example 2 x 2");
        r = scan.nextInt();
        c = scan.nextInt();
        while (r != c) {
            System.err.println("The size must be the same!!!!!!!\n Input again!!");
            r = scan.nextInt();
            c = scan.nextInt();
        }
        int mat1[][] = new int[r][c];
        int mat2[][] = new int[r][c];
        int res[][] = new int[r][c];
        System.out.println("Enter the values of matrix 1 from(left to right) first row column 1 " +
                "till the last row-last column format");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                mat1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the values of matrix 2 from(left to right) first row column 1 " +
                "till the last row-last column format");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                mat2[i][j] = scan.nextInt();
            }
        }
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("The sum is: ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// MAIN CLASS
