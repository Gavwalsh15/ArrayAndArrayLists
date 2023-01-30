package ie.atu.week1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        int i;


        arrayList.add(0,100);
        arrayList.add(1,200);
        arrayList.add(2,300);
        arrayList.add(3,400);
        arrayList.add(4,500);
        arrayList.add(5,600);
        arrayList.add(6,700);
        arrayList.add(7,800);
        arrayList.add(8,900);
        arrayList.add(9,1000);


        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        arrayList.add(10, input.nextInt());

        for(i = 0; i < arrayList.size(); i++) {
            System.out.println("Element at index "+ i +": "+ arrayList.get(i));
        }

    }
}

