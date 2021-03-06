package prog2.pregroup;

import java.util.Scanner;

class MatrixOperations {
    public static Scanner sc = new Scanner(System.in); // creating object of Scanner class
    static  String smile = "\uD83D\uDE0A";
    static String love = "\uD83D\uDC9C";
    static String woman = "\uD83D\uDC67";
    static String man = "\uD83D\uDC66";
    public static void main(String[] args) {
        showIntroduction();
        sc.nextLine();
        Matrices.initializeMatrix();

        while (true) {
            showMenu(); //Displays the menu
            System.out.print("Make your choice: ");
        }
    }

    public static void showIntroduction() {
        System.out.println("\n");
        System.out.println("College of Information and Computing Sciences");
        System.out.println(" Saint Louis University");
        System.out.println(" Baguio City ");
        System.out.println("---------------------------------------------");
        for(int index=0; index < 10; index++){
            System.out.print(smile + love + smile + "");
        }
        System.out.println("\n");
        System.out.println(" Group 4 "+ smile);
        System.out.println(" Developers: \n Aliyah Javier" + woman + "\n Eduard Tadeo" + man
                + "\n Lawrence Miguel" + man + "\n Rhyen Natividad" + man);
        System.out.println("\n");
        System.out.print("Please press a key to start the program...");
    }

    public static void showMenu() {
        System.out.println();
        System.out.println("1: Change size of matrices");
        System.out.println("2: Show current matrices");
        System.out.println("3: Enter elements of Matrix A");
        System.out.println("4: Enter elements of Matrix B");
        System.out.println("5: Add Matrix A and Matrix B");
        System.out.println("6: Subtract Matrix A and Matrix b");
        System.out.println("7: Multiply Matrix A and Matrix B");
        System.out.println("8: Display transpose of Matrix A and Matrix B");
        System.out.println("9: Display the determinants of Matrix A and Matrix B \n if Matrices A and B" +
                " if Matrices A and B are square Matrix");
        System.out.println("10: Quit");


        int ch = Integer.parseInt(sc.next()); // reading user's choice
        switch (ch) {
            case 1:
                System.out.println("\n\n");
                Matrices.initializeMatrix();
                sc.nextLine();
                System.out.print("press enter to continue..." + smile);
                sc.nextLine();
                break;
            case 2:
                System.out.println("\n\n");
                Matrices.showMatrices();
                sc.nextLine();
                System.out.print("press enter to continue...");
                sc.nextLine();
                break;
            case 3:
                System.out.println("\n\n");
                Matrices.changeMatrix1Value();
                sc.nextLine();
                System.out.print("press enter to continue...");
                sc.nextLine();
                break;
            case 4:
                System.out.println("\n\n");
                Matrices.changeMatrix2Value();
                sc.nextLine();
                System.out.print("press enter to continue...");
                sc.nextLine();
                break;
            case 5:
                System.out.println("\n\n");
                Matrices.addMatrices();
                sc.nextLine();
                System.out.print("press enter to continue...");
                sc.nextLine();
                break;
            case 6:
                System.out.println("\n\n");
                Matrices.subtractMatrices();
                sc.nextLine();
                System.out.print("press enter to continue...");
                sc.nextLine();
                break;
            case 7:
                System.out.println("\n\n");
                Matrices.multiplyMatrices();
                sc.nextLine();
                System.out.print("press enter to continue...");
                sc.nextLine();
                break;
            case 8:
                System.out.println("\n\n");
                Matrices.transposeMatrices();
                sc.nextLine();
                System.out.print("press enter to continue...");
                sc.nextLine();
                break;
            case 9:
                System.out.println("\n\n");
                Matrices.determinantOfMatrices();
                System.out.print("press enter to continue...");
                sc.nextLine();
                sc.nextLine();
                break;
            case 10:
                System.out.println("\nThank your for using our program! Feel free to come back.");
                for(int index=0; index < 35; index++){
                    System.out.print(smile + "");
                }
                System.exit(0);
            default:
                System.err.println("Invalid choice! Please make a valid choice.");
        }
    }
}

//This is my attempt to help. Everything is pretty scuffed, but I hope it can at least decrease the burden for you guys.

//No, you've done enough my friend