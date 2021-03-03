package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseArrayList {
    public static void main(String[] args) {

        System.out.println("Please enter input limit:");

        int Limit = 0;
        Scanner inputsize = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        List <Integer> list = new ArrayList<>();

        System.out.println("Please enter some number: ");
        for (int i =0; i<5; i++){
            list.add(sc.nextInt());
        }
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        inputsize.close();
        sc.close();
    }
}
