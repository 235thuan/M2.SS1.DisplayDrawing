import java.util.Scanner;

public class DisplayDrawing {
    public static void main(String[] args) {
        int choice, sizeLength;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Draw the triangle bottom left");
        System.out.println("2.Draw the square and rectangle");
        System.out.println("3.Draw the triangle top left");
        System.out.println("4.Draw the isosceles triangle");
        System.out.println("Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        System.out.println("Enter height: ");
        sizeLength = input.nextInt();
        int lengthN = sizeLength;
        switch (choice) {
            case 1:
                System.out.println("Draw the triangle bottom left");
                for (int length = 0; length <= lengthN; length++) {
                    for (int width = 0; width < length; width++) {
                        String i = " * ";
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Draw the square and rectangle");
                for (int length = 0; length < lengthN; length++) {
                    for (int width = 0; width < lengthN; width++) {
                        String i = " * ";
                        System.out.print(i);
                    }
                    System.out.println();
                }

                break;
            case 3:
                System.out.println("Draw the triangle top left");
                for (int length = lengthN; length >= 0; length--) {
                    for (int width = 0; width <= length; width++) {
                        String i = " * ";
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Draw the isosceles triangle");

                for (int length = 0; length <= lengthN; length++) {
                    System.out.println();
                    for (int width = 0; width < lengthN - length || width > lengthN + length; width++) {
                        System.out.print(" ");
                    }
                    for (int width2 = 0; width2 <=  2*length - lengthN; width2++) {
                        System.out.print("*");
                    }
                }

                // cach khac


//                for (int length = 0; length <= lengthN; length++) {
//                    System.out.println();
//                    for (int width = 0; width <= lengthN * 2 + 1; width++) {
//                        if (width < lengthN - length | width > lengthN + length)
//                            System.out.print(" ");
//                        else System.out.print("*");
//                    }
//                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice ! ");
        }
    }
}



