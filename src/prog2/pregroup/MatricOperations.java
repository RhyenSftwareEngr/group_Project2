package prog2.pregroup;

import java.util.Scanner;

class MatricOperations {
    public static void main(String[] args) {

        int ch; // for storing user's choice
        double ar; // for storing area
        // variable for storing various dimensions of
        // different geometrical figure
        int length, breadth, height, diagonal1, diagonal2;
        int side;
        int radius;
        Scanner sc = new Scanner(System.in); // creating object of Scanner class
        // displaying the menu
        System.out.println("1: Enter Elements of Matrix A");
        System.out.println("2: Enter elements of Matrix B");
        System.out.println("3: Add Matrix A and Matrix B");
        System.out.println("4: Subtract Matrix A and Matrix b");
        System.out.println("5: Multiply Matrix A and Matrix B");
        System.out.println("6: Display transpose of Matrix A and Matrix B");
        System.out.println("7: Display the determinants of Matrix A and Matrix B \n if Matrices A and B" +
                "if Matrices A and B are square Matrix");
        System.out.println("8: Quit");
        lp:
        while (true) // labeling the while loop
        {
            System.out.print("Make your choice: ");
            ch = sc.nextInt(); // reading user's choice
            switch (ch) {
                case 1:
                    System.out.println("WALA PA");
                    break;
                case 2:
                    System.out.println("WALA PA");
                    break;
                case 3:
                    System.out.println("WALA PA");
                    break;
                case 4:
                    System.out.println("WALA PA");
                    break;
                case 5:
                    System.out.println("WALA PA");

                    break;
                case 6:
                    System.out.println("WALA PA");

                    break;
                case 7:
                    System.out.println("WALA PA");
                case 8:
                    break lp;
                default:
                    System.out.println("Invalid choice! Please make a valid choice. \n\n");
            }
        }


    }
}


