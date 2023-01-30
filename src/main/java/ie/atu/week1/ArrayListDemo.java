package ie.atu.week1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        int i;


        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        arrayList.add(700);
        arrayList.add(800);
        arrayList.add(900);
        arrayList.add(1000);


        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        arrayList.add(input.nextInt());

        for(i = 0; i < arrayList.size(); i++) {
            System.out.println("Element at index "+ i +": "+ arrayList.get(i));
        }

    }
}

