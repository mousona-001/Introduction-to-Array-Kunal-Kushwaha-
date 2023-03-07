import java.util.ArrayList;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements:
        list.add(0);
        list.add(1);
        list.add(3);
        System.out.println(list);

        // or get input from user
//        Scanner scn = new Scanner(System.in);
//        for(int i = 0; i<5; i++){
//            list.add(scn.nextInt());
//        }
//        for(int i = 0; i<5; i++){
//            System.out.println(list.get(i));
//        }
//        System.out.println();


//        // get elements:
        int elements = list.get(2);
        System.out.println(elements);
//
//        // add element in between:
//        list.add(2,5);
//        System.out.println(list);
//
//        // set elements:
//        list.set(0,5);
//        System.out.println(list);
//
//        // delete elements:
//        list.remove(3);
//        System.out.println(list);
//
//        // size
//        int size = list.size();
//        System.out.println(size);



    }
}
