package ie.atu.week1;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int theArray[];
        int i;

        theArray = new int[10];

        theArray[0] = 100;
        theArray[1] = 200;
        theArray[2] = 300;
        theArray[3] = 400;
        theArray[4] = 500;
        theArray[5] = 600;
        theArray[6] = 700;
        theArray[7] = 800;
        theArray[8] = 900;
        theArray[9] = 1000;

    try {
        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        theArray[10] = input.nextInt();
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Out of Bounds Error\n");
    }

        for(i = 0; i< theArray.length; i++) {
            System.out.println("Element at index "+ i +": "+ theArray[i]);
        }

    }
}
