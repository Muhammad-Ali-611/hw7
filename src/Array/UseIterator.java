package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class UseIterator {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        cityList.add("CA");
        cityList.add("FL");
        cityList.add("UK");
        cityList.add("PK");
        cityList.add("Canada");

        System.out.println("Using Iterator & whileLoop");
        ListIterator<String> it = cityList.listIterator();
        while (((ListIterator<?>)it).hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Using for each loop");
         for (String city: cityList) {
             System.out.println("city");
         }
         System.out.println("Using for loop");
         for (int i=0; i< cityList.size(); i++){
             System.out.println(cityList.get(i));
         }


    }
}
