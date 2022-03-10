import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Calculator myCalculator = new Calculator();

        System.out.println("Please choose which option you want: \n1.Sum of 2 numbers? \n2.Difference of 2 numbers? \n3.Multiplying two numbers? \n4.Dividing two numbers? \n5.Sum of N elements? \n6.Multiplication of N numbers? \n7.Area of a circle? ");
        int option = Integer.parseInt(reader.nextLine());
        if (option == 1) {
            myCalculator.setNumberA(numberA());
            myCalculator.setNumberB(numberB());
            System.out.println("The result of sum of 2 numbers is: " + myCalculator.sum());
        } else if (option == 2) {
            myCalculator.setNumberA(numberA());
            myCalculator.setNumberB(numberB());
            System.out.println("The result of difference of 2 numbers is: " + myCalculator.minus());
        } else if (option == 3) {
            myCalculator.setNumberA(numberA());
            myCalculator.setNumberB(numberB());
            System.out.println("The result of multiplying two numbers is: " + myCalculator.multiply());
        } else if (option == 4) {
            myCalculator.setNumberA(numberA());
            myCalculator.setNumberB(numberB());
            System.out.println("The result of dividing two numbers is: " + myCalculator.divide());
        } else if (option == 5) {
            while (true) {
                myCalculator.add(numberA());
                System.out.println(myCalculator.getResult());
                System.out.println("Do you want to continue adding numbers? Y/N");
                if ((reader.nextLine().charAt(0)) == 'N' || (reader.nextLine().charAt(0)) == 'n') {
                    break;
                }
            }
        } else if (option == 6) {
            while (true) {
                myCalculator.multiplication(numberA());
                System.out.println(myCalculator.getResult());
                System.out.println("Do you want to continue multiplication numbers? Y/N");
                if ((reader.nextLine().charAt(0)) == 'N' || (reader.nextLine().charAt(0)) == 'n') {
                    break;
                }
            }
        } else if (option == 7) {
            myCalculator.setRadius(radius());
            System.out.println("The result of the area of a circle is: " + myCalculator.circleArea());
        }


    }

    public static int numberA() {
        System.out.println("Please enter number A: ");
        Scanner reader = new Scanner(System.in);
        int numberA = Integer.parseInt(reader.nextLine());
        return numberA;
    }

    public static int numberB() {
        System.out.println("Please enter number B: ");
        Scanner reader = new Scanner(System.in);
        int numberB = reader.nextInt();
        return numberB;
    }

    public static int radius() {
        System.out.println("Please enter a radius");
        Scanner reader = new Scanner(System.in);
        int numberRadius = reader.nextInt();
        return numberRadius;
    }
}
