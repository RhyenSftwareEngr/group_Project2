package prog2.pregroup;

import java.util.Scanner;

class MatrixOperations {
    public static Scanner sc = new Scanner(System.in); // creating object of Scanner class

    public static void main(String[] args) {
        double ar; // for storing area
        // variable for storing various dimensions of
        // different geometrical figure
        int length, breadth, height, diagonal1, diagonal2;
        int side;
        int radius;


        //Initializes matrix
        Matrices.initializeMatrix();

        while (true) {
            showMenu(); //Displays the menu
            System.out.print("Make your choice: ");
        }
    }

    public static void showMenu() {
        System.out.println("\n\n\n\n\n");
        System.out.println("1: Change size of matrices");
        System.out.println("2: Show current matrices");
        System.out.println("3: Enter elements of Matrix A");
        System.out.println("4: Enter elements of Matrix B");
        System.out.println("5: Add Matrix A and Matrix B");
        System.out.println("6: Subtract Matrix A and Matrix b");
        System.out.println("7: Multiply Matrix A and Matrix B");
        System.out.println("8: Display transpose of Matrix A and Matrix B");
        System.out.println("9: Display the determinants of Matrix A and Matrix B \n if Matrices A and B" +
                "if Matrices A and B are square Matrix");
        System.out.println("0: Quit");

        int ch = sc.nextInt(); // reading user's choice
        switch (ch) {
            case 1:
                System.out.println("\n\n");
                Matrices.initializeMatrix();
                sc.nextLine();
                break;
            case 2:
                System.out.println("\n\n");
                Matrices.showMatrices();
                sc.nextLine();
                break;
            case 3:
                System.out.println("\n\n");
                Matrices.changeMatrix1Value();
                sc.nextLine();
                break;
            case 4:
                System.out.println("\n\n");
                Matrices.changeMatrix2Value();
                sc.nextLine();
                break;
            case 5:
                System.out.println("\n\n");
                Matrices.addMatrices();
                sc.nextLine();
                break;
            case 6:
                System.out.println("\n\n");
                Matrices.subtractMatrices();
                sc.nextLine();
                break;
            case 7:
                System.out.println("\n\n");
                Matrices.multiplyMatrices();
                sc.nextLine();
                break;
            case 8:
                System.out.println("\n\n");
                Matrices.transposeMatrices();
                sc.nextLine();
                break;
            case 9:
                System.out.println("WALA PA");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Invalid choice! Please make a valid choice.");
        }
    }
}

//This is my attempt to help. Everything is pretty scuffed, but I hope it can at least decrease the burden for you guys.

